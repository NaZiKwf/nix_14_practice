package ua.nix.akolovych;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        String firstInput = "Choose a variety :\n";
        String welcome = """
                Box \n""";


        System.out.print(firstInput + welcome);
        System.out.println("Type:");
        Scanner in = new Scanner(System.in);

        Box b = new Box();
        setValue(in.nextLine(),b);
        System.out.println(b.getValue());
    }

    public static String setValue(String str,Box b){
        b.setValue(str);
        return b.getValue();
    }
}
