package solution2;

public class Point {

    private int x = 0;
    private int y = 0;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double getDistance (int x, int y){

        double distance = 0;
        int bottom = 0;
        int height = 0;

        bottom =  x - this.x;
        height = y - this.y;
        distance = Math.pow(bottom, 2) + Math.pow(height, 2);
        distance = Math.sqrt(distance);

        return distance;
    }
}
