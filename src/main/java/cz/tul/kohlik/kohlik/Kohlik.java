package cz.tul.kohlik.kohlik;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kohlik {

    public static void main(String[] args) {

        Kohlik calculator = new Kohlik();

        String basePath = new File("").getAbsolutePath();

        String validTestPath = "\\src\\main\\resources\\test_ok.txt";
        String invalidTestPath = "\\src\\main\\resources\\test_nook.txt";

        System.out.println("Testing valid expressions");
        File validFile = new File(basePath+validTestPath);
        try {
            Scanner validFileReader = new Scanner(validFile);
            while (validFileReader.hasNextLine()){
                String line = validFileReader.nextLine();
                System.out.println(line + " = " + calculator.calculate(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nTesting invalid expressions");
        File invalidFile = new File(basePath+invalidTestPath);
        Scanner invalidFileReader;
        try {
            invalidFileReader = new Scanner(invalidFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        while (invalidFileReader.hasNextLine()){
            String res = null;
            String line = null;
            try {
                line = invalidFileReader.nextLine();
                res = calculator.calculate(line);
            }
            catch (Exception e){
                System.out.println("Expression " + line + " couldn't be processed. Exception:" + e);
            }
            System.out.println(line + " = " + res);
        }
    }

    private String calculate(String source) {
        CodePointCharStream input = CharStreams.fromString(source);
        return compile(input);
    }

    private String compile(CharStream source) {
        KohlikErrorListener errorListener = new KohlikErrorListener();

        KohlikLexer lexer = new KohlikLexer(source);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        KohlikParser parser = new KohlikParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        ParseTree tree = parser.expr();
        KohlikVisitorImpl visitor = new KohlikVisitorImpl();
        return visitor.visit(tree);
    }
}
