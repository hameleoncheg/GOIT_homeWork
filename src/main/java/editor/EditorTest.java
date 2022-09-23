package editor;

import java.util.Calendar;

public  class EditorTest {


    public static void main(String[] args) {

        Shape shape = new Quad("Blue","Quad");
        System.out.println(shape.getShapeType() + " is " + shape.colorShape);

        printShape print = new printShape();
        print.printed(shape);

    }
}
