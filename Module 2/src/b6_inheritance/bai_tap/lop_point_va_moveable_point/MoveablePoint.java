package b6_inheritance.bai_tap.lop_point_va_moveable_point;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arrayXYSpeed = new float[2];
        arrayXYSpeed[0] = xSpeed;
        arrayXYSpeed[1] = ySpeed;
        return arrayXYSpeed;
    }

    @Override
    public String toString() {
        return "(" + super.getX() +","+super.getY()+"), speed = ("+ xSpeed + ", " + ySpeed + ")";
    }
    public MoveablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
