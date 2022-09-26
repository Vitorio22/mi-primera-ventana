package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayoutWindow {
    public static void main(String[] args) {
        JFrame windowBorderLayout = new JFrame();
        windowBorderLayout.setBounds(50, 50, 550, 400);
        windowBorderLayout.setVisible(true);
        windowBorderLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout( 10, 10));

        JButton button1 = new JButton("Hide North Border");
        button1.addActionListener(e -> {
            button1.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton button2 = new JButton("Hide South Border");
        button2.addActionListener(e -> {
            button2.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton button3 = new JButton("Hide West Border");
        button3.addActionListener(e -> {
            button3.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton button4 = new JButton("Hide East Border");
        button4.addActionListener(e -> {
            button4.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton button5 = new JButton("Hide Center Border");
        button5.addActionListener(e -> {
            button5.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });

        mainPanel.add(button1, BorderLayout.NORTH);
        mainPanel.add(button2, BorderLayout.SOUTH);
        mainPanel.add(button3, BorderLayout.WEST);
        mainPanel.add(button4, BorderLayout.EAST);
        mainPanel.add(button5, BorderLayout.CENTER);

        windowBorderLayout.setContentPane(mainPanel);
        windowBorderLayout.repaint();
        windowBorderLayout.revalidate();
    }
}
