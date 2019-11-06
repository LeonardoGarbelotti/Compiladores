# MDMCC
Código para o compilador

## Gramática
###maiúscula para token e minúsculo são variáveis

```
grammar Basic;

@header {
package basicInterpreter.parser;
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

main             : MAIN block
                ;

block           : OP line+ CL
                ;

line            : declaration
                | input
                | output
                | atrib
                | ifstmt
                | whilestmt
                | forstmt
                ;

declaration     : vars+
                ;

input           : READ OPP ID CLP
                ;

output          : WRITE OPP ID CLP
                ;

atrib           : ID AT ID 
                | ID AT NUM
                ;

ifstmt          : IF OPP expr CLP block 
                |  IF OPP expr CLP block ELSE block
                ;

whilestmt       : WHILE OPP expr CLP block
                ;

forstmt         : FOR OPP type atrib RNG NUM CLP block
                ;

INCLUDE     : '#Include';
STR         : '"'.?*'"';
GLOB        : 'global';
OP          : '{';
CL          : '}';
SEP         : ',';
OPP         : '(';
CLP         : ')';
EOL         : ';';
AT          :'=';
RNG         : '...';
MAIN        : 'main';
IF          : 'if';
ELSE        : 'else';
FUNCTION    : 'function';
READ        : 'readln';
WRITE       : 'writeln';
ID: [a-zA-Z][0-9a-zA-Z]*;
NUM: [+-]?[0-9]+('.'[0-9]+)?;

```
