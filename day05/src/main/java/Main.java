import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {
        Path path = Paths.get(Main.class.getClassLoader().getResource("input").toURI());

        System.out.println("Day05/1 count of nice strings: " +
                new PartOne().countNiceStrings(Files.lines(path)));
        System.out.println("Day05/2 count of nice strings with by new rules: " +
                new PartTwo().countNiceStrings(Files.lines(path)));
    }

}
