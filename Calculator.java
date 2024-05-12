import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame {

    private JTextField displayField;
    private double firstNumber;
    private String operation;

    public Calculator() {
        super("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 4, 2, 2));

        // Create the text field to display numbers
        displayField = new JTextField(20);

        // Create buttons
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton divideButton = new JButton("/");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton multiplyButton = new JButton("*");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton subtractButton = new JButton("-");
        JButton button0 = new JButton("0");
        JButton decimalButton = new JButton(".");
        JButtonaddButton = new JButton("+");
        JButton equalsButton = new JButton("=");
        JButton clearButton = new JButton("C");

        // Add buttons and text field to the frame
        this.add(displayField);
        this.add(button7);
        this.add(button8);
        this.add(button9);
        this.add(divideButton);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(multiplyButton);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(subtractButton);
        this.add(button0);
        this.add(decimalButton);
        this.add(addButton);
        this.add(equalsButton);
        this.add(clearButton);

        // Add action listeners to buttons
        button7.addActionListener(new NumberButtonListener("7"));
        button8.addActionListener(new NumberButtonListener("8"));
        button9.addActionListener(new NumberButtonListener("9"));
        divideButton.addActionListener(new OperationButtonListener("/"));
        button4.addActionListener(new NumberButtonListener("4"));
        button5.addActionListener(new NumberButtonListener("5"));
        button6.addActionListener(new NumberButtonListener("6"));
        multiplyButton.addActionListener(new OperationButtonListener("*"));
        button1.addActionListener(new NumberButtonListener("1"));
        button2.addActionListener(new NumberButtonListener("2"));
        button3.addActionListener(new NumberButtonListener("3"));
        subtractButton.addActionListener(new OperationButtonListener("-"));
        button0.addActionListener(new NumberButtonListener("0"));
        decimalButton.addActionListener(new NumberButtonListener("."));
        addButton.addActionListener(new OperationButtonListener("+"));
        equalsButton.addActionListener(new EqualsButtonListener());
        clearButton.addActionListener(new ClearButtonListener());

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    // Action listener for number buttons
    private class NumberButtonListener implements ActionListener {

        private String number;

        public NumberButtonListener(String number) {
            this.number = number;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            displayField.setText(displayField.getText() + number);
        }
    }

    // Action listener for operation buttons
    private class OperationButtonListener implements ActionListener {

        private String operation;

        public OperationButtonListener(String operation) {
            this.operation = operation;
            firstNumber = Double.parseDouble(displayField.getText());
            displayField.setText("");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Calculator.this.operation = operation;
        }
    }

    // Action listener for equals button
    private class EqualsButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double secondNumber = Double.parseDouble(displayField.getText());
            double result = 0;
            switch (Calculator.this.operation
