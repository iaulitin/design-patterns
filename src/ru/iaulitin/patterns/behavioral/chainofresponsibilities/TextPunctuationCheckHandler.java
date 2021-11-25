package ru.iaulitin.patterns.behavioral.chainofresponsibilities;

public class TextPunctuationCheckHandler implements Handler {

    @Override
    public void handle(Request request,
                       Response response) {
        System.out.println("Performing punctuation check");
        if (!(request instanceof TextDocumentRequest)) {
            return;
        }
        TextDocumentRequest tdRequest = (TextDocumentRequest) request;

        if (tdRequest.isPunctuationCorrect()) {
            response.setStatus(Response.Status.ERROR);
        }
    }
}

