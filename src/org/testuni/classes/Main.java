package org.testuni.classes;

import org.testuni.inheritance.Audio;
import org.testuni.inheritance.Image;
import org.testuni.inheritance.TextEntry;
import org.testuni.inheritance.Video;
import org.testuni.interfaces.Playable;
import org.testuni.interfaces.Printable;

public class Main {

    public static void main(String[] args) {

        Printable printText = new TextEntry("AnyAuthor", 20, "Hello buddy!", "post");
        printText.doPrint();

        Printable printImage = new Image("newAuthor", 11, "New picture!", "repost", "", "jpeg");
        printImage.doPrint();

        Playable playAudio = new Audio("Massive Attack", 21, "New single!", "repost", "", 5.54);
        playAudio.doPlay();

        Playable playVideo = new Video("Director", 22, "New movie!", "comment", "", 6458);
        playVideo.doPlay();
    }

}
