package window;

import javax.swing.*;

public class Window {
    JFrame window = new JFrame();
    ScreenMode scMode = ScreenMode.MAIN;

    public Window(String t, int w, int h) {
        window.setTitle(t);
        window.setSize(w, h);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
