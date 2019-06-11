grammar Language;

import LanguageVocab;

program: CLASS ID LCURLY body RCURLY EOF;

body: programVarDeclaration* main?;

main: MAIN LPAR RPAR LCURLY stat+ RCURLY;

programVarDeclaration: GLOBAL type ID (ASSIGN expr)? SEMI;

varDeclaration: type ID (ASSIGN expr)? SEMI;

stat
    :   varDeclaration                              #declStat
    |   ID ASSIGN expr SEMI                         #assignStat
    |   IF LPAR expr RPAR stat (ELSE stat)?         #ifStat
    |   WHILE LPAR expr RPAR stat                   #whileStat
    |   LCURLY stat* RCURLY                         #blockStat
    ;

expr
    : NOT expr                                      #notExpr
    | MINUS expr                                    #minusExpr
    | expr (PLUS | MINUS) expr                      #addExpr
    | expr TIMES expr                               #multExpr
    | expr (LT | GT| EQ | NE | LE | GE) expr        #compExpr
    | expr AND expr                                 #andExpr
    | expr OR expr                                  #orExpr
    | LPAR expr RPAR                                #parExpr
    | (TRUE | FALSE)                                #constExpr
    | NUM                                           #numExpr
    | ID                                            #idExpr
    ;


type    : INT                                       #integerType
        | BOOL                                      #booleanType
        | VOID                                      #voidType
        ;
