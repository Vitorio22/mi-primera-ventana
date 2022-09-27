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

        JButton northButton = new JButton("Hide North Border");
        northButton.addActionListener(e -> {
            northButton.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton southButton = new JButton("Hide South Border");
        southButton.addActionListener(e -> {
            southButton.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton westButtonbutton3 = new JButton("Hide West Border");
        westButtonbutton3.addActionListener(e -> {
            westButtonbutton3.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton eastButtonbutton4 = new JButton("Hide East Border");
        eastButtonbutton4.addActionListener(e -> {
            eastButtonbutton4.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });
        JButton centerButton = new JButton("Hide Center Border");
        centerButton.addActionListener(e -> {
            centerButton.setVisible(false);
            mainPanel.repaint();
            mainPanel.revalidate();
        });

        mainPanel.add(northButton, BorderLayout.NORTH);
        mainPanel.add(southButton, BorderLayout.SOUTH);
        mainPanel.add(westButtonbutton3, BorderLayout.WEST);
        mainPanel.add(eastButtonbutton4, BorderLayout.EAST);
        mainPanel.add(centerButton, BorderLayout.CENTER);

        windowBorderLayout.setContentPane(mainPanel);
        windowBorderLayout.repaint();
        windowBorderLayout.revalidate();
    }
}
