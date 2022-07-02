package ua.nix.akolovych.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter arr size:");

        int n = 0;

        while (n <= 3) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 3) {
                    System.out.println("Enter number > 3. Enter again:");
                }
            } else {
                System.out.println("You enter not number. Enter again:");
                sc.next();
            }
        }

        int[] array1 = Utils.genRandomArr(n, 0, n + 1);
        System.out.println(Arrays.toString(array1));
        int[] array2 = createNewPairedArr(array1);
        System.out.println(Arrays.toString(array2));
    }

    public static int[] createNewPairedArr(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        int[] arr2 = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arr2[index] = array[i];
                index++;
            }
        }
        return arr2;
    }
}
