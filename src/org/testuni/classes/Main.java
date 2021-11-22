package org.testuni.classes;

import org.testuni.inheritance.Audio;
import org.testuni.inheritance.Image;
import org.testuni.inheritance.TextEntry;
import org.testuni.inheritance.Video;
import org.testuni.interfaces.Play;
import org.testuni.interfaces.Print;

public class Main {

    public static void main(String[] args) {

        Print printText = new TextEntry("AnyAuthor", 20, "Hello buddy!", "post");
        printText.doPrint();

        Print printImage = new Image("newAuthor", 11, "New picture!", "repost", "", "jpeg");
        printImage.doPrint();

        Play playAudio = new Audio("Massive Attack", 21, "New single!", "repost", "", 5.54);
        playAudio.doPlay();

        Play playVideo = new Video("Director", 22, "New movie!", "comment", "", 6458);
        playVideo.doPlay();
    }

}
