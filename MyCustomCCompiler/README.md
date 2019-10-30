# MDMCC
Código para o compilador

# Gramática
//maiúscula para token e minúsculo são variáveis

prog: includes? globals? functions? main
includes: (INCLUD STR)+
globals: GLOB OP vars CL
vars : (type ids EOL)+
ids : ID | ID SEP ids
functions : function+
function : 
    FUNCTION ID OPParent ((type ID SEP)* type ID)? CLP block
main : MAIN block
block: OPCB line+ CLCB
line : declaration | input | output | atrib | ifstmt | whilestmt | forstmt 

INCLUDE : '#Include'
STR : '"'.?\*'"'
GLOB: 'global'
OP : '{'
CL : '}'
SEP ','
