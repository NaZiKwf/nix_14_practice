package ua.nix.akolovych.hw1;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string with numbers");
        String str = in.nextLine();
        Task1 Task1 = new Task1();
        System.out.println(Task1.Symbols(str));

        System.out.println("Enter string");
        String str1= in.nextLine();
        Task2 Task2 = new Task2();
        Map<Character, Integer> map = Task2.Symbols(str1);
        for(char c : map.keySet()){
            System.out.print(c+ " - " +map.get(c) + "   ");

        }
        System.out.println();

        System.out.println("Enter number of lesson");
        Task3 Task3 = new Task3();
        int input = in.nextInt();
        String res = Task3.SchoolSchedule(input);
        System.out.println(res);
    }

}