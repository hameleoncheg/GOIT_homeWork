package editor;

public class Quad  extends Shape{
    public Quad(String colorShape, String nameShape) {
        super(colorShape, nameShape);
    }

    @Override
    public String getShapeType() {
        return "Quad";
    }
}
