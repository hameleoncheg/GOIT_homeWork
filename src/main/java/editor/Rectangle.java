package editor;

public class Rectangle extends Shape{

    final private String TYPE_SHAPE = "Rectangle";
    public Rectangle(String colorShape, String nameShape) {
        super(colorShape, nameShape);
    }

    @Override
    public String getShapeType() {
        return TYPE_SHAPE;
    }
}
