public class Player {
    public double x;
    public double y;
    public double z;

    public Double rX;
    public Double rY;
    public Double rZ;

    public Player(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;

        rX = Double.valueOf(1);
        rY = Double.valueOf(0);
        rZ = Double.valueOf(0);
    }
}
