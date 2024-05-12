import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    private JLabel titleLabel, nameLabel, emailLabel, passwordLabel, genderLabel, countryLabel, languageLabel;
    private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup genderGroup;
    private JComboBox<String> countryComboBox;
    private JCheckBox javaCheckBox, pythonCheckBox, cppCheckBox;
    private JButton submitButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2));

        titleLabel = new JLabel("Registration Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(titleLabel);

        nameLabel = new JLabel("Name:");
        add(nameLabel);
        nameField = new JTextField();
        add(nameField);

        emailLabel = new JLabel("Email:");
        add(emailLabel);
        emailField = new JTextField();
        add(emailField);

        passwordLabel = new JLabel("Password:");
        add(passwordLabel);
        passwordField = new JPasswordField();
        add(passwordField);

        genderLabel = new JLabel("Gender:");
        add(genderLabel);
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel(new FlowLayout());
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        add(genderPanel);

        countryLabel = new JLabel("Country:");
        add(countryLabel);
        String[] countries = {"USA", "UK", "Canada", "Australia", "India"};
        countryComboBox = new JComboBox<>(countries);
        add(countryComboBox);

        languageLabel = new JLabel("Languages:");
        add(languageLabel);
        javaCheckBox = new JCheckBox("Java");
        pythonCheckBox = new JCheckBox("Python");
        cppCheckBox = new JCheckBox("C++");
        JPanel languagePanel = new JPanel(new FlowLayout());
        languagePanel.add(javaCheckBox);
        languagePanel.add(pythonCheckBox);
        languagePanel.add(cppCheckBox);
        add(languagePanel);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String email = emailField.getText();
        char[] password = passwordField.getPassword();
        String gender = maleRadioButton.isSelected() ? "Male" : "Female";
        String country = (String) countryComboBox.getSelectedItem();
        String languages = "";
        if (javaCheckBox.isSelected()) languages += "Java ";
        if (pythonCheckBox.isSelected()) languages += "Python ";
        if (cppCheckBox.isSelected()) languages += "C++ ";
        JOptionPane.showMessageDialog(this, "Name: " + name + "\nEmail: " + email + "\nGender: " + gender +
                "\nCountry: " + country + "\nLanguages: " + languages);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}