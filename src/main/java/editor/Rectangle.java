package editor;

public class Rectangle extends Shape{
    public Rectangle(String colorShape, String nameShape) {
        super(colorShape, nameShape);
    }

    @Override
    public String getShapeType() {
        return "Rectangle";
    }
}
