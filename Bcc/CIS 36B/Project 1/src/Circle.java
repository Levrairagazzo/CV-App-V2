public class Circle extends TwoDimensionalShape{
    int radius;
    Point center;

    public Circle(Point center, int radius){
        uniqueID = ID;
        ID++;
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void move(int x, int y, int z) {

    }

    @Override
    public String toString() {
        return "Unique ID " + uniqueID;
    }

    @Override
    public int getArea() {
        return 0;
    }
}
