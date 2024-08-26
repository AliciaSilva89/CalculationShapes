import java.awt.*;
import java.util.*;

public class rectangle implements Shapes {
    double width;
    double height;

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
