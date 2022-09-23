package editor;

public  class EditorTest {

    public void namePrint(Shape s){
        System.out.println(s.nameShape);
    }
    public static void main(String[] args) {

        Shape shape = new Quad("Blue","Quad");
        System.out.println(shape.getShapeType() + " is " + shape.colorShape);

        PrintShape print = new PrintShape();
        print.printed(shape);

    }
}
