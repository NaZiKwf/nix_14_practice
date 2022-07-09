package ua.nix.akolovych;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        String firstInput = "Choose a variety :\n";
        String welcome = """
                Box \n""";


        System.out.print(firstInput + welcome);
        System.out.println("Type:");
        Scanner in = new Scanner(System.in);

        Box b = createObject(in.nextLine());
        System.out.println(b.getValue());

    }
    public static Box createObject(String str){
        return new Box(str);
    }
}
