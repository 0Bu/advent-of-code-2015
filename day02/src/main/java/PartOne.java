import java.util.stream.Stream;

public class PartOne {

    public int getTotalSquareFeet(Stream<String> lines) {
        return lines.map(this::str2int)
                .mapToInt(this::squareOf)
                .sum();
    }

    public int[] str2int(String s) {
        return Stream.of(s.split("x"))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
    }

    // 3*l*w + 2*w*h + 2*h*l
    public int squareOf(int[] d) {
        return 3 * d[0] * d[1] + 2 * d[1] * d[2] + 2 * d[2] * d[0];
    }

}
