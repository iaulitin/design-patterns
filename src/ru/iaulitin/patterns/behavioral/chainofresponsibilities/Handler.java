package ru.iaulitin.patterns.behavioral.chainofresponsibilities;

public interface Handler {

    void handle(Request request,
                Response response);
}
