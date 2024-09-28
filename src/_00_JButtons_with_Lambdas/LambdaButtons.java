package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	Random rand = new Random();
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(arg -> {
			int num1;
			int num2;
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Input a number"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Input another number"));
			JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
		});
		
		randNumber.addActionListener(arg -> {
			int floor = Integer.parseInt(JOptionPane.showInputDialog("Input a floor"));
			int ceil = Integer.parseInt(JOptionPane.showInputDialog("Enter a ceiling"));
			int num = rand.nextInt(ceil - floor + 1) - floor;
			JOptionPane.showMessageDialog(null, num);
		});
		
		tellAJoke.addActionListener(arg -> JOptionPane.showMessageDialog(null, "This is my stepladder, I've never met my real ladder"));
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
