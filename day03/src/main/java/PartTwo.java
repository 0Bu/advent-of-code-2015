import javafx.geometry.Point2D;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PartTwo {

    private Map<Character, Point2D> steps = Map.of(
            '^', new Point2D(0, -1),
            'v', new Point2D(0, 1),
            '>', new Point2D(1, 0),
            '<', new Point2D(-1, 0));

    private Set<Point2D> coordinates = new HashSet<>();
    private Point2D santa = new Point2D(0, 0);
    private Point2D robo = new Point2D(0, 0);

    public PartTwo() {
        this.coordinates.add(santa);
    }

    public int getHousesCountReceivedAtLeastOnePresentBySantaAndRobo(byte[] bytes) {
        for (int i = 0; i < bytes.length; i += 2) {
            santa = santa.add(steps.get((char) bytes[i]));
            if (bytes.length > i + 1) {
                robo = robo.add(steps.get((char) bytes[i + 1]));
            }
            coordinates.addAll(List.of(santa, robo));
        }
        return coordinates.size();
    }
}
