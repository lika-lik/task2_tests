import pixel_drawer.GraphicsPixelDrawer;
import task2.PixelDrawer;
import task2.graphics_impl.MyFactoryImpl;
import task2.testing.TestArcs;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics basicGraphics) {
        BufferedImage bufferedImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, getWidth(), getHeight());
        graphics.setColor(Color.BLACK);
        test();
        basicGraphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
    }

    private void test() {
        try {
            TestArcs.startTest(
                    new MyFactoryImpl(),
                    TestArcs.IMG_YOUR | TestArcs.IMG_IDEAL | TestArcs.IMG_DIFF,
                    TestArcs.TEST_ARC | TestArcs.TEST_FILL,
                    true,
                    "."
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
