package org.testuni.classes;

public abstract class AbstractEntry {

    private String author;
    private int date;
    private String message;
    private String messageType;

    public AbstractEntry(String author, int date, String message, String messageType) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.messageType = messageType;
    }

    public void showContent () {
        System.out.print(author + ", ");
        System.out.print(date + ", ");
        System.out.print(message + ", ");
        System.out.println(messageType);
    }

    public abstract int getMaxSizeOfEntry ();
}
