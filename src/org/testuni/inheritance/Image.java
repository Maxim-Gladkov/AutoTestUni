package org.testuni.inheritance;

public class Image extends Media {

    private String imageFormat;
    private int maxSizeOfImage;

    public Image(String author, int date, String message, String messageType, String mediaType, String imageFormat) {
        super(author, date, message, messageType, mediaType);
        this.imageFormat = imageFormat;
    }

    public String getImageFormat () {
        return imageFormat;
    }

    @Override
    public int getMaxSizeOfEntry() {
        if (imageFormat == "jpeg") {
            maxSizeOfImage = 50;
        }else if (imageFormat=="pdf") {
            maxSizeOfImage=100;
        }else if(imageFormat=="png") {
            maxSizeOfImage=150;
        }
        return maxSizeOfImage;
    }
}
