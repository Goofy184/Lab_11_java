import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
public class MouseAdapterExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Мій додаток");
        f.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int y=e.getY();
                if(y <= f.getInsets().top){
                    System.out.println("Мишка перетнула верхню границю");
                }

            }
        });
        f.setSize(300, 300);
        f.setVisible(true);
    }
}