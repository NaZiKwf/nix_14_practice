package ua.nix.akolovych.hw4;

public class Task1 {
    public static void main(String[] args) {
        int[] array=Utils.genRandomArr(12,-15,16);
        System.out.println("Index of max element: " + searchIndexOfMaxElem(array));
    }

    public static int searchIndexOfMaxElem(int[] arr) {
        int maxNum = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (maxNum <= arr[i]) {
                maxNum = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

