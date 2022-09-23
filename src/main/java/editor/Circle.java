package editor;

public class Circle extends Shape{

    public Circle(String colorShape, String nameShape) {
        super(colorShape, nameShape);
    }

    @Override
    public String getShapeType() {
        return "Circle";
    }

}
