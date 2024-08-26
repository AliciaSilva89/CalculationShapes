import java.awt.*;
import java.util.*;

public class circle implements Shapes {
    double radius;
    double pi = 3.14;

    public circle(double radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }

    @Override
    public double calculateArea(){
        return 2 * pi * radius;
    }


}
