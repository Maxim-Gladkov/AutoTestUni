package org.testuni.classes;

public abstract class AbstractEntry {

    public String author;
    public int date;
    public String message;
    public String messageType;

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

    abstract public int getMaxSizeOfEntry ();
}
