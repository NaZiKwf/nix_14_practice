package ua.nix.akolovych.hw5.launcher;


import ua.nix.akolovych.hw5.gameplay.*;

import static ua.nix.akolovych.hw5.utils.Utils.SIZE;

public class Launch {

    public static void main(String[] args) {
        GamePlay gamePlay = new GamePlay(SIZE);
        gamePlay.game();
    }
}
