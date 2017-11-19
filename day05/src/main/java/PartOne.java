import java.util.stream.Stream;

public class PartOne {

    public long countNiceStrings(Stream<String> lines) {
        return lines.parallel().filter(this::isNice).count();
    }

    public boolean isNice(String s) {
        return s.replaceAll("[^aeiou]", "").length() > 2 &&
                s.matches(".*([a-z])\\1.*") &&
                !s.matches(".*(ab|cd|pq|xy).*");
    }

}
