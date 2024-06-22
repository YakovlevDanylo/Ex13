import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void numJewelsInStones() {
        assertEquals(3, Main.numJewelsInStones("Aa", "aAAbbbb"));
        assertEquals(0, Main.numJewelsInStones("x", "XXqdqwX"));
        assertEquals(0, Main.numJewelsInStones("XYZ", ""));
    }

    @Test
    public void numIdenticalPairs() {
        assertEquals(4, Main.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        assertEquals(6, Main.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        assertEquals(0, Main.numIdenticalPairs(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void maxNumberOfBalloons() {
        assertEquals(1, Main.maxNumberOfBalloons("nlaebolko"));
        assertEquals(2, Main.maxNumberOfBalloons("loonbalxballpoon"));
        assertEquals(0, Main.maxNumberOfBalloons("leetcode"));
    }
}
