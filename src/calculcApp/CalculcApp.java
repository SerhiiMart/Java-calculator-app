package calculcApp;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CalculcApp implements ActionListener {
	JFrame frame;
	JTextField textField;
	
	Font myFont = new Font("Ink Free", Font.BOLD, 30);
	
	JButton[] numButtons = new JButton[10];
	JButton[] funcButtons = new JButton[8];
	
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, equButton, clrButton, delButton;
	JPanel panel;
	
	double num1 = 0, num2 = 0, result = 0;
	char operator;
	
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
		clrButton = new JButton("Clear");
		delButton = new JButton("Delete");
		
		funcButtons[0] = addButton;
		funcButtons[1] = subButton;
		funcButtons[2] = mulButton;
		funcButtons[3] = divButton;
		funcButtons[4] = decButton;
		funcButtons[5] = equButton;
		funcButtons[6] = clrButton;
		funcButtons[7] = delButton;
		
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
		
		delButton.setBounds(50, 430, 145, 50);
		clrButton.setBounds(205	, 430, 145, 50);
		
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		panel.setBackground(Color.gray);
		
		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textField);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
	CalculcApp calc = new CalculcApp();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
