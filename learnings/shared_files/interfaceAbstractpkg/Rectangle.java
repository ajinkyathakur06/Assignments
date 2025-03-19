package interfaceAbstractpkg;

public class Rectangle implements Area {
    private double length;
    private double breadth;
    private double area;

    // Constructor to initialize dimensions
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Override compute method to calculate the area
    @Override
    public void compute() {
        area = length * breadth;
    }

    // Override print method to display the area
    @Override
    public void print() {
        System.out.println("Area of Rectangle: " + area);
    }
}
