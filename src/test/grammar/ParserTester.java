package test.grammar;

import language.grammar.LanguageLexer;
import language.grammar.LanguageParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.text.ParseException;

/**
 * Test class that tests the parser for the language.
 */
public class ParserTester {

    /**
     * Test method that checks if an example program can be parsed.
     * @throws ParseException
     */
    @Test
    public void test() throws ParseException {
        String test1 = "klasse Test{ voeruit() { getal number is 1; } }";
        parse(test1, "program");
    }

    /**
     * Parse method that parses a given testprogram with the option to a ParseTree
     * @param testProgram the given program to be parsed
     * @param parseOption the option to which the program needs to be parsed with, either program, statement or expression
     * @return the ParseTree of the given program.
     */
    private ParseTree parse(String testProgram, String parseOption) {
        CharStream input = new ANTLRInputStream(testProgram);
        Lexer lexer = new LanguageLexer(input);
        TokenStream tokens = new CommonTokenStream(lexer);
        LanguageParser parser = new LanguageParser(tokens);

        ParseTree result = null;
        if(parseOption.equals("program")) {
            result = parser.program();
        } else if (parseOption.equals("stat")) {
            result = parser.stat();
        } else { // Parse Expression.
            result = parser.expr();
        }

        return result;
    }

}
