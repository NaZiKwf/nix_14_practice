package ua.nix.akolovych.hw6;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        String firstInput = "Choose a variety :\n";
        String welcome = """
                (1)ReverseString;
                (2)SquareNumber;\n""";


        String appear = "Choose a variety or click on 0 for exit";
        System.out.print(firstInput + welcome);
        Scanner in = new Scanner(System.in);
        String str, event;
        String first, second;
        int a, b, num;
        while ((event = in.nextLine()) != null) {
            switch (event) {
                case "1" -> {
                    System.out.print("Type your text: ");
                    str = in.nextLine();
                    System.out.println(StringReverse(str));
                }

                case "2" -> {
                    System.out.print("Type your number: ");
                    num = in.nextInt();
                    System.out.println(SquareNumber(num));
                }
                case "0" -> System.exit(0);
            }
        }

    }


    public static int SquareNumber(int num) {
        int res = num * num;
        return res;
    }

    public static String StringReverse(String str) {
        char[] temparray = str.toCharArray();
        String result = "";
        if (str.length() <= 1) {
            result = str;
        } else {
            for (int i = temparray.length - 1; i >= 0; i--) {
                result += temparray[i];
            }
        }
        return result;
    }


}
