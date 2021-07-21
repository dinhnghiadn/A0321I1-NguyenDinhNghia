package b7_abstract_class_va_interface.bai_tap.TrienKhaiInterfaceResizeableChoCacLopHinhHoc;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle(5,10);
        shapes[2] = new Square(5,"red",false);
        shapes[3] = new Circle(5,"green",true);
        for(Shape shape : shapes){
            if (shape instanceof Circle) {
                System.out.println("Circle area: " + ((Circle)shape).getArea());
                ((Circle)shape).resize(1);
                System.out.println("Circle area after resize: " + ((Circle)shape).getArea());
            }
            if (shape instanceof Rectangle){
                if (shape instanceof Square){
                    System.out.println("Square area: " + ((Square) shape).getArea());
                    ((Square) shape).resize(1);
                    System.out.println("Square area after resize: " + ((Square) shape).getArea());
                } else {
                    System.out.println("Rectangle area: " + ((Rectangle) shape).getArea());
                    ((Rectangle) shape).resize(1);
                    System.out.println("Rectangle area after resize: " + ((Rectangle) shape).getArea());
                }
            }
        }
    }
}
