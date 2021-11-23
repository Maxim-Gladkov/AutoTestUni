package org.testuni.inheritance;

import org.testuni.interfaces.Play;

public class Audio extends Media implements Play {

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
    public int getMaxSizeOfEntry() {
        return maxSizeOfAudio;
    }

    public void doPlay() {
        author = getAuthor();
        date = getDate();
        message = getMessage();
        messageType = getMessageType();
        audioLength = getAudioLength();

        System.out.print("Author: " + author + ", " + "Date: " + date + ", " + "Message: " + message + ", " + "MessageType: " + messageType + ", " + "MediaType: " + mediaType + ", " + "AudioLength: " + audioLength + ", " + "MaxSizeOfEntry: " + getMaxSizeOfEntry() + ".");
        System.out.println();
    }


}
