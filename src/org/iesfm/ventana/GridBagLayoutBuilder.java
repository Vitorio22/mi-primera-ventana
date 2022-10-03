package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutBuilder {

    public static void main(String[] args) {

        JFrame windowGridBagLayout = new JFrame();
        windowGridBagLayout.setBounds(50, 50, 350, 600);
        windowGridBagLayout.setVisible(true);
        windowGridBagLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());

        JLabel labelName = new JLabel("Full Name");
        GridBagConstraints constraintsName = new GridBagConstraints(
                0, 0, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH,
        )




        mainPanel.add(labelName)

    }
}
