package org.testuni.inheritance;

import org.testuni.interfaces.Printable;

public class Image extends Media implements Printable {

    private String imageFormat;
    private final String mediaType = "image";
    private static final int maxSizeOfImage = 300;

    public Image (String author, int date, String message, String messageType, String mediaType, String imageFormat) {
        super(author, date, message, messageType, mediaType, maxSizeOfImage);
        this.imageFormat = imageFormat;
    }


    public String getImageFormat () {
        return imageFormat;
    }

    @Override
    public String getMediaType() {
        return mediaType;
    }

    @Override
    public int getMaxSizeOfEntry() {
        return maxSizeOfImage;
    }

    public void doPrint () {
        System.out.print("Author: " + getAuthor() + ", " + "Date: " + getDate() + ", " + "Message: " + getMessage() + ", " + "MessageType: " + getMessageType() + ", " + "MediaType: " + getMediaType() + ", " + "ImageFormat: " + getImageFormat() + ", " + "MaxSizeOfEntry: " + getMaxSizeOfEntry() + ".");
        System.out.println();
    }

}
