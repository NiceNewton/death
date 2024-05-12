import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.*;

class sw extends JFrame implements ActionListener {

	JButton Input;
	JTextField roll_in, name_in, marks_in, result;

	sw() {
		super("LOL");
		this.setSize(250,150);
		roll_in = new JTextField(10);
		marks_in = new JTextField(10);
		name_in = new JTextField(10);
		result = new JTextField(10);
		result.setEditable(false);

		Input = new JButton("Submit");
		Input.addActionListener(this);

		JPanel panel = new JPanel();
		panel.add(new JLabel("Roll No"));
		panel.add(roll_in);
		panel.add(new JLabel("Name"));
		panel.add(name_in);
		panel.add(new JLabel("marks"));
		panel.add(marks_in);
		panel.add(Input);
		panel.add(result);

		add(panel);


		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		String roll, name, marks;
		roll = roll_in.getText();
		name = name_in.getText();
		marks = marks_in.getText();

		System.out.println(roll);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(e.getSource() == Input);
		setBackground(Color.blue);

		result.setText("Done");
	}

	public static void main(String[] args) {
		new sw();
	}
}


