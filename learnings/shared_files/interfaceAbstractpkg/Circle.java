package interfaceAbstractpkg;

public class Circle implements Area {
    private double radius;
    private double area;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override compute method to calculate the area
    @Override
    public void compute() {
        area = PI * radius * radius;
    }

    // Override print method to display the area
    @Override
    public void print() {
        System.out.println("Area of Circle: " + area);
    }
}
