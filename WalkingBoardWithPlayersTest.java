package walking.game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Assert;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class WalkingBoardWithPlayersTest {

    @Test
    void testWalk1() {
        WalkingBoardWithPlayers Board = new WalkingBoardWithPlayers(5, 2);
        int[] scores = Board.walk(1, 2, 4);

        int[][] expected = { { 3, 0, 0, 1, 3 },
                { 3, 3, 3, 0, 3 },
                { 2, 1, 0, 1, 3 },
                { 3, 3, 3, 3, 3 },
                { 3, 3, 3, 3, 3 } };

        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertEquals(expected[i][j], Board.getTile(i, j));
            }
        }

        assertEquals(15, scores[0]);
        assertEquals(9, scores[1]);

    }

    @Test
    void testWalk2() {
        WalkingBoardWithPlayers Board2 = new WalkingBoardWithPlayers(5, 4);
        int[] Scores = Board2.walk(1, 2, 4, 5, 6);

        int[][] expected2darr = { { 3, 0, 0, 0, 0 },
                { 0, 3, 3, 3, 0 },
                { 1, 3, 3, 3, 1 },
                { 2, 3, 3, 3, 0 },
                { 3, 0, 1, 2, 3 } };

        for (int i = 0; i < expected2darr.length; i++) {
            for (int j = 0; j < expected2darr[i].length; j++) {
                assertEquals(expected2darr[i][j], Board2.getTile(i, j));
            }
        }

        assertEquals(21, Scores[0]);
        assertEquals(25, Scores[1]);
        assertEquals(9, Scores[2]);
        assertEquals(3, Scores[3]);

    }
}