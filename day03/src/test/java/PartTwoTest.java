import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartTwoTest {

    @Test
    public void getHousesCountReceiveAtLeastOnePresent() {
        assertEquals(3,
                new PartTwo().getHousesCountReceivedAtLeastOnePresentBySantaAndRobo(new byte[]{'^','v'}));
        assertEquals(3,
                new PartTwo().getHousesCountReceivedAtLeastOnePresentBySantaAndRobo(new byte[]{'^','>','v','<'}));
        assertEquals(11,
                new PartTwo().getHousesCountReceivedAtLeastOnePresentBySantaAndRobo(new byte[]{'^','v','^','v','^','v','^','v','^','v'}));
    }

}
