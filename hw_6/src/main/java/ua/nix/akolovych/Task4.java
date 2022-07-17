package ua.nix.akolovych;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter 1st num");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter 2nd num");
        int m = in.nextInt();
        int result=recursiveMultiplication(n,m);
        System.out.println("result = "+result);
    }

    public static int recursiveMultiplication(int n, int m){
        if(m == 0){
            return 0;
        }
        return n + recursiveMultiplication(n,m-1);
    }
}
