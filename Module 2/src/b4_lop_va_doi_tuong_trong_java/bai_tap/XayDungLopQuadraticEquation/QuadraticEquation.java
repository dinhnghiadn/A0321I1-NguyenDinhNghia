package b4_lop_va_doi_tuong_trong_java.bai_tap.XayDungLopQuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        return b*b - 4*a*c;
    }
    public double getRoot1(){
        double delta = getDiscriminant();
        if ( delta >= 0){
            return (-b+Math.pow(delta,0.5))/(2*a);
        } else return 0;
    }
    public double getRoot2(){
        double delta = getDiscriminant();
        if ( delta >= 0){
            return (-b-Math.pow(delta,0.5))/(2*a);
        } else return 0;
    }
}
