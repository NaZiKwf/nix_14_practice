package ua.nix.akolovych.hw3;

public class Task3 {

    public String SchoolSchedule(int Lesson) {

        if(Lesson<1){
            String s = "Error";
            return s;
        }

        if(Lesson>10){
            String s = "Error";
            return s;
        }

        int start = 9 * 60;
        int lesson = 45;
        int small = 5;
        int big = 15;
        int input=Lesson;

        int m = start + input * lesson;
        m += (input - 1) * small;
        m += (input - 1) / 2 * (big - small);
       String result = m/60 + " " + m % 60;
        return result;
    }

}
