import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FactorialSquareCalculator extends JFrame implements ActionListener {

    private JTextField inputField, resultField;
    private JButton factorialBtn, squareBtn;

    public FactorialSquareCalculator() {
        super("Factorial & Square Calculator");
        setSize(100,300);

        // Create text fields
        inputField = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make result field non-editable

        // Create buttons
        factorialBtn = new JButton("FACTORIAL");
        squareBtn = new JButton("SQUARE");

        // Add action listeners to buttons
        factorialBtn.addActionListener(this);
        squareBtn.addActionListener(this);

        // Layout components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter a number:"));
        panel.add(inputField);
        panel.add(factorialBtn);
        panel.add(squareBtn);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);

        add(panel);

        // Set frame properties

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText();
        try {
            int number = Integer.parseInt(input);
            double result = 0;
            if (e.getSource() == factorialBtn) {
                result = calculateFactorial(number);
            } else if (e.getSource() == squareBtn) {
                result = Math.pow(number, 2);
            }
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input. Please enter a number.");
        }
    }

    private int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }

    public static void main(String[] args) {
        new FactorialSquareCalculator();
    }
}