package task2;

import java.awt.*;

public interface PixelDrawer {
    /**
     * Рисует один пиксель
     * @param x горизонтальная координата пикселя
     * @param y вертикальная координата пикселя
     * @param c цвет пискселя
     */
    void colorPixel(int x, int y, Color c);

    default void colorPixel(int x, int y, Color color, boolean isLineVerticallyOriented) {
        if (isLineVerticallyOriented) {
            colorPixel(y, x, color);
            return;
        }
        colorPixel(x, y, color);
    }
}
