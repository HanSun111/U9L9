public class ThreeDPoint extends Point{
    private int z;
    public ThreeDPoint(String s, int x, int y, int z){
        super(s, x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return super.toString() + ", z = " + z;
    }

    public boolean equals(ThreeDPoint obj) {
        return super.equals(obj) && obj.getZ() == getZ();
    }
}
