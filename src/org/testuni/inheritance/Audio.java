package org.testuni.inheritance;

import org.testuni.interfaces.Playable;

public class Audio extends Media implements Playable {

    private double audioLength;
    private final String mediaType = "audio";
    private static final int maxSizeOfAudio = 500;


    public Audio (String author, int date, String message, String messageType, String mediaType, Double audioLength) {
        super(author, date, message, messageType, mediaType, maxSizeOfAudio);
        this.audioLength = audioLength;
    }

    public double getAudioLength () {
        return audioLength;
    }

    @Override
    public String getMediaType() {
        return mediaType;
    }

    @Override
    public int getMaxSizeOfEntry() {
        return maxSizeOfAudio;
    }

    public void doPlay() {
        System.out.print("Author: " + getAuthor() + ", " + "Date: " + getDate() + ", " + "Message: " + getMessage() + ", " + "MessageType: " + getMessageType() + ", " + "MediaType: " + getMediaType() + ", " + "AudioLength: " + getAudioLength() + ", " + "MaxSizeOfEntry: " + getMaxSizeOfEntry() + ".");
        System.out.println();
    }


}
