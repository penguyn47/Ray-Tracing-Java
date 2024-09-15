import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class RayTracingPanel extends JPanel {
    private int xOffSet;
    private int yOffSet;

    private int pixelSize;

    private int height;
    private int width;

    public World world;
    public Player player;

    public RayTracingPanel(
        int xOffSet,
        int yOffSet,
        int pixelSize,
        int height,
        int width
    ) {
        this.xOffSet = xOffSet;
        this.yOffSet = yOffSet;
        this.pixelSize = pixelSize;
        this.height = height;
        this.width = width;

        world = new World(20, 20, 20);
        player = new Player(10, 10, 10);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                
                Color color = RandomColorGenerator.getRandomColor();
                
                g.setColor(color);
                g.fillRect(i * pixelSize +xOffSet, j * pixelSize + yOffSet, pixelSize, pixelSize);
            }
        }
    }
}
