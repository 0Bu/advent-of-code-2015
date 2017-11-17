import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartOneTest {

    @Test
    public void getHousesCountReceiveAtLeastOnePresent() {
        assertEquals(2,
                new PartOne().getHousesCountReceivedAtLeastOnePresent(new byte[]{'>'}));
        assertEquals(4,
                new PartOne().getHousesCountReceivedAtLeastOnePresent(new byte[]{'^', '>', 'v', '<'}));
        assertEquals(2,
                new PartOne().getHousesCountReceivedAtLeastOnePresent(new byte[]{'^', 'v', '^', 'v', '^', 'v', '^', 'v', '^', 'v'}));
    }

}
