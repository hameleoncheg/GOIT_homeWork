package editor;

public class Circle extends Shape{
    final private String TYPE_SHAPE = "Circle";

    public Circle(String colorShape, String nameShape) {
        super(colorShape, nameShape);
    }

    @Override
    public String getShapeType() {
        return TYPE_SHAPE;
    }

}
