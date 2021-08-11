package Lesson7;

public class AbstractDriver {
    public static void main(String[] args) {
        AbstractShape[] shapeArray = new AbstractShape[4];

        // Polymorphism and abstract classes
        shapeArray[0] = new Circle(100, 100, 10);
        shapeArray[1] = new NewRectangle(300, 200, 10, 10);
        shapeArray[2] = new Circle(370, 400, 1);
        shapeArray[3] = new NewRectangle(270, 700, 10, 22);

        for (int i = 0; i < shapeArray.length; i++) {
            shapeArray[i].draw();
        }

        AbstractClosedShape[] closedShapeArray = new AbstractClosedShape[4];

        System.out.println("ClosedShapeArray from here:");

        closedShapeArray[0] = new Circle(100, 100, 10);
        closedShapeArray[1] = new NewRectangle(300, 200, 10, 10);
        closedShapeArray[2] = new Circle(370, 400, 1);
        closedShapeArray[3] = new NewRectangle(270, 700, 10, 22);

        for (int i = 0; i < closedShapeArray.length; i++) {
            closedShapeArray[i].calcArea();
            closedShapeArray[i].draw();
        }
    }
}
