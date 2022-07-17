package ua.nix.akolovych;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter 1st string");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        System.out.println("Enter 2nd string");
        String str2 = in.nextLine();
        System.out.println("Enter 3d string");
        String str3 = in.nextLine();

        System.out.println( str1 + "\" equals \"" + str2 + "\" " + twoStringObjectsContainTheSameData(str1,str2));
        System.out.println( str1 + "\" equals \"" + str3 + "\" " + twoStringObjectsContainTheSameData(str1,str3));
    }

    public static boolean twoStringObjectsContainTheSameData(String str1, String str2){
        return str1.contains(str2);
    }
}
