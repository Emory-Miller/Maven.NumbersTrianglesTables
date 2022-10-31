package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
//        I can't figure out how to get this to print as a table.
//        I am able to get the logic to work.
//        If I import this as a new class and run it, it will create a table
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%3d |", i * j);
                if (j == 5) {
                    System.out.print("\n");
                }
            }
        }
        return null;
    }

    public static String getLargeMultiplicationTable() {
//        I can't figure out how to get this to print as a table.
//        I am able to get the logic to work.
//        If I import this as a new class and run it, it will create a table
        for (int i = 1; i < 21; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.printf("%3d |", i * j);
                if (j == 20) {
                    System.out.print("\n");
                }
            }
        }
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
//        I can't figure out how to get this to print as a table.
//        I am able to get the logic to work.
//        If I import this as a new class and run it, it will create a table
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%3d |", i * j);
                if (j == 10) {
                    System.out.print("\n");
                }
            }
        }
        return null;
    }
}
