package ua.nix.akolovych;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter 1st string");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        System.out.println("Enter 2nd string");
        String str2 = in.nextLine();
        System.out.println("Enter 3d string");
        String str3 = in.nextLine();
        boolean equals1 = str1.equalsIgnoreCase(str2);
        boolean equals2 = str1.equalsIgnoreCase(str3);
        System.out.println(str1 + "\" equals \"" +  str2 + "\"  " + comparisonOfThisStringWithAnotherLine ( str1, str2));
        System.out.println(str1 + "\" equals \"" +  str3 + "\"  " + comparisonOfThisStringWithAnotherLine ( str1, str3));
    }

    public static boolean comparisonOfThisStringWithAnotherLine (String str1, String str2){
        return str1.equalsIgnoreCase(str2);
    }
}
