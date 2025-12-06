package window.panel;

import window.ScreenMode;

import javax.swing.*;
import java.awt.*;

public class Import extends JPanel {
    JFrame window = new JFrame();
    JLabel initLabel;
    ScreenMode scMode = ScreenMode.IMPORT;

    public boolean init = false;

    public Import(String t) {
        initLabel = new JLabel(t);
        initLabel.setLayout(null);
        initLabel.setBackground(Color.black);
        initLabel.setText(t);
        initLabel.setBounds(200, 200, 0, 20);
        this.add(initLabel);
    }

    public void popUp(String t, int w, int h) {
        window.setTitle(t);
        window.setSize(w, h);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        init = true;
    }

    public void close() {
        window.dispose();
    }
}
