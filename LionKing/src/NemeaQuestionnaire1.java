import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NemeaQuestionnaire1 extends JFrame {

	private JPanel contentPane;	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NemeaQuestionnaire1 frame = new NemeaQuestionnaire1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NemeaQuestionnaire1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How did Hercules kill the lion of Nemea?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(6, 117, 588, 30);
		contentPane.add(lblNewLabel);
		
		JButton answerButtonA = new JButton("With his crossbow and sword.");
		answerButtonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("img/Spinellis2.png");
				JOptionPane.showMessageDialog(null, "BZZZZZZZZZZZZZZZZZ \\nTry Again", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
			}
		});
		answerButtonA.setForeground(new Color(128, 128, 128));
		answerButtonA.setBounds(93, 169, 212, 29);
		contentPane.add(answerButtonA);
		
		JButton answerButtonB = new JButton("With his bare hands.");
		answerButtonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("img/Spinellis5.png");
				JOptionPane.showMessageDialog(null, "BRAVO", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				dispose();
				NemeaQuestionnaire2 nemea2 = new NemeaQuestionnaire2();
				nemea2.setVisible(true);
			}
		});
		answerButtonB.setForeground(new Color(128, 128, 128));
		answerButtonB.setBounds(317, 169, 212, 29);
		contentPane.add(answerButtonB);
		
		JButton answerButtonC = new JButton("With his slingshot.");
		answerButtonC.setBackground(new Color(255, 255, 255));
		answerButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("img/Spinellis4.png");
				JOptionPane.showMessageDialog(null, "BZZZZZZZZZZZZZZZZZ \\\\nTry Again", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
			}
		});
		answerButtonC.setForeground(new Color(128, 128, 128));
		answerButtonC.setBounds(93, 210, 212, 29);
		contentPane.add(answerButtonC);
		
		JButton answerButtonD = new JButton("I don't know.");
		answerButtonD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("img/Spinellis3.png");
				JOptionPane.showMessageDialog(null, "YOU HAVE TO KNOW \\nTry Again", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
			}
		});
		answerButtonD.setForeground(new Color(128, 128, 128));
		answerButtonD.setBounds(317, 210, 212, 29);
		contentPane.add(answerButtonD);
		
		JLabel NemeaLabel_1 = new JLabel("");
		NemeaLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/lioncape.png")).getImage();
		NemeaLabel_1.setIcon(new ImageIcon(img));
		NemeaLabel_1.setBounds(6, 6, 588, 99);
		contentPane.add(NemeaLabel_1);
	}
}
