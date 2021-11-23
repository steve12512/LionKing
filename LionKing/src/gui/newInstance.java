package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class newInstance {
	
	private JButton button1,button2,button3,button4;
	private int a;
	
	
	public newInstance() {
		
		JFrame frame = new JFrame("Hello,welcome to LionKing");
		frame.setSize(700,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		
		button1.setText("Play");
		button1.setLocation(300,100);
		button2.setText("Play");
		button2.setLocation(300,100);
		button3.setText("Play");
		button3.setLocation(300,100);
		button4.setText("Play");
		button4.setLocation(300,100);
		
		frame.getContentPane().add(button1);
		frame.getContentPane().add(button2);
		frame.getContentPane().add(button3);
		frame.getContentPane().add(button4);
		
		frame.setVisible(true);
		
		BorderLayout layout = new BorderLayout();
		layout.setHgap(10);
		layout.setVgap(10);
		
		
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		Container container = frame.getContentPane();
		container.setLayout(new GridLayout());
	}

}