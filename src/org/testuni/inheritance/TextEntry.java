package org.testuni.inheritance;

import org.testuni.classes.AbstractEntry;

public class TextEntry extends AbstractEntry {

    static final int maxEntrySize = 20;
    String messageType;

    public TextEntry(String author, int date, String message, String messageType){
        super(author, date, message, messageType);
    }

    public String getMessageType() {
        return messageType;
    }

    @Override
    public int getMaxSizeOfEntry() {
        return maxEntrySize;
    }
}
