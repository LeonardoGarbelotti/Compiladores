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

line            : vars                                              #varDeclart
                | attribution EOL                                   #attrLine
                | input EOL                                         #inputLine         
                | output EOL                                        #outputLine
                | expr EOL                                          #exprLine
                | ifstmt                                            #ifLine
                | whilestmt                                         #whileLine
                | forstmt                                           #forLine
                | retrn EOL                                         #returnLine
                | callfunction EOL                                  #funcLine
                ;

attribution     : ID AT expr
                ;

input           : READ OPP ID CLP                                   #inputValue
                ;

output          : WRITE OPP ID CLP                                  #printId
                | WRITE OPP STR CLP                                 #printStr
                ;

ifstmt          : IF OPP cond CLP bloco1=block                      #iffStmt
                | IF OPP cond CLP bloco1=block ELSE bloco2=block    #ifStmtElse
                ;

cond            : expr                                              #condExpr
                | expr operators=assignOP expr                      #condOprtors      
                ;

whilestmt       : WHILE OPP cond CLP block                          #whileeStmt
                ;

forstmt         : FOR OPP type cond RNG NUM CLP block               #forrStmt
                ;

callfunction    : ID CALL ID OPP ((ID SEP)* ID) CLP
                | ID CALL ID OPP ((NUM SEP)* NUM) CLP
                | ID OPP CLP
                ;

retrn           : RET ID 
                | RET expr 
                ;

type            : INT
                | FLOAT
                | BOOLEAN
                | STRING
                ;

assignOP        : AT
                | EQ
                | NEG
                | LESS
                | LESSEQ
                | GREATER
                | GREATEREQ
                ;

expr            : term PLUS expr                                    #exprPlus
                | term MINUM expr                                   #exprMinum
                | term                                              #exprTerm
                ;

term            : term MULT factor                                  #termMult
                | term DIV factor                                   #termDiv
                | factor                                            #termFactor
                ;

factor          : OPP expr CLP                                      #exprParnt
                | ID                                                #factorId
                | NUM                                               #factorNum
                | STR                                               #factorStr
                | boolexpr                                          #factorBool
                ;

boolexpr        : TRUE                                              #trueValue
                | FALSE                                             #falseValue
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
PLUS        : '+';
MINUM       : '-';
MULT        : '*';
DIV         : '/';



INT         : 'int';
FLOAT       : 'float';
BOOLEAN     : 'bool';
STRING      : 'string';

ID: [a-zA-Z][0-9a-zA-Z]*;
NUM: [+-]?[0-9]+('.'[0-9]+)?;
STR: '"'[a-zA-Z0-9 ]?[ a-zA-Z0-9_.:]*'"';


