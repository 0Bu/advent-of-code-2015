import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartTwoTest {

    @Test
    public void lengthOf() {
        PartTwo p = new PartTwo();
        assertEquals(34, p.lengthOf(p.str2int("2x3x4")));
        assertEquals(14, p.lengthOf(p.str2int("1x1x10")));
    }

    @Test
    public void getTotalSquareFeet() {
        PartTwo p = new PartTwo();
        assertEquals(34 + 14, p.getTotalFeetOfRibbon(Stream.of("2x3x4 1x1x10".split(" "))));
    }
}
