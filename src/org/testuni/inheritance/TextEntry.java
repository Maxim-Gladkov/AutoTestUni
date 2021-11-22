package org.testuni.inheritance;

import org.testuni.classes.AbstractEntry;
import org.testuni.interfaces.Print;


public class TextEntry extends AbstractEntry implements Print {

    private final int maxEntrySize = 20;


    public TextEntry(String author, int date, String message, String messageType){
        super(author, date, message, messageType);
    }

    public String getAuthor() {
        return author;
    }
    public int getDate() {
        return date;
    }
    public String getMessage() {
        return message;
    }
    public String getMessageType() {
        return messageType;
    }
    @Override
    public int getMaxSizeOfEntry() {

        return maxEntrySize;
    }

    public void doPrint() {
        author = getAuthor();
        date = getDate();
        message = getMessage();
        messageType = getMessageType();

        System.out.print("Author: " + author + ", " + "Date: " + date + ", " + "Message: " + message + ", " + "MessageType: " + messageType + ", " + "MaxSizeOfEntry: " + getMaxSizeOfEntry() + ".");
        System.out.println();
    }

}
