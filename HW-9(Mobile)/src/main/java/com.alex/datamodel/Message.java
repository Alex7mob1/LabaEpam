package com.alex.datamodel;

import java.util.Objects;

public class Message {

    private String to;
    private String subject;
    private String message;

    public Message(final String to, final String subject, final String message) {
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return to.equals(message1.to) && subject.equals(message1.subject) && message.equals(message1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, subject, message);
    }

    @Override
    public String toString() {
        return "Message{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
