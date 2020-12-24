import javax.swing.*;

public abstract class Main {
    public static void main(String[] args) {
        JFrame mainWindow = new JFrame();
        mainWindow.add(new DrawPanel());
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setSize(800, 600);
        mainWindow.setVisible(true);
    }
}
