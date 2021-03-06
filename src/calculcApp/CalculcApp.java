package calculcApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculcApp implements ActionListener {
	JFrame frame;
	JTextField textField;
	
	JButton[] numButtons = new JButton[10]; // Butts for numbers
	JButton[] funcButtons = new JButton[9]; // Butts for operators
	
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, clrButton, delButton, negButton;
	JPanel panel;
	
	double num1 = 0, num2 = 0, result = 0;
	char operator;
	
	Font myFont = new Font("Century Gothic", Font.BOLD, 30);
	
	CalculcApp(){
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 560);
		frame.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(50, 25, 300, 60);
		textField.setFont(myFont);
		textField.setEditable(false);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		clrButton = new JButton("Clr");
		delButton = new JButton("Del");
		negButton = new JButton("Neg");
		
		funcButtons[0] = addButton;
		funcButtons[1] = subButton;
		funcButtons[2] = mulButton;
		funcButtons[3] = divButton;
		funcButtons[4] = decButton;
		funcButtons[5] = equButton;
		funcButtons[6] = clrButton;
		funcButtons[7] = delButton;
		funcButtons[8] = negButton;
		
		for(int i = 0; i<funcButtons.length; i++) {
			funcButtons[i].addActionListener(this);
			funcButtons[i].setFont(myFont);
			funcButtons[i].setFocusable(false);
		}
		
		for(int i = 0; i<numButtons.length; i++) {
			numButtons[i] = new JButton(String.valueOf(i));
			numButtons[i].addActionListener(this);
			numButtons[i].setFont(myFont);
			numButtons[i].setFocusable(false);
		}
		
		negButton.setBounds(50, 430, 100, 50);
		delButton.setBounds(150, 430, 100, 50);
		clrButton.setBounds(250, 430, 100, 50);
		
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		panel.setBackground(Color.gray);
		
		panel.add(numButtons[1]);
		panel.add(numButtons[2]);
		panel.add(numButtons[3]);
		panel.add(addButton);
		panel.add(numButtons[4]);
		panel.add(numButtons[5]);
		panel.add(numButtons[6]);
		panel.add(subButton);
		panel.add(numButtons[7]);
		panel.add(numButtons[8]);
		panel.add(numButtons[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
		
		
		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(negButton);
		frame.add(textField);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		CalculcApp calc = new CalculcApp();
	}
	@Override
	public void actionPerformed(ActionEvent e) { //If number button is clicked
		for(int i = 0; i < numButtons.length; i++) {
			if(e.getSource() == numButtons[i]) {
				textField.setText(textField.getText()
				.concat(String.valueOf(i)));
			}
		}
		if (e.getSource() == decButton) {
			textField.setText(textField.getText()
			.concat(String.valueOf(".")));
		}
		if (e.getSource() == addButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}
		if (e.getSource() == subButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");
		}
		if (e.getSource() == mulButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '*';
			textField.setText("");
		}
		if (e.getSource() == divButton) {
			num1 = Double.parseDouble(textField.getText());
			operator = '/';
			textField.setText("");
		}
		if (e.getSource() == equButton) { // For operations
			num2 = Double.parseDouble(textField.getText());
			switch (operator) {
			case '+': 
				result = num1 + num2;
				break;
			case '-': 
				result = num1 - num2;
				break;
			
			case '*': 
				result = num1 * num2;
				break;
			
			case '/': 
				result = num1 / num2;
				break;
			}
			//operator = '=';
			textField.setText(String.valueOf(result));
			num1 = result; //To continue operations
		}
		if (e.getSource() == clrButton) {
			textField.setText("");
		}
		if (e.getSource() == delButton) {
			String str = textField.getText();
			textField.setText("");
			for(int i = 0; i < str.length() - 1; i++) {
				textField.setText(textField.getText() + str
						.charAt(i));
			}
		}
		if (e.getSource() == negButton) {
			double negi = Double.parseDouble(textField.getText());
			negi *=-1;
			textField.setText(String.valueOf(negi));
		}
		
	}

}
