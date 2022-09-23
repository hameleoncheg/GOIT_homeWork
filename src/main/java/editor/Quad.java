package editor;

public class Quad  extends Shape{

    final private String TYPE_SHAPE = "Quad";
    public Quad(String colorShape, String nameShape) {
        super(colorShape, nameShape);
    }

    @Override
    public String getShapeType() {
        return TYPE_SHAPE;
    }
}
