import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class practiceTest implements ActionListener {
	JButton submitbutton = new JButton();
	JButton hintbutton = new JButton();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
public static void main(String[] args) {
practiceTest test = new practiceTest();
test.GUI();

	

	
}
public void GUI() {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400, 200);
	JLabel label = new JLabel();
	label.setText("It’s so fragile even just saying its name can break it. What is it?");
	frame.setVisible(true);
	frame.add(panel);
	panel.add(submitbutton);
	panel.add(hintbutton);
	panel.add(label);
	panel.add(text); 
	text.setPreferredSize(new Dimension(350,30));
	submitbutton.setText("Submit");
	hintbutton.setText("Hint");
	submitbutton.setVisible(true);
	hintbutton.setVisible(true);
	submitbutton.setSize(70, 30);
	hintbutton.setSize(70, 30);
	submitbutton.addActionListener(this);
	hintbutton.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed = (JButton) e.getSource();
	if(pressed==hintbutton) {
		JOptionPane.showMessageDialog(null,"The answer is a 7 letter word.");
	}
	if(pressed==submitbutton) {
		String answer = text.getText();
		if(answer.equalsIgnoreCase("silence")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong!");
		}
	}
}
}
