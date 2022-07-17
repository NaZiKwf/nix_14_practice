package ua.nix.akolovych;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter 1st string");
        Scanner in = new Scanner(System.in);
        String str1 =in.nextLine();
        System.out.println("Enter 2nd string");
        String str2 = in.nextLine();
        System.out.println("Enter start string");
        String startStr = in.nextLine();
        System.out.println( str1 + ". Starts from word " + startStr + "? " + lineStartsWithTheContentsOfAnotherline(str1, startStr));
        System.out.println(str2 + ". Starts from word " + startStr + "? " + lineStartsWithTheContentsOfAnotherline( str2, startStr));
    }

    public static boolean lineStartsWithTheContentsOfAnotherline(String str1, String startStr){
        return str1.startsWith(startStr);
    }
}
