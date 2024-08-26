import java.awt.*;
import java.util.*;

public class square implements Shapes {
    double squareSide;

    public square(double squareSide){
        this.squareSide = squareSide;
    }

    @Override
    public double calculateArea(){
        return squareSide * squareSide;

    }


}
