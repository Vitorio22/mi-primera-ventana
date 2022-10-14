package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class MoveOptionsWindow extends JFrame {

    private JPanel mainPanel;




    public static void main(String[] args) {

        JFrame f = new JFrame("Move Options");
    }

    public MoveOptionsWindow() throws HeadlessException {
        this.setBounds(10,10,350,400);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(createMainPanel());
        repaint();
        revalidate();
    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,5));
        mainPanel.add(createListWest());
        return mainPanel;
    }

    private JList createListWest(){

        return createListWest();
    }

    private JList createListEast(){

        return createListEast();
    }

    private JButton toRight(){

        return toRight();
    }
    private JButton toLeft(){

        return toLeft();
    }

    private JButton addAll(){

        return addAll();
    }

    private JButton deleteAll(){

        return deleteAll();
    }




}
