package ua.nix.akolovych.hw3;


import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public Map<Character, Integer> Symbols(String strLetter) {

        char[] array = strLetter.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            char temp = array[i];
            if(Character.isLetter(temp)) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (temp == array[j]) {
                        count++;
                    }
                }
                map.put(temp, count);
            }
        }
        return map;

    }


}
