import java.awt.*;
import java.util.*;

public class hexagon implements Shapes {
    double side;

    public hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }
}
