package main;

import window.Window;
import static java.lang.System.out;

import javax.swing.*;

public class Main extends JFrame {
    @version("0.0.0")
    static void main() {
        Window window = new Window("PrizmaOS", 1400, 900);
    }

    private @interface version {
        String value();
    }
}
