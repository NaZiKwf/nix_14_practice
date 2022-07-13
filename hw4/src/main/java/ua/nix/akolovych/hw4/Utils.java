package ua.nix.akolovych.hw4;

public final class Utils {

    public static int[] genRandomArr(int arrLength, int minValue, int maxValue){
        int[] intArray = new int[arrLength];

        for (int i = 0; i < arrLength; i++)
            intArray[i] = minValue + (int) (Math.random() * ((maxValue - minValue)));

        return intArray;

    }

}
