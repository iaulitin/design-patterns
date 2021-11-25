package ru.iaulitin.patterns.behavioral.chainofresponsibilities;

public interface HandlerChainInterface {

    void handle(Request request,
                Response response);

    void addHandler(Handler handler);
}
