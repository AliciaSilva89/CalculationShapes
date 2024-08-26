import java.awt.*;
import java.util.*;

public class triangle implements Shapes {
    double base;
    double height;

    public triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
       return (base * height) / 2;
    }
}
