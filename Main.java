import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Double x = Double.valueOf(0);
        Double y = Double.valueOf(1);
        Double z = Double.valueOf(0);

        Vector3D result = AngleRotator.rotateX(new Vector3D(x, y, z), -Math.PI/2);

        // final int pixelSize = 5;
        // final int height = 700/pixelSize;
        // final int width = 1100/pixelSize;
        // JFrame frame = new JFrame("Ray Tracing Display");
        // RayTracingPanel panel = new RayTracingPanel(
        //     40,
        //     30,
        //     pixelSize,
        //     height,
        //     width);

        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(1200, 800);
        // frame.add(panel);
        // frame.setVisible(true);
    }
}
