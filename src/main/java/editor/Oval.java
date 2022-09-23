package editor;

public class Oval extends Shape{

    final private String TYPE_SHAPE = "Oval";
    public Oval(String colorShape, String nameShape) {
        super(colorShape, nameShape);
    }

    @Override
    public String getShapeType() {
        return TYPE_SHAPE;
    }
}
