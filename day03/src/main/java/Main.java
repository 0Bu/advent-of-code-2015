import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {
        Path path = Paths.get(Main.class.getClassLoader().getResource("input").toURI());
        byte[] bytes = Files.readAllBytes(path);

        System.out.println("Count of houses received at least one present: "
                + new PartOne().getHousesCountReceivedAtLeastOnePresent(bytes));
        System.out.println("Count of houses received at least one present by Santa and Robo-Santa: "
                + new PartTwo().getHousesCountReceivedAtLeastOnePresentBySantaAndRobo(bytes));
    }

}
