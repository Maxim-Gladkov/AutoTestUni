package org.testuni.dishwasher;


public class Main {
    public static void main(String[] args) {

        Tableware i1 = new Tableware(false, "knife");
        Tableware i2 = new Tableware(false, "plate");
        Tableware i3 = new Tableware(false, "cup");
        Tableware i4 = new Tableware(false, "spoon");
        Tableware i5 = new Tableware(false, "fork");


        Dishwasher dishwasher = new Dishwasher(5);
        dishwasher.removeTableware();

        dishwasher.setTableware(i1);
        dishwasher.setTableware(i2);
        dishwasher.setTableware(i3);
        dishwasher.setTableware(i4);
        dishwasher.setTableware(i5);

        dishwasher.launchDishwasher();

        dishwasher.stopDishwasher();

    }
}
