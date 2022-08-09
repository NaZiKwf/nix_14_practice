package ua.nix.akolovych;

import java.util.Stack;

public class Launcher {
    public static void main(String[] args) {
        MyStackImpl<Integer> stack = new MyStackImpl<>();
        System.out.println(stack);
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        stack.deleteElemByIndex(1);
        System.out.println(stack);
    }
}
