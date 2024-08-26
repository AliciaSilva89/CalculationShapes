public class Hexagon implements Shapes {
    double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * side * side) / 2;
    }
}
