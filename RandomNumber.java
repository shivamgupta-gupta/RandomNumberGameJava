package test1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RandomNumber extends JFrame{
	
	private JTextField text;
	private JButton button;
	private JLabel label;
	
	public RandomNumber(){
		setLayout(new FlowLayout());
		button = new JButton("Try your luck");
		add(button);
		text = new JTextField("Enter a number from 1 to 10!");
		add(text);
		label = new JLabel("Keep calm and play the game.");
		add(label);
		event e = new event();
		button.addActionListener(e);
	}
	
	class event implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int answer = (int)(Math.random()*10 +1);
			int a = Integer.parseInt(text.getText());
			if(answer == a){
				label.setText("You win.");
			}
			else{
				label.setText("You loose because random number is - " + answer);
			}
		}
	}
	
	public static void main(String args[]){
		RandomNumber g = new RandomNumber();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setVisible(true);
		g.setTitle("Random Number Game.");
		g.setSize(400, 400);
	}
}
