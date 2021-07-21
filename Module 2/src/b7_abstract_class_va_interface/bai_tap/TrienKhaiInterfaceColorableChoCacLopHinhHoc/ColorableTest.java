package b7_abstract_class_va_interface.bai_tap.TrienKhaiInterfaceColorableChoCacLopHinhHoc;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square(5,"red",false);
        shapes[3] = new Circle(5,"green",true);
        for (Shape shape : shapes){

            if ( shape instanceof Circle){
                System.out.println("Circle area: " + ((Circle)shape).getArea());
            }
            if (shape instanceof Rectangle){
                if ( shape instanceof Square){
                    System.out.println("Square area: " + ((Square)shape).getArea()); // ép kiểu tường minh về Square
                    ((Square)shape).howToColor();
                } else System.out.println("Rectangle area: " + ((Rectangle)shape).getArea());

            }
        }

    }
}
