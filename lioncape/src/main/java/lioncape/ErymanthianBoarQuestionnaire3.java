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

public class ErymanthianBoarQuestionnaire3 extends JFrame {

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
					ErymanthianBoarQuestionnaire3 frame = new ErymanthianBoarQuestionnaire3();
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
	public ErymanthianBoarQuestionnaire3() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>After you helped Chiron he gave you the advice that if you want to catch the boar you should try a season that the boar has a hard time moving around in.</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(6, 47, 898, 67);
		contentPane.add(lblNewLabel);
		
		JButton answerButtonA = new JButton("<html>I will catch him during the winter. The thick snow will slow him down</html>");
		answerButtonA.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonA.setBackground(Color.YELLOW);
		answerButtonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis5.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomodis Spinellis said:</Strong><br><br>The boar is slow and buried in snow. Easy catch!</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					final ImageIcon icon2 = new ImageIcon("src/main/resources/SpinellisCongratulations.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>CONGRATULATIONS!</Strong><br><br>YOU BEAT YOUR FOURTH LABOUR: THE ERYMANTHIAN BOAR/html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon2);
					dispose();
					AugeanStablesText augeanStablesText = new AugeanStablesText();
					augeanStablesText.setVisible(true);
				}
			});
		answerButtonA.setForeground(new Color(100, 149, 237));
		answerButtonA.setBounds(145, 542, 300, 50);
		contentPane.add(answerButtonA);
		
		JButton answerButtonB = new JButton("<html>I will catch him during spring. He will be busy mating.</html>");
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
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis11.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomodis Spinellis said:</Strong><br><br>He can still take a break to throw you up the air.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonB.setForeground(new Color(100, 149, 237));
		answerButtonB.setBounds(469, 542, 300, 50);
		contentPane.add(answerButtonB);
		
		JButton answerButtonC = new JButton("<html>I will catch him during the summer. The heat will exhaust him.</html>");
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
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis4.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomodis Spinellis said:</Strong><br><br>Nope</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonC.setForeground(new Color(100, 149, 237));
		answerButtonC.setBounds(145, 623, 300, 50);
		contentPane.add(answerButtonC);
		
		JButton answerButtonD = new JButton("<html>I will catch him during autumn. The fog will blind him.</html>");
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
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis14.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomodis Spinellis said:</Strong><br><br>Correct, but it blinds you too.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
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