package main;

import window.Window;
import window.panel.Import;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) throws InterruptedException {
        Import imp = new Import("Now importing...");
        imp.popUp("Now importing...", 300, 200);
        Thread.sleep(3000);
        imp.close();
        Window window = new Window("PrizmaOS", 1400, 900);
    }
}
