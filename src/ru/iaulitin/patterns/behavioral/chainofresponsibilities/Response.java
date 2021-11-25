package ru.iaulitin.patterns.behavioral.chainofresponsibilities;

public interface Response {
    enum Status {
        OK,
        ERROR
    }

    Status getStatus();

    void setStatus(Status status);
}
