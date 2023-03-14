import java.awt.event.*;

public class MyMouseAdapter extends MouseAdapter {
    public void mouseExited(MouseEvent e) {
        if (e.getY() < 0) {
            System.out.println("Вихід курсора за верхню межу вікна");
        }
    }
}

