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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CerberusQuestionnaire2 extends JFrame {

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
					CerberusQuestionnaire2 frame = new CerberusQuestionnaire2();
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
	public CerberusQuestionnaire2() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>While in the Underworld, you met Theseus and Pirithous. The two companions had been imprisoned by Hades for attempting to kidnap Persephone. Theseus can be saved but Pirithous is tied up very tightly. What will you do with them?</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(6, 47, 898, 67);
		contentPane.add(lblNewLabel);
		
		JButton answerButtonA = new JButton("<html>I will try to rescue them both.</html>");
		answerButtonA.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonA.setBackground(Color.YELLOW);
		answerButtonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hp.getHP() <= 1) {
					final ImageIcon icon1 = new ImageIcon("src/main/resources/SpinellisCry.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>GAME OVER</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					dispose();
				} else {
					hp.setHP(hp.getHP() - 1);
					playerHPLabel.setText(String.valueOf(hp.getHP()));
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis11.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomodis Spinellis said:</Strong><br><br>You do not have the time to save both.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonA.setForeground(new Color(100, 149, 237));
		answerButtonA.setBounds(145, 542, 300, 50);
		contentPane.add(answerButtonA);
		
		JButton answerButtonB = new JButton("<html>. I will leave them be, this is not my job.</html>");
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
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis3.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomodis Spinellis said:</Strong><br><br>You are not a hero.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonB.setForeground(new Color(100, 149, 237));
		answerButtonB.setBounds(469, 542, 300, 50);
		contentPane.add(answerButtonB);
		
		JButton answerButtonC = new JButton("<html>I will rescue only Theseus, Pirithous has to pay for his sins.</html>");
		answerButtonC.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonC.setBackground(new Color(255, 255, 255));
		answerButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis5.png");
				JOptionPane.showMessageDialog(null, "<html><Strong>Diomodis Spinellis said:</Strong><br><br>That’s what a down to earth hero would do.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				dispose();
				CerberusQuestionnaire3 cerberus3 = new CerberusQuestionnaire3();
				cerberus3.setVisible(true);
			}
		});
		answerButtonC.setForeground(new Color(100, 149, 237));
		answerButtonC.setBounds(145, 623, 300, 50);
		contentPane.add(answerButtonC);
		
		JButton answerButtonD = new JButton("<html>I will rescue only Pirithous, the other one can save himself.</html>");
		answerButtonD.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hp.getHP() <= 1) {
					final ImageIcon icon1 = new ImageIcon("src/main/resources/SpinellisCry.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>GAME OVER</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					dispose();
				} else {
					hp.setHP(hp.getHP() - 1);
					playerHPLabel.setText(String.valueOf(hp.getHP()));
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis15.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomodis Spinellis said:</Strong><br><br>He won’t budge and now you don’t have any time left to save anyone.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonD.setForeground(new Color(100, 149, 237));
		answerButtonD.setBounds(469, 623, 300, 50);
		contentPane.add(answerButtonD);
		
		JLabel NemeaLabel_1 = new JLabel("");
		NemeaLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/NemeaImg.png")).getImage();
		NemeaLabel_1.setIcon(new ImageIcon(img));
		NemeaLabel_1.setBounds(6, 107, 918, 420);
		contentPane.add(NemeaLabel_1);
		
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