package ru.iaulitin.patterns.behavioral.chainofresponsibilities;

public class TextSpellingCheckHandler implements Handler {

    @Override
    public void handle(Request request,
                       Response response) {
        System.out.println("Performing spelling check");
        if (!(request instanceof TextDocumentRequest)) {
            return;
        }
        TextDocumentRequest tdRequest = (TextDocumentRequest) request;
        if (tdRequest.isSpellingCorrect()) {
            response.setStatus(Response.Status.ERROR);
        }
    }
}
