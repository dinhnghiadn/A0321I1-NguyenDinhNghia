package b5_accessModifier_staticMethod_staticProperty.bai_tap.access_modifier;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

     public double getRadius() {
        return radius;
    }
     public double getArea() {
        return radius*radius*Math.PI;
    }
}
/* public: truy cập được do phạm vi rộng nhất
* protected: truy cập được do cùng package, khác package thì cần thông qua kế thừa
* default: truy cập được do cùng package
* private: không truy cập được do ngoài class
*  */
