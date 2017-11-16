import java.util.stream.Stream;

public class PartTwo {

    public int getTotalFeetOfRibbon(Stream<String> lines) {
        return lines.map(this::str2int)
                .mapToInt(this::lengthOf)
                .sum();
    }

    public int[] str2int(String s) {
        return Stream.of(s.split("x"))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
    }

    public int lengthOf(int[] d) {
        return 2 * (d[0] + d[1]) + d[0] * d[1] * d[2];
    }

}
