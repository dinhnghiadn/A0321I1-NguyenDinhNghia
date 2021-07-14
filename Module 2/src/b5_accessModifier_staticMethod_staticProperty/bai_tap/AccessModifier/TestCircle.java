package b5_accessModifier_staticMethod_staticProperty.bai_tap.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius:" +circle.getRadius());
        System.out.println("Area:" +circle.getArea());
    }
}
