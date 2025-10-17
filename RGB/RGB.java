import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RGB extends JFrame {
    private JTextField redField, greenField, blueField;
    private JButton computeButton;
    private JPanel colorPanel;

    public RGB(String name) {
        super("Unit 5 Assignment of " + name);

        setLayout(new GridLayout(5, 2, 5, 5));

        add(new JLabel("Red:"));
        redField = new JTextField(3);
        add(redField);

        add(new JLabel("Green:"));
        greenField = new JTextField(3);
        add(greenField);

        add(new JLabel("Blue:"));
        blueField = new JTextField(3);
        add(blueField);

        computeButton = new JButton("COMPUTE");
        computeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int red = Integer.parseInt(redField.getText());
                    int green = Integer.parseInt(greenField.getText());
                    int blue = Integer.parseInt(blueField.getText());

                    if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
                        throw new IllegalArgumentException("Values must be between 0 and 255.");
                    }

                    colorPanel.setBackground(new Color(red, green, blue));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(RGB.this, "Values must be integers.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(RGB.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(computeButton);

        colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(50, 50));
        add(colorPanel);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter your name:", "Name", JOptionPane.QUESTION_MESSAGE);
        if (name != null && !name.isEmpty()) {
            new RGB(name).setVisible(true);
        }
    }
}
