public class PartOne {

    public int getFloor(String input) {
        return input
                .chars()
                .map(c -> '(' == c ? 1 : -1)
                .sum();
    }

}
