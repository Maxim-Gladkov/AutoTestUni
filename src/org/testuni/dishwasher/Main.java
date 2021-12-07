package org.testuni.dishwasher;


public class Main {
    public static void main(String[] args) {

         Items i1 = new Items("dirty", "knife");
         Items i2 = new Items("dirty", "plate");
         Items i3 = new Items("dirty", "cup");
         Items i4 = new Items("clean", "spoon");
         Items i5 = new Items("dirty", "fork");


        Dishwasher dishwasher = new Dishwasher(5);

        dishwasher.setTableware(i1);
        dishwasher.setTableware(i2);
        dishwasher.setTableware(i3);
        dishwasher.setTableware(i4);
        dishwasher.setTableware(i5);

        dishwasher.launchDishwasher();

        dishwasher.stopDishwasher();

    }
}
