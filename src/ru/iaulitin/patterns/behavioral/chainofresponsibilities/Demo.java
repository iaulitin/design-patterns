package ru.iaulitin.patterns.behavioral.chainofresponsibilities;

public class Demo {

    public static void main(String[] args) {
        HandlerChainInterface chain = new HandlerChain();
        chain.addHandler(new TextSpellingCheckHandler());
        chain.addHandler(new TextPunctuationCheckHandler());
        chain.addHandler(new TextGrammarCheckHandler());

        chain.handle(new TextDocumentRequest(true, true, true),
                new TextDocumentResponse());
    }
}
