public class Main {

    public static void main(String[] args) {
        // Kiểm thử class Shape
        System.out.println("----------SHAPE--------------");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
        //Kiểm thử class Circle
        System.out.println("----------CIRCLE--------------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        //Kiểm thử class RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

//        triển khai interface Resizeable
        System.out.println("Colorable Cricle");
        circle.howToColor();
        System.out.println(circle);
        System.out.println("Colorable Rectangle");
        rectangle.howToColor();
        System.out.println(rectangle);
    }
}
