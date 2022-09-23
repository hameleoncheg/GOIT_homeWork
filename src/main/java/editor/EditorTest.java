package editor;

import java.util.Calendar;

public  class EditorTest {
    public static void main(String[] args) {
        Shape shape = new Circle("Blue","My first shape");
        System.out.println(shape.nameShape + " " + shape.getShapeType() + " is " + shape.colorShape);


    }
}
