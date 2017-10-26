import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PartTwoTest {

    @Test
    public void getBasementPosition() {
        PartTwo p = new PartTwo();
        assertEquals(1, p.getBasementPosition(")"));
        assertEquals(5, p.getBasementPosition("()())"));
    }

    @Test
    public void throwsNoBasementPositionFound() {
        assertThrows(IllegalArgumentException.class, () -> {
                    new PartTwo().getBasementPosition("");
                }
        );
        assertThrows(IllegalArgumentException.class, () -> {
                    new PartTwo().getBasementPosition("(((");
                }
        );
    }
}
