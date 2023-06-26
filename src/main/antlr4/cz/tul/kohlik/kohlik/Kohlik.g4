grammar Kohlik;

//Kořenové pravidlo
root:	(expr NEWLINE)+ ;

//Výrazy
expr:	'(' expr ')'                            #parexpr
    |   operator=UPPER right=expr               #opexpr
    |   left=expr operator=TIMES right=expr     #opexpr
    |	left=expr operator=PLUS right=expr      #opexpr
    |	left=expr operator=HEXAPLUS right=expr  #opexpr
    |   LIST                                    #leafexpr
    ;

//Datové typy
LIST            : INT
                | HEX
                | STRING
                | CAESAR
                | FRACTION_NUMBER
                ;

//Operátory
UPPER           : '^';
PLUS            : '+';
TIMES           : '*';
HEXAPLUS        : '++';

//Funkce
CAESAR          : 'cae(' STRING ',' INT ')';

//Int
NO_ZERO_DIGIT   : ['1'-'9'];
DIGIT           : '0' | NO_ZERO_DIGIT;
INT_DEFAULT     : NO_ZERO_DIGIT DIGIT*;
INT             : INT_DEFAULT;

//FractionNumber
FRACTION_NUMBER : DIGIT* ('.' | ',') DIGIT*;

//Hexadecimal
HEX_DEFAULT     : '0' ('x'|'X') ('0'..'9'|'a'..'f'|'A'..'F')+;
HEX             : HEX_DEFAULT;

//String
STRING          : '"' (~["])* '"';

//Newline a mezery
NEWLINE         : [\r\n]+ ;
WS              : [ \t]+ -> skip ;
