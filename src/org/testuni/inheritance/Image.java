package org.testuni.inheritance;

import org.testuni.interfaces.Print;

public class Image extends Media implements Print {

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
    public int getMaxSizeOfEntry() {
        return maxSizeOfImage;
    }

    public void doPrint () {
        author = getAuthor();
        date = getDate();
        message = getMessage();
        messageType = getMessageType();
        imageFormat = getImageFormat();

        System.out.print("Author: " + author + ", " + "Date: " + date + ", " + "Message: " + message + ", " + "MessageType: " + messageType + ", " + "MediaType: " + mediaType + ", " + "ImageFormat: " + imageFormat + ", " + "MaxSizeOfEntry: " + getMaxSizeOfEntry() + ".");
        System.out.println();
    }

}
