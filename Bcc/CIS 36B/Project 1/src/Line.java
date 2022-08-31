public class Line extends OneDimensionalShape{
    Point firstPoint,secondPoint;

    public Line(Point A,Point B){
        uniqueID = ID;
        ID++;
        this.firstPoint = A;
        this.secondPoint = B;
    }

    @Override
    public void move(int x, int y, int z) {
        firstPoint.move(x, y, z);
        secondPoint.move(x, y, z);
    }

    @Override
    public String toString() {
        return "Unique ID " + uniqueID;
    }

    public int getLength(){
        return -1;
    }

}
