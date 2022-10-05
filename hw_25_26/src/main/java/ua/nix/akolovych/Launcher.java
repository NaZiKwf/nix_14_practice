package ua.nix.akolovych;

import ua.nix.akolovych.view.UserInterface;

public class Launcher {
    private final static UserInterface userInterface = new UserInterface();
    public static void main(String[] args) {
        userInterface.run();
    }
}
