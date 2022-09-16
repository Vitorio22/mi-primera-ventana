package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 2000, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Este es el panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.BLACK);

        JPanel primaryPanel = new JPanel();
        primaryPanel.setBounds(0, 0, 100, 100);
        primaryPanel.setBackground(Color.RED);
        JLabel nameLabel = new JLabel("Nombre:");
        primaryPanel.add(nameLabel);
        JTextField nameText = new JTextField(16);
        primaryPanel.add(nameText);
        JButton nameButton = new JButton("Aceptar");
        primaryPanel.add(nameButton);

        JPanel secondPanel = new JPanel();
        secondPanel.setBounds(200, 0, 100,100);
        secondPanel.setBackground(Color.YELLOW);
        JLabel surNameLabel = new JLabel("Apellido:");
        secondPanel.add(surNameLabel);
        JTextField surNameText = new JTextField(16);
        secondPanel.add(surNameText);
        JButton surButton = new JButton("Aceptar");
        secondPanel.add(surButton);

        mainPanel.add(primaryPanel);
        mainPanel.add(secondPanel);

        f.setContentPane(mainPanel);
        f.repaint();
        f.revalidate();

    }
}
