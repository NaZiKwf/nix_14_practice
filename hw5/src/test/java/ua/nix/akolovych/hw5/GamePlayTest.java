package ua.nix.akolovych.hw5;


import org.junit.jupiter.api.Test;
import ua.nix.akolovych.hw5.data.GameStates;
import ua.nix.akolovych.hw5.data.Sign;
import ua.nix.akolovych.hw5.gameplay.GamePlay;

import java.io.IOException;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.nix.akolovych.hw5.data.GameStates.*;
import static ua.nix.akolovych.hw5.data.Sign.CROSS;
import static ua.nix.akolovych.hw5.data.Sign.ZERO;
import static ua.nix.akolovych.hw5.draw.Draw.drawField;


class GamePlayTest {

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnTie(){
        final int size = 3;
        //Arrange

        Sign[][] field = new Sign[size][size];

        field[0][0] = CROSS;
        field[0][1] = ZERO;
        field[0][2] = CROSS;

        field[1][0] = ZERO;
        field[1][1] = CROSS;
        field[1][2] = CROSS;

        field[2][0] = ZERO;
        field[2][1] = CROSS;
        field[2][2] = ZERO;

        GamePlay gamePlay = new GamePlay(field, size);

        drawField(field);

        GameStates expected = TIE;
        String expectedMessage = TIE.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");
    }

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnTie_LoadFile() throws IOException {
        // Arrange
        final int size = 3;
        Sign[][] testArray = TestUtils.textToArray("test_data_cross_wins.txt", size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        drawField(testArray);

        GameStates expected = WINNER_X;
        String expectedMessage = WINNER_X.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");

    }

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnGameIsContinue_LoadFile() throws IOException {
        // Arrange
        final int size = 3;
        Sign[][] testArray = TestUtils.textToArray("test_data_game_is_continue.txt", size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        drawField(testArray);

        GameStates expected = GAME_IS_CONTINUE;
        String expectedMessage = GAME_IS_CONTINUE.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");

    }

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnCrossWinner_LoadFile() throws IOException {
        // Arrange
        final int size = 3;
        Sign[][] testArray = TestUtils.textToArray("test_data_side_diagonal_completed.txt", size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        drawField(testArray);

        GameStates expected = WINNER_X;
        String expectedMessage = WINNER_X.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");

    }

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnCrossWinner_VerticalCompleted_LoadFile() throws IOException {
        // Arrange
        final int size = 3;
        Sign[][] testArray = TestUtils.textToArray("test_data_vertical_completed.txt", size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        drawField(testArray);

        GameStates expected = WINNER_X;
        String expectedMessage = WINNER_X.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");

    }

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnCrossWinner_HorizontalCompleted_LoadFile() throws IOException {
        // Arrange
        final int size = 3;
        Sign[][] testArray = TestUtils.textToArray("test_data_horizontal_completed.txt", size);

        GamePlay gamePlay = new GamePlay(testArray, size);
        drawField(testArray);

        GameStates expected = WINNER_X;
        String expectedMessage = WINNER_X.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");

    }

    @Test
    void game_FillsFieldWithSignsChecksWinner_Field3X3_ReturnGameIsContinue_EmptyField_LoadFile() throws IOException {
        // Arrange
        final int size = 3;
        Sign[][] testArray = TestUtils.textToArray("test_data_gameplay_with_empties.txt", size);

        GamePlay gamePlay = new GamePlay(size);
        drawField(testArray);

        GameStates expected = GAME_IS_CONTINUE;
        String expectedMessage = GAME_IS_CONTINUE.getGameStateMessage();

        // Act
        GameStates actual = gamePlay.checkGameState(CROSS);
        String actualMessage = gamePlay.checkGameState(CROSS).getGameStateMessage();

        // Assert
        assertEquals(expected, actual, "Game state wrong");
        assertEquals(expectedMessage, actualMessage, "Game state message wrong");

    }

    @Test
    void game_GetField_WithEmptyField_Field3X3_ReturnField_LoadFile() throws IOException {
        // Arrange
        final int size = 3;
        Sign[][] expected = TestUtils.textToArray("test_data_gameplay_with_empties.txt", size);

        GamePlay gamePlay = new GamePlay(size);
        drawField(expected);

        // Act
        Sign [] [] actual = gamePlay.getField();

        // Assert
        assertArrayEquals(expected, actual, "Field is wrond!");

    }


}
