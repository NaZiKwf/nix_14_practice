package ua.nix.akolovych.hw6;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        String firstInput = "Choose a variety :\n";
        String welcome = """
                Box \n""";


        System.out.print(firstInput + welcome);
        System.out.println("Type:");
        Scanner in = new Scanner(System.in);

        Box b = new Box(in.nextLine());
        System.out.println(b.getValue());

    }
}
