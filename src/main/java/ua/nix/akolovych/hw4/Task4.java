package ua.nix.akolovych.hw4;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        int[] array1 = Utils.genRandomArr(5, 0, 6);
        System.out.println(Arrays.toString(array1));
        int[] array2 = Utils.genRandomArr(5, 0, 6);
        System.out.println(Arrays.toString(array2));
        double avg1 = calculateAVG(array1);
        double avg2 = calculateAVG(array2);
        checkAVG(avg1,avg2);
    }

    public static double calculateAVG(int[] arr) {

        double sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        return sum / 5;
    }

    public static void checkAVG(double avg1, double avg2){
        if (avg1 > avg1) {
            System.out.println("Avg1  (" + avg1 + ") >" +
                    "Avg2(" + avg2 + ")");
        } else if (avg1 < avg2) {
            System.out.println("Avg1 (" + avg1 + ") < " +
                    "Avg2 (" + avg2 + ")");
        } else {
            System.out.println("Avg1=Avg2 (" + avg1 + ")");
        }
    }
}
