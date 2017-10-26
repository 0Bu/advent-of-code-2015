public class PartTwo {

    public int getBasementPosition(String input) {
        int sum = 0;
        int[] ones = input
                .chars()
                .map(c -> '(' == c ? 1 : -1)
                .toArray();

        for (int p = 0; p < ones.length; p += 1) {
            sum += ones[p];
            if (sum == -1) return p+1;
        }

        throw new IllegalArgumentException("Basement position not found");
    }

}
