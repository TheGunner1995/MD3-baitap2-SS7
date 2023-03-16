public class Rectangle extends Shape implements Colorable{
    private double w =1.0;
    private double h =1.0;

    public Rectangle() {
    }

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }
    public Rectangle(double w, double h , String color, boolean filled) {
        super(color, filled);
        this.w = w;
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "w=" + w +
                ", h=" + h + super.toString()+
                '}';
    }


    @Override
    public void howToColor() {
        setColor("black");
    }
}
