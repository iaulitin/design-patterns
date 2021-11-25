package ru.iaulitin.patterns.behavioral.chainofresponsibilities;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain implements HandlerChainInterface {

    private final List<Handler> handlers = new ArrayList<>();

    public void handle(Request request,
                       Response response) {
        for (int i = 0; i < handlers.size(); i++) {
            Handler handler = handlers.get(i);
            System.out.println("Executing phase " + i);
            handler.handle(request, response);
        }
    }


    public void addHandler(Handler handler) {
        handlers.add(handler);
    }
}
