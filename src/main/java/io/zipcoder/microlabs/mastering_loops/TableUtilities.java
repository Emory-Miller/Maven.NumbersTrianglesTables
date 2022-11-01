package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
//        I can't figure out how to get this to print as a table.
//        I am able to get the logic to work.
//        If I import this as a new class and run it, it will create a table
        String table = "";
        for (int i = 1; i < tableSize + 1; i++) {
            for (int j = 1; j <= tableSize; j++) {
                table += String.format("%3d |", i * j);
                if (j == tableSize) {
                    table += "\n";
                }
            }
        }
        return table;
    }
}
