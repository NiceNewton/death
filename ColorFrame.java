import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ColorFrame extends JFrame {

    private JLabel colorLabel;

    public ColorFrame() {
        super("Color Selector");
       // this.setDefaultCloseOperation(JFrame.EXIT_ON_ OMIT CLOSE);
        this.setLayout(new FlowLayout());

        JButton button1 = new JButton("Red (255, 0, 0)");
        JButton button2 = new JButton("Blue (0, 0, 255)");
        JButton button3 = new JButton("Custom...");

        colorLabel = new JLabel("Selected Color:");
        colorLabel.setOpaque(true); 

       
        button1.addActionListener(new ColorButtonListener(Color.RED, colorLabel));
        button2.addActionListener(new ColorButtonListener(Color.BLUE, colorLabel));
        button3.addActionListener(new CustomColorDialog());

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(colorLabel);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ColorFrame();
    }


    public class ColorButtonListener implements ActionListener {

        private Color color;
        private JLabel label;

        public ColorButtonListener(Color color, JLabel label) {
            this.color = color;
            this.label = label;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setBackground(color);
            label.setText("Selected Color: (" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ")");
        }
    }
    public class CustomColorDialog implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
}
