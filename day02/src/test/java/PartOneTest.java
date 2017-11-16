import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartOneTest {

    @Test
    public void squareOf() {
        PartOne p = new PartOne();
        assertEquals(58, p.squareOf(p.str2int("2x3x4")));
        assertEquals(43, p.squareOf(p.str2int("1x1x10")));
    }

    @Test
    public void getTotalSquareFeet() {
        PartOne p = new PartOne();
        assertEquals(58 + 43, p.getTotalSquareFeet(Stream.of("2x3x4 1x1x10".split(" "))));
    }
}
