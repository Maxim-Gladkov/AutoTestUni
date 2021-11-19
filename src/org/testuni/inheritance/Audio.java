package org.testuni.inheritance;

public class Audio extends Media {

    private double audioLength;
    private final int maxSizeOfAudio = 500;


    public Audio(String author, int date, String message, String messageType, String mediaType, Double audioLength) {
        super(author, date, message, messageType, mediaType);
        this.audioLength = audioLength;
    }

    public double getAudioLength () {
        return audioLength;
    }

    @Override
    public int getMaxSizeOfEntry() {
        return maxSizeOfAudio;
    }
}
