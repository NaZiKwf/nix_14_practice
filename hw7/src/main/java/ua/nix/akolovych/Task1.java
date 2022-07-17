package ua.nix.akolovych;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = "world";
        System.out.println("First symbol of str1 = " + "\n" + getFirstSymbol(str1));
        System.out.println("Last symbol of str1 = " + "\n" + getLastSymbol(str1));
        char[] res = wordToCharArray(str2);
        System.out.println("Symbols array of str2 = " + "\n" + Arrays.toString(res));
        System.out.println("Before the lasy symbol = " + "\n" + getCharByIndex(res));
    }

    public static String getFirstSymbol(String str1) {
        char ch = str1.charAt(0);
        return String.valueOf(ch);
    }

    public static String getLastSymbol(String str1) {
        int first = str1.length() - 1;
        char ch = str1.charAt(first);
        return String.valueOf(ch);
    }

    public static char[] wordToCharArray(String str2) {
        char[] result = str2.toCharArray();
        return result;
    }

    public static char getCharByIndex(char[] str2) {
        return str2[str2.length - 2];
    }

}
