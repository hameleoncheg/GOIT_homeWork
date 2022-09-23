package editor;

public abstract class Shape {

    protected String colorShape;
    protected String nameShape;

    public Shape(String colorShape, String nameShape) {
        this.colorShape = colorShape;
        this.nameShape = nameShape;

    }
    public String getNameShape() {
        return nameShape;
    }
    public void setNameShape(String nameShape) {
        this.nameShape = nameShape;
    }
    public String getColorShape() {
        return colorShape;
    }
    public void setColorShape(String colorShape) {
        this.colorShape = colorShape;
    }
    public abstract String getShapeType();

    @Override
    public String toString() {
        return "Shape{" +
                "colorShape='" + colorShape + '\'' +
                ", nameShape='" + nameShape + '\'' +
                '}';
    }
}
