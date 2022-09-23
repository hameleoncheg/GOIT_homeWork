package editor;

import java.util.Calendar;

public  class EditorTest {

    public void namePrint(Shape s){
        System.out.println(s.nameShape);
    }
    public static void main(String[] args) {

        Shape shape = new Quad("Blue","name of Shape");
        System.out.println(shape.getShapeType() + " is " + shape.colorShape);

        printShape print = new printShape();
        print.printed(shape);

    }
}
