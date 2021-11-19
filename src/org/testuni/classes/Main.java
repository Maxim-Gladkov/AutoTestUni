package org.testuni.classes;

import org.testuni.inheritance.Image;
import org.testuni.inheritance.Media;
import org.testuni.inheritance.TextEntry;

public class Main {

    public static void main(String[] args) {

        Image anyImage = new Image("Vanya", 2021,"","post", "image", "jpeg");
        Media voiceMessage = new Media("Petya",2020, "", "post", "audio");


        System.out.println(anyImage.getMaxSizeOfEntry());
        voiceMessage.showContent();


    }

}
