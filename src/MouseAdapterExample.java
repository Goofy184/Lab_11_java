import java.awt.*;

public class MouseAdapterExample {
    public static void main(String[] args) {
        Frame f = new Frame("Мій додаток");
        f.addMouseMotionListener(new MyMouseAdapter());
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
