import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartOneTest {

    @Test
    public void isNice() {
        PartOne partOne = new PartOne();

        assertTrue(partOne.isNice("ugknbfddgicrmopn"));
        assertTrue(partOne.isNice("aaa"));

        assertFalse(partOne.isNice("jchzalrnumimnmhp"));
        assertFalse(partOne.isNice("haegwjzuvuyypxyu"));
        assertFalse(partOne.isNice("dvszwmarrgswjxmb"));
    }

}
