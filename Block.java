import java.awt.Color;

public class Block {
    public int x;
    public int y;
    public int z;
    public Color color;

    Type type;

    enum Type {
        STONE,
        GRASS,
        WATER
    }

    public Block(int x, int y, int z, Type type){
        this.x = x;
        this.y = y;
        this.z = z;
        this.type = type;
        switch (type) {
            case Type.GRASS:
                color = new Color(34,139,34);
                break;
            case Type.STONE:
                color = new Color(169,169,169);
                break;
            case Type.WATER:
                color = new Color(135, 206, 235);
                break;
        }
    }
}
