package org.testuni.inheritance;

public class Video extends Media {

    int amountOfViews;
    final static int maxSizeOfVideo = 1000;


    public Video(String author, int date, String message, String messageType, String mediaType, int amountOfViews) {
        super(author, date, message, messageType, mediaType);
        this.amountOfViews = amountOfViews;
    }

    public int getAmountOfViews () {
        return amountOfViews;
    }

    @Override
    public int getMaxSizeOfEntry() {
        return maxSizeOfVideo;
    }
}
