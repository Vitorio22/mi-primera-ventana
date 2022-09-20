import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyRadioButtonsWindow {
    public static void main(String[] args) {
        JFrame windowRadioButton = new JFrame();
        windowRadioButton.setBounds(50, 50, 350, 600);
        windowRadioButton.setVisible(true);
        windowRadioButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.gray);

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("Linux");
        radioButton1.setActionCommand("Linux");
        JRadioButton radioButton2 = new JRadioButton("Windows");
        radioButton2.setActionCommand("Windows");
        JRadioButton radioButton3 = new JRadioButton("Macintosh");
        radioButton3.setActionCommand("Macintosh");
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(new ImageIcon("Linux.png"));

        JButton button = new JButton("Aceptar");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = buttonGroup.getSelection().getActionCommand();
                JOptionPane.showMessageDialog(windowRadioButton, "Has seleccionado " + selected);

                imageLabel.setIcon(new ImageIcon(selected + ".png"));
            }
        });

        mainPanel.add(radioButton1);
        mainPanel.add(radioButton2);
        mainPanel.add(radioButton3);
        mainPanel.add(imageLabel);
        mainPanel.add(button);

        windowRadioButton.setContentPane(mainPanel);
        windowRadioButton.repaint();
        windowRadioButton.revalidate();

    }

}
