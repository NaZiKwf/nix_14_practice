package ua.nix.akolovych.hw3;


public class Task1 {

    public int Symbols(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            try {
                sum += Integer.parseInt(str.substring(i, i + 1));

            } catch (Exception ignored) {
            }
        }
        return sum;
    }
}
