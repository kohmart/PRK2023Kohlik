package cz.tul.kohlik.kohlik;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KohlikVisitorImpl extends KohlikBaseVisitor<String> {

    private String handleNum(String left, String operator, String right) {
        int LI = 0;
        double LD = 0;
        boolean isLeftDouble = false;
        NumberFormat format = NumberFormat.getInstance(Locale.getDefault());
        if (left != null) {
            if (left.contains(".") || left.contains(",")) {
                isLeftDouble = true;
                try {
                    Number number = format.parse(left);
                    LD = number.doubleValue();
                } catch (ParseException e) {
                    System.out.println("Left number is not in the correct format");
                    return null;
                }
            } else {
                LI = Integer.parseInt(left);
            }
        }

        int RI = 0;
        double RD = 0;
        boolean isRightDouble = false;
        if (right.contains(".") || right.contains(",")) {
            isRightDouble = true;
            try {
                Number number = format.parse(right);
                RD = number.doubleValue();
            } catch (ParseException e) {
                System.out.println("Right number is not in the correct format");
                return null;
            }
        } else {
            RI = Integer.parseInt(right);
        }

        switch (operator) {
            case "+" -> {
                if (isRightDouble || isLeftDouble) {
                    return Double.toString((LI + LD) + (RI + RD));
                }
                return Integer.toString(LI + RI);
            }
            case "*" -> {
                if (isRightDouble || isLeftDouble) {
                    return Double.toString((LI + LD) * (RI + RD));
                }
                return Integer.toString(LI * RI);
            }
            case "^" -> {
                if (isRightDouble) {
                    return Integer.toString((int) Math.ceil(RD));
                }
                return Integer.toString(RI);
            }
            default -> {
                System.out.println("Calculator does not support " + operator);
                return null;
            }
        }
    }

    private String handleHexaPlus(String left, String right) {
        int LI = 0x0;
        if (left != null) LI = Integer.parseInt(left.substring(2), 16);
        int RI = Integer.parseInt(right.substring(2), 16);

        if ((LI % 2) != 0 ) {
            return null;
        }
        
        if ((RI % 2) != 0 ) {
            return null;
        }
        
        return "0x" + Integer.toString(LI + RI, 16);
    }

    private String caesarString(String group, int i) {
        StringBuilder sb = new StringBuilder();
        for (char c : group.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    sb.append((char) ('A' + (c - 'A' + i) % 26));
                } else {
                    sb.append((char) ('a' + (c - 'a' + i) % 26));
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    @Override
    public String visitOpexpr(KohlikParser.OpexprContext ctx) {

        String left = null;
        if (ctx.left != null) {
            left = this.visit(ctx.left);
        }
        String right = null;
        if (ctx.right != null) {
            right = this.visit(ctx.right);
        }

        if (ctx.operator == null) {
            System.out.print("An operator of +, -, ++, ^ is required to perform the operation\n");
            return null;
        }
        String operator = ctx.operator.getText();

        //Hexaplus
        if (operator.equals("++") && left.toLowerCase(Locale.ROOT).startsWith("0x") && right.toLowerCase(Locale.ROOT).startsWith("0x")) {
            return handleHexaPlus(left, right);
        }

        return handleNum(left, operator, right);

    }

    @Override
    public String visitParexpr(KohlikParser.ParexprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public String visitLeafexpr(KohlikParser.LeafexprContext ctx) {

        if (ctx.getText().toLowerCase(Locale.ROOT).startsWith("cae(") && ctx.getText().endsWith(")")) {
            Pattern pattern = Pattern.compile("\"(.*)\",(\\d*)", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(ctx.getText().substring(4, ctx.getText().length() - 1));
            boolean matchFound = matcher.find();
            if (matchFound) {
                return caesarString(matcher.group(1), Integer.parseInt(matcher.group(2)));
            } else {
                System.out.println("Caesar cipher is not in the correct format");
                return null;
            }
        }

        return ctx.getText();
    }
}
