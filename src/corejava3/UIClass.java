package corejava3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class UIClass extends JFrame implements ActionListener{

	private JTextField textField;

	public UIClass(String title) {
		
		setSize(500, 500);
		setTitle(title);
		textField = new JTextField();
		JButton button = new JButton("Click1");
		button.setBounds(50, 50, 100, 50);
		//button.
		//this.textField
		button.addActionListener(this);
		
		JButton button1 = new JButton("Click2");
		button1.setBounds(50, 230, 100, 50);
		//button.
		//this.textField
		button1.addActionListener(this);
		
		/*
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Button Pressed");
				UIClass.this.textField.setText("Button Pressed");
			}
		});
		*/
		
		add(button);
		add(button1);
		
		
		textField.setBounds(50, 120, 200, 50);
		JCheckBox checkBox = new JCheckBox();
		checkBox.setText("Check Here");
		checkBox.setBounds(50, 200, 200, 50);
		add(checkBox);
		add(textField);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//System.out.println("Button Pressed");
		textField.setText(e.getActionCommand());
		if (e.getActionCommand().equals("Click1")) {
			//btn 1
		}else if (e.getActionCommand().equals("Click2")) {
			//btn 2
		}
		
		
		
	}
}
