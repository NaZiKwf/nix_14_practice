package ua.nix.akolovych.hw4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array=Utils.genRandomArr(4,10,100);
        boolean b = arrayGrowing(array);
        if (b) {
            System.out.println("Array is strictly growing");
        } else {
            System.out.println("Array is not strictly growing");
        }
    }

    public static boolean arrayGrowing(int[] arr) {

        System.out.println(Arrays.toString(arr));

        boolean b = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                b = false;
                break;
            }
        }
        return b;
    }
}
