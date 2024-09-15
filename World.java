public class World {
    public int worldSizeX;
    public int worldSizeY;
    public int worldSizeZ;

    Block[][][] blocks;

    public World(int x, int y, int z){
        this.worldSizeX = x;
        this.worldSizeY = y;
        this.worldSizeZ = z;

        blocks = new Block[worldSizeX][worldSizeY][worldSizeZ];
        

    }
}
