package editor;

public class Triangle extends Shape{
    public Triangle(String colorShape, String sizeShape) {
        super(colorShape, sizeShape);
    }

    @Override
    public String getShapeType() {
        return "Triangle";
    }
}
