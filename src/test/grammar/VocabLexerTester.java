package test.grammar;

import language.grammar.LanguageVocab;
import org.junit.Test;

/**
 * Test that tests if all the texts can be parsed to the correct tokens.
 */
public class VocabLexerTester {
    private static LexerTester lextest = new LexerTester(LanguageVocab.class);

    /**
     * Test whether the given sequence is accepted by the LanguageLexer.
     */
    @Test
    public void testAccepted() {
        lextest.correct("min niet of plus en is keer");
    }

    /**
     * Test whether the given expressions give the correct tokens.
     */
    @Test
    public void testYieldsEquals() {
        lextest.yields("gelijk aan groter of gelijk aan groter dan kleiner of gelijk aan kleiner dan niet gelijk aan",
                LanguageVocab.EQ, LanguageVocab.GE, LanguageVocab.GT, LanguageVocab.LE, LanguageVocab.LT,
                LanguageVocab.NE);
    }

    /**
     * Test whether the given expressions give the correct tokens.
     */
    @Test
    public void testYieldsBrackets() {
        lextest.yields("{ } ( ) [ ]", LanguageVocab.LCURLY, LanguageVocab.RCURLY, LanguageVocab.LPAR, LanguageVocab.RPAR,
                LanguageVocab.LSQ, LanguageVocab.RSQ);
    }

    /**
     * Test whether the given expressions give the correct tokens.
     */
    @Test
    public void testYieldsOperators() {
        lextest.yields("min niet of plus en is keer", LanguageVocab.MINUS, LanguageVocab.NOT, LanguageVocab.OR, LanguageVocab.PLUS,
                LanguageVocab.AND, LanguageVocab.ASSIGN, LanguageVocab.TIMES);
    }

    /**
     * Test whether the given expressions give the correct tokens.
     */
    @Test
    public void testYieldsExpr() {
        lextest.yields("; truefalsewaarde getal niks zolang dat wanneer anders ja nee", LanguageVocab.SEMI, LanguageVocab.BOOL,
                LanguageVocab.INT, LanguageVocab.VOID, LanguageVocab.WHILE, LanguageVocab.IF, LanguageVocab.ELSE,
                LanguageVocab.TRUE,LanguageVocab.FALSE);
    }

    /**
     * Test whether the given expressions give the correct tokens.
     */
    @Test
    public void testYieldsFunctionNames() {
        lextest.yields("functie voeruit samenvoegen splitsen klasse globaal", LanguageVocab.FUNCTION, LanguageVocab.MAIN,
                LanguageVocab.JOIN, LanguageVocab.FORK, LanguageVocab.CLASS, LanguageVocab.GLOBAL);
    }

}
