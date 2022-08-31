public abstract class Shape {
    protected static int ID = 1001;
    protected int uniqueID;
    public int getID() {
        return uniqueID;
    }

    public abstract void move(int x, int y, int z);

    @Override
    public abstract String toString();
}
