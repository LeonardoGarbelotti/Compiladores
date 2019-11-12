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

function        : FUNCTION ID OPP ((type ID SEP)* type ID)? CLP block
                ;

main            : MAIN block
                ;

block           : OP line+ CL
                ;

line            : declaration
                | input
                | output
                | expr
                | ifstmt
                | whilestmt
                | forstmt
                ;

declaration     : vars+
                ;

input           : READ OPP ID CLP EOL
                ;

output          : WRITE OPP ID CLP EOL
                ;

expr            : ID assignOP ID EOL
                | ID assignOP NUM EOL
                | ID assignOP mag
                | mag
                ;

ifstmt          : IF OPP expr CLP block 
                | IF OPP expr CLP block ELSE block
                ;

whilestmt       : WHILE OPP expr CLP block
                ;

forstmt         : FOR OPP type expr RNG NUM CLP block
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
                | factor
                ;

factor          : OPP expr CLP
                | '-' factor
                | '+' factor
                | ID
                | NUM
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


INT         : 'int';
FLOAT       : 'float';
BOOLEAN     : 'bool';
STRING      : 'string';

ID: [a-zA-Z][0-9a-zA-Z]*;
NUM: [+-]?[0-9]+('.'[0-9]+)?;
STR: '"'(~'"'|'"')*'"';

