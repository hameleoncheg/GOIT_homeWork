package editor;

public class Oval extends Shape{
    public Oval(String colorShape, String sizeShape) {
        super(colorShape, sizeShape);
    }

    @Override
    public String getShapeType() {
        return "Oval";
    }
}
