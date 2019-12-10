/******************************************************
 * A multi-line Javadoc-like comment about my grammar *
 ******************************************************/
grammar CMCGrammar;

@header {
package MCGrammar;
}

prog            : includes? globals? functions? main
                ;

includes        : (INCLUDE STR)+
                ;

globals         : GLOB OP vars CL
                ;

vars            : (type ids EOL)+
                ;

ids             : ID
                | ID SEP ids
                ;

functions       : function+
                ;

function        : type ID OPP ((type ID SEP)* type ID)? CLP block
                ;

main            : MAIN block
                ;

block           : OP line+ CL
                ;

line            : vars
                | input EOL
                | output EOL
                | expr EOL?
                | ifstmt
                | whilestmt
                | forstmt
                | callfunction EOL
                | retrn
                ;


input           : READ OPP ID CLP 
                ;

output          : WRITE OPP ID CLP
                | WRITE OPP STR CLP
                ;

expr            : ID assignOP mag
                | ID AT boolexpr
                | mag
                ;

boolexpr        : TRUE
                | FALSE
                ;

ifstmt          : IF OPP expr CLP block 
                | IF OPP expr CLP block ELSE block
                ;

whilestmt       : WHILE OPP expr CLP block
                ;

forstmt         : FOR OPP type expr RNG NUM CLP block
                ;

callfunction    : ID CALL ID OPP ((ID SEP)* ID) CLP
                | ID CALL ID OPP ((NUM SEP)* NUM) CLP
                | ID OPP CLP
                ;

retrn           : RET ID EOL
                | RET expr EOL
                ;

type            : INT
                | FLOAT
                | BOOLEAN
                | STRING
                ;

assignOP        : AT
                | NEG
                | EQ
                | LESS
                | LESSEQ
                | GREATER
                | GREATEREQ
                ;

mag             : mag '+' term
                | mag '-' term
                | term
                ;

term            : term '*' factor
                | term '/' factor
                | term SEP factor
                | factor
                ;

factor          : OPP expr CLP
                | ID
                | NUM
                | STR
                ;


INCLUDE     : '#Include';
GLOB        : 'global';
MAIN        : 'main';
FUNCTION    : 'function';
WS: (' '|'\t')+{skip();};
NL: '\r'?'\n'+{skip();};
LC: '//' ~[\r\n]*{skip();};

IF          : 'if';
ELSE        : 'else';
FOR         : 'for';
WHILE       : 'while';
WRITE       : 'writeln';
READ        : 'readln';
RET         : 'return';

OP          : '{';
CL          : '}';
SEP         : ',';
OPP         : '(';
CLP         : ')';
EOL         : ';';
AT          : '=';
RNG         : '...';
NEG         : '!=';
EQ          : '==';
LESS        : '<';
LESSEQ      : '<=';
GREATER     : '>';
GREATEREQ   : '>=';
CALL        : '->';
TRUE        : 'true';
FALSE       : 'false';



INT         : 'int';
FLOAT       : 'float';
BOOLEAN     : 'bool';
STRING      : 'string';

ID: [a-zA-Z][0-9a-zA-Z]*;
NUM: [+-]?[0-9]+('.'[0-9]+)?;
STR: '"'[a-zA-Z0-9 ]?[ a-zA-Z0-9_.:]*'"';


