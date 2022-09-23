package editor;

public class Triangle extends Shape{

    final private String TYPE_SHAPE = "Triangle";
    public Triangle(String colorShape, String nameShape) {
        super(colorShape, nameShape);
    }

    @Override
    public String getShapeType() {
        return TYPE_SHAPE ;
    }
}
