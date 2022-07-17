package ua.nix.akolovych;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter 1st string");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        System.out.println("Enter 2nd string");
        String str2 = in.nextLine();
        System.out.println("Enter end string");
        String end_str = in.nextLine();
        System.out.println("\"" + str1 + "\" ends with " + "\"" + end_str + "\"? " + expiresUnderTheTerm(str1,end_str) );
        System.out.println("\"" + str2 + "\" ends with " + "\"" + end_str + "\"? " + expiresUnderTheTerm(str2,end_str) );
    }

    public static boolean expiresUnderTheTerm(String str1, String end_str){
        return str1.endsWith(end_str);
    }
}
