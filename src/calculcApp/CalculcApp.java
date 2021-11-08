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
		frame = new JFrame("Calculater");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 560);
	}
	
	public static void main(String[] args) {
	CalculcApp calc = new CalculcApp();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
