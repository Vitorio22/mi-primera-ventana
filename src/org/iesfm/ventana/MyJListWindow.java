package org.iesfm.ventana;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyJListWindow extends JFrame {

    private static JPanel mainPanel;
    private static JPanel northPanel;
    private static JLabel labelJList;
    private static JPanel centerPanel;
    private static JPanel centerPanelNorth;
    private static JTextField text;
    private static JButton agregar;
    private static JList<String> peopleList;
    private static DefaultListModel<String> model;
    private static JScrollPane scrollPane;
    private static JPanel centerPanelSouth;
    private static JButton button2;
    private static JButton button3;
    private static JPanel panelSouth;
    private static JLabel label;

    public MyJListWindow() throws HeadlessException {
        this.setBounds(10,10,350,400);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("CoDejaVu : JList");


        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0 ));
        northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        labelJList = new JLabel("JList", SwingConstants.CENTER);
        labelJList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (e.getSource() == labelJList) {
                    labelJList.setForeground(Color.RED);
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                if (e.getSource() == labelJList) {
                    labelJList.setForeground(Color.BLACK);
                }
            }
        });
        labelJList.setFont(new Font(null, Font.PLAIN, 30));
        labelJList.setBorder(BorderFactory.createLoweredBevelBorder());
        labelJList.setPreferredSize(new Dimension(250,50));


        centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout(20,20));
        centerPanelNorth = new JPanel();
        text = new JTextField(19);
        agregar = new JButton("Agregar");


        peopleList = new JList<>();
        model = new DefaultListModel<>();
        scrollPane = new JScrollPane(peopleList);
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
        centerPanelSouth = new JPanel();
        button2 = new JButton("Eliminar");
        button2.addActionListener(e -> {
            int index = peopleList.getSelectedIndex();
            model.remove(index);
        });
        button3 = new JButton("Borrar Lista");
        button3.addActionListener(e -> model.removeAllElements());

        panelSouth = new JPanel();
        label = new JLabel();
        panelSouth.setLayout(new BorderLayout(10,10));
        panelSouth.setBorder(BorderFactory.createEmptyBorder(10,0,0,0 ));
        panelSouth.add(label, BorderLayout.CENTER);
        mainPanel.add(panelSouth, BorderLayout.SOUTH);
        peopleList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                label.setText("Seleccionado: " + peopleList.getSelectedValue());
            }
        });



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
