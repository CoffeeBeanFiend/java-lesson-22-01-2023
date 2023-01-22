public class Rectagle extends Shape {
    private double a, b;

    public Rectagle(double a, double b) {
        super(4);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getCircumference() {
        return 2 * (a + b);
    }
}
