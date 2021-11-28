import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class NemeaQuestionnaire2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NemeaQuestionnaire2 frame = new NemeaQuestionnaire2();
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
	public NemeaQuestionnaire2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("What did Hercules do to the lion's skin?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(6, 117, 588, 30);
		contentPane.add(lblNewLabel);
		
		JButton answerButtonA = new JButton("He wear it on his back.");
		answerButtonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("img/Spinellis6.png");
				JOptionPane.showMessageDialog(null, "BRAVO", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				dispose();
				NemeaQuestionnaire3 nemea3 = new NemeaQuestionnaire3();
				nemea3.setVisible(true);
			}
		});
		answerButtonA.setForeground(new Color(128, 128, 128));
		answerButtonA.setBounds(93, 169, 212, 29);
		contentPane.add(answerButtonA);
		
		JButton answerButtonB = new JButton("He threw it.");
		answerButtonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("img/Spinellis9.png");
				JOptionPane.showMessageDialog(null, "BZZZZZZZZZZZZZZZZZ \\nTry Again", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
			}
		});
		answerButtonB.setForeground(new Color(128, 128, 128));
		answerButtonB.setBounds(317, 169, 212, 29);
		contentPane.add(answerButtonB);
		
		JButton answerButtonC = new JButton("Ηe ate it.");
		answerButtonC.setBackground(new Color(255, 255, 255));
		answerButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("img/Spinellis8.png");
				JOptionPane.showMessageDialog(null, "Yahhhhhhhh \\nTry Again", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
			}
		});
		answerButtonC.setForeground(new Color(128, 128, 128));
		answerButtonC.setBounds(93, 210, 212, 29);
		contentPane.add(answerButtonC);
		
		JButton answerButtonD = new JButton("He made it fur and sold it.");
		answerButtonD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("img/Spinellis7.png");
				JOptionPane.showMessageDialog(null, "BZZZZZZZZZZZZZZZZZ \\nTry Again", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
			}
		});
		answerButtonD.setForeground(new Color(128, 128, 128));
		answerButtonD.setBounds(317, 210, 212, 29);
		contentPane.add(answerButtonD);
		
		JLabel NemeaLabel_2 = new JLabel("");
		NemeaLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/lioncape.png")).getImage();
		NemeaLabel_2.setIcon(new ImageIcon(img));
		NemeaLabel_2.setBounds(6, 6, 588, 99);
		contentPane.add(NemeaLabel_2);
	}

}
