package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
//        I can't figure out how to get this to print.
//        I am able to get the logic to work.
//        If I import this as a new class and run it, it will create a triangle.
        String stars = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                stars += "*";
            }
            stars += "\n";
        }
        return stars;
    }

    public static String getRow(int numberOfStars) {
//        I can't figure out how to get this to print.
//        I am able to get the logic to work.
//        If I import this as a new class and run it, it will create a triangle.
        String stars = "";
        for (int i = 0; i < numberOfStars; i++) {
            stars += "*";
        }
        return stars;
    }

    public static String getSmallTriangle(int numberOfStars) {
//        I can't figure out how to get this to print.
//        I am able to get the logic to work.
//        If I import this as a new class and run it, it will create a triangle.
        String stars = "";
        for (int i = 1; i < numberOfStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return stars;
    }

    public static String getLargeTriangle(int numberOfStars) {
//        I can't figure out how to get this to print.
//        I am able to get the logic to work.
//        If I import this as a new class and run it, it will create a triangle.
        String stars = "";
        for (int i = 1; i < numberOfStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return stars;
    }
}
