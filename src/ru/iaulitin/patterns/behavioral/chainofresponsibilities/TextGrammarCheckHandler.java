package ru.iaulitin.patterns.behavioral.chainofresponsibilities;

public class TextGrammarCheckHandler implements Handler {

    @Override
    public void handle(Request request,
                       Response response) {
        System.out.println("Performing grammar check");
        if (!(request instanceof TextDocumentRequest)) {
            return;
        }
        TextDocumentRequest tdRequest = (TextDocumentRequest) request;
        if (tdRequest.isGrammarCorrect()) {
            response.setStatus(Response.Status.ERROR);
        }
    }
}
