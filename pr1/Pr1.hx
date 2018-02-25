// Project Milestone 1 for Compiler Construction

module edu.nyu.yunjian.Pr1 {

/* LEXICAL ANALYSIS. */
space [ \t\n] | '//'.* | "/*"[^/]*(/[^\*]+)*[^/]*"*/";

token Identifier | [A-Za-z_\$][A-Za-z0-9_\$]* ;
token Integer    | ⟨Digit⟩+ ;
token String     | \"([^\\\n]|(\\\")|(\\\\)|(\\n)|(\\\n)|(\\t)|(\\[0-7][0-7]?[0-7]?)|(\\[xX][0-9a-fA-F][0-9a-fA-F]))*\" ;

token fragment Digit  | [0-9] ;

/* SYNTAX ANALYSIS. */

sort Type  | ⟦int⟧@2
           | ⟦char⟧@2
           | ⟦(⟨Type⟩)⟧@2
           | ⟦⟨Type@1⟩(⟨Typehelper⟩)⟧@1
           | ⟦*⟨Type⟩⟧@1
           ;

sort Typehelper | ⟦⟨Type⟩⟧
                | ⟦⟨Type⟩,⟨Typehelper⟩⟧
                | ⟦⟧
                ;

sort Ivalue | ⟦⟨Identifier⟩⟧
            | ⟦*⟨Expr⟩⟧
            ;

sort Expr  | ⟦⟨Identifier⟩⟧@4
           | ⟦⟨String⟩⟧@4
           | ⟦⟨Integer⟩⟧@4
           | ⟦⟨Expr@4⟩(⟨Exprhelper⟩)⟧@4
           | ⟦null(⟨Type⟩)⟧@4
           | ⟦sizeof(⟨Type⟩)⟧@4
           | ⟦!⟨Expr⟩⟧@3
           | ⟦-⟨Expr⟩⟧@3
           | ⟦+⟨Expr⟩⟧@3
           | ⟦*⟨Expr⟩⟧@3
           | ⟦&⟨Expr⟩⟧@3
           | ⟦⟨Expr@3⟩*⟨Expr@4⟩⟧@3
           | ⟦⟨Expr@3⟩/⟨Expr@4⟩⟧@3
           | ⟦⟨Expr@3⟩%⟨Expr@4⟩⟧@3
           | ⟦⟨Expr@2⟩+⟨Expr@4⟩⟧@2
           | ⟦⟨Expr@2⟩-⟨Expr@4⟩⟧@2
           | ⟦⟨Expr@2⟩<⟨Expr@4⟩⟧@2
           | ⟦⟨Expr@2⟩>⟨Expr@4⟩⟧@2
           | ⟦⟨Expr@2⟩<=⟨Expr@4⟩⟧@2
           | ⟦⟨Expr@2⟩>=⟨Expr@4⟩⟧@2
           | ⟦⟨Expr@2⟩==⟨Expr@4⟩⟧@2
           | ⟦⟨Expr@2⟩!=⟨Expr@4⟩⟧@2
           | ⟦⟨Expr@2⟩&&⟨Expr@1⟩⟧@1
           | ⟦⟨Expr@2⟩||⟨Expr@1⟩⟧@1
           ;

sort Exprhelper | ⟦⟨Expr⟩⟧
                | ⟦⟨Expr⟩,⟨Exprhelper⟩⟧
                | ⟦⟧
                ;

sort Statement  | ⟦var ⟨Type⟩ ⟨Identifier⟩ ;⟧@7
                | ⟦⟨Ivalue⟩ =  ⟨Expr⟩ ;⟧@6
                | ⟦if ( ⟨Expr⟩ )  ⟨Statement⟩ ⟧@5
                | ⟦if ( ⟨Expr⟩ )  ⟨Statement⟩ else ⟨Statement⟩⟧@4
                | ⟦while ( ⟨Expr⟩ )  ⟨Statement⟩⟧@3
                | ⟦return ⟨Expr⟩ ;⟧@2
                | ⟦{ ⟨Statementhelper⟩ } ⟧@1
                ;

sort Statementhelper | ⟦⟨Statement⟩⟧
                | ⟦⟨Statement⟩ ⟨Statementhelper⟩⟧
                | ⟦⟧
                ;



sort Declaration | ⟦function ⟨Type⟩ ⟨Identifier⟩ (⟨Declarationhelper⟩) {⟨Statementhelper⟩}⟧
                 ;

sort Declarationhelper | ⟦⟨Type⟩ ⟨Identifier⟩⟧
                       | ⟦⟨Type⟩ ⟨Identifier⟩,⟨Declarationhelper⟩⟧
                       | ⟦⟧
                       ;


sort Programhelper | ⟦⟨Declaration⟩⟧
                   | ⟦⟨Declaration⟩,⟨Programhelper⟩⟧
                   | ⟦⟧
                   ;
                   
main sort Program | ⟦⟨Declaration⟩⟨Programhelper⟩⟧@1
                  ;
}