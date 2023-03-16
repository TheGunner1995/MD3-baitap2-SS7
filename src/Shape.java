public class Shape {
    private String Color;
    private boolean Filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        Color = color;
        Filled = filled;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean filled) {
        Filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "Color='" + Color + '\'' +
                ", Filled=" + Filled +
                '}';
    }


}
