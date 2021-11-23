package org.testuni.inheritance;

import org.testuni.interfaces.Play;


public class Video extends Media implements Play {

    private int amountOfViews;
    private final String mediaType = "video";
    private static final int maxSizeOfVideo = 1000;


    public Video(String author, int date, String message, String messageType, String mediaType, int amountOfViews) {
        super(author, date, message, messageType, mediaType, maxSizeOfVideo);
        this.amountOfViews = amountOfViews;
    }

    public int getAmountOfViews () {
        return amountOfViews;
    }

    @Override
    public int getMaxSizeOfEntry() {
        return maxSizeOfVideo;
    }

    public void doPlay() {
        author = getAuthor();
        date = getDate();
        message = getMessage();
        messageType = getMessageType();
        amountOfViews = getAmountOfViews();

        System.out.print("Author: " + author + ", " + "Date: " + date + ", " + "Message: " + message + ", " + "MessageType: " + messageType + ", " + "MediaType: " + mediaType + ", " + "AmountOfViews: " + amountOfViews + ", " + "MaxSizeOfEntry: " + getMaxSizeOfEntry() + ".");
        System.out.println();
    }
}
