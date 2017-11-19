import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PartTwoTest {

    @Test
    public void isNice() {
        PartTwo partTwo = new PartTwo();

        assertTrue(partTwo.isNice("qjhvhtzxzqqjkmpb"));
        assertTrue(partTwo.isNice("xxyxx"));

        assertFalse(partTwo.isNice("uurcxstgmygtbstg"));
        assertFalse(partTwo.isNice("ieodomkazucvgmuy"));
    }

}
