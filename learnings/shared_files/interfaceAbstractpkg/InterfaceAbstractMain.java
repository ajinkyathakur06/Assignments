package interfaceAbstractpkg;

public class InterfaceAbstractMain {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        rectangle.compute();
        rectangle.print();

        // Create a Circle object
        Circle circle = new Circle(4.0);
        circle.compute();
        circle.print();
    }
}