package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJListWindow {
    public static void main(String[] args) {

        JFrame f = new JFrame("CoDejaVu : JList");
        f.setBounds(10,10,350,400);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0 ));

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        JLabel labelJList = new JLabel("JList", SwingConstants.CENTER);
        labelJList.setFont(new Font(null, Font.PLAIN, 30));
        labelJList.setBorder(BorderFactory.createLoweredBevelBorder());
        labelJList.setPreferredSize(new Dimension(250,50));


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout(20,20));
        JPanel centerPanelNorth = new JPanel();
        JTextField text = new JTextField(19);
        JButton agregar = new JButton("Agregar");



        JList<String> peopleList = new JList<>();
        DefaultListModel<String> model = new DefaultListModel<>();
        JScrollPane scrollPane = new JScrollPane(peopleList);
        peopleList.setModel(model);
        agregar.addActionListener(e -> {
            if (!text.getText().isEmpty()) {
                model.addElement(text.getText());
                text.setText("");
            }
        });
        peopleList.setFixedCellWidth(300);
        peopleList.setFixedCellHeight(30);
        model.addElement("Cristian David");
        model.addElement("Ana Milena");
        model.addElement("Miguel Angel");
        model.addElement("CoDeJaVu");
        model.addElement("Laura Lopez");
        model.addElement("Victor Castillo");
        model.addElement("Vicente Sanchez");
        JPanel centerPanelSouth = new JPanel();
        JButton button2 = new JButton("Eliminar");
        button2.addActionListener(e -> {
            int index = peopleList.getSelectedIndex();
            model.remove(index);
        });
        JButton button3 = new JButton("Borrar Lista");
        button3.addActionListener(e -> model.removeAllElements());


        mainPanel.add(northPanel, BorderLayout.NORTH);
        northPanel.add(labelJList);
        mainPanel.add(centerPanel);
        centerPanel.add(centerPanelNorth, BorderLayout.NORTH);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
        centerPanelNorth.add(text);
        centerPanelNorth.add(agregar);
        centerPanel.add(centerPanelSouth, BorderLayout.SOUTH);
        centerPanelSouth.add(button2);
        centerPanelSouth.add(button3);














        f.setContentPane(mainPanel);
        f.revalidate();
        f.repaint();

    }
}
