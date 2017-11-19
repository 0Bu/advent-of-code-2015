import java.util.stream.Stream;

public class PartTwo {

    public long countNiceStrings(Stream<String> lines) {
        return lines.parallel().filter(this::isNice).count();
    }

    public boolean isNice(String s) {
        return s.matches(".*(.{2}).*\\1.*") && s.matches(".*([a-z]).\\1.*");
    }

}
