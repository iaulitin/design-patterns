package ru.iaulitin.patterns.behavioral.chainofresponsibilities;

public class TextDocumentRequest implements Request {

    private final boolean isSpellingCorrect;
    private final boolean isPunctuationCorrect;
    private final boolean isGrammarCorrect;


    public TextDocumentRequest(boolean isSpellingCorrect,
                               boolean isPunctuationCorrect,
                               boolean isGrammarCorrect) {
        this.isSpellingCorrect = isSpellingCorrect;
        this.isPunctuationCorrect = isPunctuationCorrect;
        this.isGrammarCorrect = isGrammarCorrect;
    }


    public boolean isSpellingCorrect() {
        return isSpellingCorrect;
    }

    public boolean isPunctuationCorrect() {
        return isPunctuationCorrect;
    }

    public boolean isGrammarCorrect() {
        return isGrammarCorrect;
    }


    @Override
    public String toString() {
        return "TextDocumentRequest{" +
                "isSpellingCorrect=" + isSpellingCorrect +
                ", isPunctuationCorrect=" + isPunctuationCorrect +
                ", isGrammarCorrect=" + isGrammarCorrect +
                '}';
    }
}
