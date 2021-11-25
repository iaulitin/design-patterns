package ru.iaulitin.patterns.behavioral.chainofresponsibilities;

public class TextDocumentResponse implements Response {
    private Status status;
    private String comment;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
