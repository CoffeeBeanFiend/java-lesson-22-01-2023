public abstract class Shape implements HasArea, HasCircumference, HasCorners {
    private int numberOfCorners;

    Shape(int numberOfCorners) {
        this.numberOfCorners = numberOfCorners;
    }

    public int getNumberOfCorners() {
        return numberOfCorners;
    }
}
