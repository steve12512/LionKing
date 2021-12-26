package lioncape;

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

public class NemeaQuestionnaire5 extends JFrame {

	private JPanel contentPane;
	private JLabel playerHPLabel;
	HealthPower hp = new HealthPower();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NemeaQuestionnaire5 frame = new NemeaQuestionnaire5();
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
	public NemeaQuestionnaire5() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How will you attack the Hydra now?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(6, 47, 898, 67);
		contentPane.add(lblNewLabel);
		
		JButton answerButtonB = new JButton("I will call for help and we will burn the injured heads with a torch");
		answerButtonB.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis6.png");
				JOptionPane.showMessageDialog(null, "<html><Your nephew Iolaos burns the cut heads the moment you cut them off so that they do not grow back. Smart!>BRAVO</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				dispose();
				NemeaQuestionnaire6 nemea6 = new NemeaQuestionnaire6();
				nemea6.setVisible(true);
			}
		});
		answerButtonB.setForeground(new Color(100, 149, 237));
		answerButtonB.setBounds(145, 542, 300, 50);
		contentPane.add(answerButtonB);
		
		JButton answerButtonC = new JButton("I bonk it with my club");
		answerButtonB.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hp.getHP() <= 1) {
					final ImageIcon icon1 = new ImageIcon("src/main/resources/SpinellisCry.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>GAME OVER</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					dispose();
				} else {
					hp.setHP(hp.getHP() - 1);
					playerHPLabel.setText(String.valueOf(hp.getHP()));
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis9.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Seriously? Which of the 9 heads? /nTry Again</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonC.setForeground(new Color(100, 149, 237));
		answerButtonC.setBounds(469, 542, 300, 50);
		contentPane.add(answerButtonC);
		
		JButton answerButtonD = new JButton("I try to cut its heads off. They won’t keep multiplying right?");
		answerButtonC.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonC.setBackground(new Color(255, 255, 255));
		answerButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hp.getHP() <= 1) {
					final ImageIcon icon1 = new ImageIcon("src/main/resources/SpinellisCry.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>GAME OVER</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					dispose();
				} else {
					hp.setHP(hp.getHP() - 1);
					playerHPLabel.setText(String.valueOf(hp.getHP()));
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis8.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>BZZZZ Wrong! Try Again</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonD.setForeground(new Color(100, 149, 237));
		answerButtonD.setBounds(145, 623, 300, 50);
		contentPane.add(answerButtonD);
		
		JButton answerButtonA = new JButton("I strangle its long necksI strangle its long necks.");
		answerButtonA.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hp.getHP() <= 1) {
					final ImageIcon icon1 = new ImageIcon("src/main/resources/SpinellisCry.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>GAME OVER</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					dispose();
				} else {
					hp.setHP(hp.getHP() - 1);
					playerHPLabel.setText(String.valueOf(hp.getHP()));
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis7.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomodis Spinellis said:<Can you hug 9 monster necks at once? Hug me too!Try Again</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonA.setForeground(new Color(100, 149, 237));
		answerButtonA.setBounds(469, 623, 300, 50);
		contentPane.add(answerButtonA);
		
		JLabel NemeaLabel_2 = new JLabel("");
		NemeaLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/NemeaImg.png")).getImage();
		NemeaLabel_2.setIcon(new ImageIcon(img));
		NemeaLabel_2.setBounds(6, 107, 918, 420);
		contentPane.add(NemeaLabel_2);
		
		playerHPLabel = new JLabel("");
		playerHPLabel.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		playerHPLabel.setText(String.valueOf(hp.getHP()));
		playerHPLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playerHPLabel.setForeground(new Color(255, 255, 255));
		playerHPLabel.setBounds(112, 14, 30, 31);
		contentPane.add(playerHPLabel);
		
		JLabel HealthPowerLabel = new JLabel("Health Power:");
		HealthPowerLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		HealthPowerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		HealthPowerLabel.setForeground(new Color(255, 255, 255));
		HealthPowerLabel.setBounds(6, 14, 116, 31);
		contentPane.add(HealthPowerLabel);
	}

}
