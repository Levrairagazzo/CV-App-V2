public class Sphere extends ThreeDimensionalShape{
    int radius;
    Point center;

    public Sphere (Point center, int radius){
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

    @Override
    public int getVolume() {
        return 0;
    }
}
