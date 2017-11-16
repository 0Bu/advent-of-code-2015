import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Path path = Paths.get(Main.class.getClassLoader().getResource("input").toURI());
        String input = Files.lines(path).collect(Collectors.joining());

        System.out.println("Day01/1 Floor: " + new PartOne().getFloor(input));
        System.out.println("Day01/2 Basement position: " + new PartTwo().getBasementPosition(input));
    }

}
