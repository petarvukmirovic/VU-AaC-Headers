grammar HeadersGrammar;

import HeadersLex;

header: (declaration | comm)*;
comm : COMMENT;
declaration: ret_type IDENTIFIER '(' arguments ')' ';' ;

/* Why couldn't we rewrite it as: argument? (',' argument)*/
arguments: argument (',' argument)* #arglist
           | /*epsilon*/            #noargs;

argument: type IDENTIFIER ('[' ']')*;
ret_type: 'void' #voidRet
          | type #regularRet;
type: TYPE '*'*;