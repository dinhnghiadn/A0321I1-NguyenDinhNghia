package b6_inheritance.bai_tap.lop_point_va_moveable_point;

public class Main {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint(5.0f,2.5f,2.0f,3.0f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
        System.out.println(moveablePoint.move().move());
    }
}
