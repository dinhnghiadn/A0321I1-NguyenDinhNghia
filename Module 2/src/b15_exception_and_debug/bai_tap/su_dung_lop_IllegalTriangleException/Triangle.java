package b15_exception_and_debug.bai_tap.su_dung_lop_IllegalTriangleException;

public class Triangle {
    private int size1;
    private int size2;
    private int size3;

    public Triangle(int size1, int size2, int size3) throws TamGiacException{
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        if (size1 <= 0 || size2 <= 0 || size3 <= 0 || size1 + size2 < size3 || size1 + size3 < size2 || size2 + size3 < size1){
            throw new TamGiacException("Không phải 3 cạnh tam giác !");
        }
    }

    public int getSize1() {
        return size1;
    }

    public void setSize1(int size1) {
        this.size1 = size1;
    }

    public int getSize2() {
        return size2;
    }

    public void setSize2(int size2) {
        this.size2 = size2;
    }

    public int getSize3() {
        return size3;
    }

    public void setSize3(int size3) {
        this.size3 = size3;
    }
}
