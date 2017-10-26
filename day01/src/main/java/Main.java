import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Path path = Paths.get(Main.class.getClassLoader().getResource("input").toURI());
        String input = Files.lines(path).collect(Collectors.joining());

        System.out.format("Day01/1. Floor: %d%n", new PartOne().getFloor(input));
        System.out.format("Day01/2. Basement position: %d%n", new PartTwo().getBasementPosition(input));
    }

}
