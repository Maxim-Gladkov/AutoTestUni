package org.testuni.classes;

public abstract class AbstractEntry {

    protected String author;
    protected int date;
    protected String message;
    protected String messageType;

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
