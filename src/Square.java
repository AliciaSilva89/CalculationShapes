public class Square implements Shapes {
    double squareSide;

    public Square(double squareSide){
        this.squareSide = squareSide;
    }

    @Override
    public double calculateArea(){
        return squareSide * squareSide;

    }


}
