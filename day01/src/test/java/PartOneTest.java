import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartOneTest {

    @Test
    public void getFloor() {
        PartOne p = new PartOne();
        assertEquals(0, p.getFloor("(())"));
        assertEquals(0, p.getFloor("()()"));
        assertEquals(3, p.getFloor("((("));
        assertEquals(3, p.getFloor("(()(()("));
        assertEquals(3, p.getFloor("))((((("));
        assertEquals(-1, p.getFloor("())"));
        assertEquals(-1, p.getFloor("))("));
        assertEquals(-3, p.getFloor(")))"));
        assertEquals(-3, p.getFloor(")())())"));
    }
}
