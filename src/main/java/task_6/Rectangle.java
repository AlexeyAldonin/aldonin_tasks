package task_6;

import task_5.Figure;

public class Rectangle extends Figure {

    String color;
    int side1;
    int side2;

    @Override
    protected int estimateSquare() {
        return this.side1 * side2;
    }

    @Override
    protected int estimatePerimeter() {
        return (side1 + side2) * 2;
    }

    boolean isFourSquare () {
        return this.side1 == this.side2;
    }

}
