package b15_exception_and_debug.bai_tap.su_dung_lop_IllegalTriangleException;

public class TamGiacException extends Exception{
    public TamGiacException (String message)
    {super(message);}
    public TamGiacException(){
        super("Invalid");
    }
}
