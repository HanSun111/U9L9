public class Point {
    private String label;
    private int x;
    private int y;
    public Point(String s, int x, int y){
        label = s;
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    public boolean equals(Point obj) {
        if(obj.getX() == getX() && obj.getY() == getY()){
            return true;
        }
        return false;
    }
}
