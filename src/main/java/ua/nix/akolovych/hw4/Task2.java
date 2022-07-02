package ua.nix.akolovych.hw4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array=Utils.genRandomArr(8,1,11);
        System.out.println(Arrays.toString(replaceElemWithOddIndex(array)));
    }

    public static int[] replaceElemWithOddIndex(int[] arr){

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                arr[i] = 0;
            }
        }
        return arr;
    }
}

