package org.testuni.inheritance;

import org.testuni.interfaces.Playable;


public class Video extends Media implements Playable {

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
    public String getMediaType() {
        return mediaType;
    }

    @Override
    public int getMaxSizeOfEntry() {
        return maxSizeOfVideo;
    }

    public void doPlay() {
        System.out.print("Author: " + getAuthor() + ", " + "Date: " + getDate() + ", " + "Message: " + getMessage() + ", " + "MessageType: " + getMessageType() + ", " + "MediaType: " + getMediaType() + ", " + "AmountOfViews: " + getAmountOfViews() + ", " + "MaxSizeOfEntry: " + getMaxSizeOfEntry() + ".");
        System.out.println();
    }
}
