import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {
        Path path = Paths.get(Main.class.getClassLoader().getResource("input").toURI());

        System.out.println("Day02/1 The total square feet of wrapping paper: " + new PartOne().getTotalSquareFeet(Files.lines(path)));
        System.out.println("Day02/1 The total feet of ribbon: " + new PartTwo().getTotalFeetOfRibbon(Files.lines(path)));
    }

}
