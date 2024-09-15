import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class RayTracingPanel extends JPanel {
    private int xOffSet;
    private int yOffSet;

    private int pixelSize;

    private int height;
    private int width;

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
