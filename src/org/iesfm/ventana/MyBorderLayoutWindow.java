package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayoutWindow {
    public static void main(String[] args) {
        JFrame windowBorderLayout = new JFrame();
        windowBorderLayout.setBounds(50, 50, 350, 600);
        windowBorderLayout.setVisible(true);
        windowBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JButton button1 = new JButton("Hide North Border");
        JButton button2 = new JButton("Hide South Border");
        JButton button3 = new JButton("Hide West Border");
        JButton button4 = new JButton("Hide East Border");
        JButton button5 = new JButton("Hide Center Border");
    }
}
