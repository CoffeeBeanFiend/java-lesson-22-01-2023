public class Main {
    public static void main(String[] args) {
        Shape someShapes[] = {
                new Square(5),
                new Rectagle(5, 4),
                new Square(10),
        };

        double areaOfAllShapes = 0;

        for (Shape aShape: someShapes) {
            double currentArea = aShape.getArea();
            System.out.println("Are of shape: " + currentArea);
            areaOfAllShapes += currentArea;
        }

        System.out.println("Area of all shapes is: " + areaOfAllShapes);
    }
}
