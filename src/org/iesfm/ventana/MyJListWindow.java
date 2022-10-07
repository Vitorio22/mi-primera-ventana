package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MyJListWindow {
    public static void main(String[] args) {

        JFrame f = new JFrame("CoDejaVu : JList");
        f.setBounds(10,10,350,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0 ));

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        JLabel labelJList = new JLabel("JList", SwingConstants.CENTER);
        labelJList.setFont(new Font(null, 0, 30));
        labelJList.setBorder(BorderFactory.createLoweredBevelBorder());
        labelJList.setPreferredSize(new Dimension(250,50));
        mainPanel.add(northPanel);
        northPanel.add(labelJList);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout(20,20));
        JPanel centerPanelNorth = new JPanel();
        JTextField text = new JTextField();
        JButton button = new JButton("Agregar");
        JPanel centerPanelCenter = new JPanel();
        JList<String> peopleList = new JList<>();
        DefaultListModel<String> model = new DefaultListModel<>();
        peopleList.setModel(model);
        model.addElement("Cristian David");
        model.addElement("Ana Milena");
        model.addElement("Miguel Angel");
        model.addElement("CoDeJaVu");
        JPanel centerPanelSouth = new JPanel();
        JButton button2 = new JButton("Eliminar");
        JButton button3 = new JButton("Borrar Lista");
        mainPanel.add(centerPanel);
        centerPanel.add(centerPanelNorth, BorderLayout.NORTH);
        centerPanelNorth.add(text);
        centerPanelNorth.add(button);
        centerPanel.add(centerPanelCenter, BorderLayout.CENTER);
        centerPanelCenter.add(peopleList);
        centerPanel.add(centerPanelSouth, BorderLayout.SOUTH);
        centerPanelSouth.add(button2);
        centerPanelSouth.add(button3);














        f.setContentPane(mainPanel);
        f.revalidate();
        f.repaint();

    }
}
