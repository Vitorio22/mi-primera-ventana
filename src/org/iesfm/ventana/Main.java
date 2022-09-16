package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Este es el panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.yellow);
        // CREAR UN FORMULARIO
        //Peticion
        JLabel nameLabel = new JLabel("Usuario:");
        mainPanel.add(nameLabel);
        //Introduccion de texto
        JTextField nameText = new JTextField(16);
        mainPanel.add(nameText);
        //Boton de aceptar
        JButton acceptButton = new JButton("Aceptar");
        mainPanel.add(acceptButton);

        JPanel secondPanel = new JPanel();

        JLabel surNameLabel = new JLabel("Apellido:");
        secondPanel.add(surNameLabel);

        TextField surNameText = new TextField(16);
        secondPanel.add(surNameText);

        secondPanel.setBackground(Color.cyan);

        f.add(mainPanel, BorderLayout.CENTER);
        f.add(secondPanel, BorderLayout.PAGE_END);
        f.setLayout(new GridLayout(2, 2));
        f.repaint();
        f.revalidate();

    }
}
