import javafx.geometry.Point2D;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PartOne {

    private Map<Character, Point2D> steps = Map.of(
            '^', new Point2D(0, -1),
            'v', new Point2D(0, 1),
            '>', new Point2D(1, 0),
            '<', new Point2D(-1, 0));

    private Set<Point2D> coordinates = new HashSet<>();
    private Point2D position = new Point2D(0, 0);

    public PartOne() {
        this.coordinates.add(position);
    }

    public int getHousesCountReceivedAtLeastOnePresent(byte[] bytes) {
        for (byte direction : bytes) {
            position = position.add(steps.get((char) direction));
            coordinates.add(position);
        }
        return coordinates.size();
    }
}
