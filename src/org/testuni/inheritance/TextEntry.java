package org.testuni.inheritance;

import org.testuni.classes.AbstractEntry;
import org.testuni.interfaces.Printable;


public class TextEntry extends AbstractEntry implements Printable {

    private final int maxEntrySize = 20;


    public TextEntry(String author, int date, String message, String messageType){
        super(author, date, message, messageType);
    }

    @Override
    public int getMaxSizeOfEntry() {

        return maxEntrySize;
    }

    public void doPrint() {
        System.out.print("Author: " + getAuthor() + ", " + "Date: " + getDate() + ", " + "Message: " + getMessage() + ", " + "MessageType: " + getMessageType() + ", " + "MaxSizeOfEntry: " + getMaxSizeOfEntry() + ".");
        System.out.println();
    }

}
