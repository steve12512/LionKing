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

public class AugeanStablesQuestionnaire1 extends JFrame {

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
					AugeanStablesQuestionnaire1 frame = new AugeanStablesQuestionnaire1();
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
	public AugeanStablesQuestionnaire1() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>This assignment is intended to be both humiliating and impossible, since these divine livestock are immortal, they produced an enormous quantity of dung that has never been cleaned. How will you do it.</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(6, 47, 898, 67);
		contentPane.add(lblNewLabel);
		
		JButton answerButtonA = new JButton("<html>Little by little. My suffering will end at some point.</html>");
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
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis2.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>It never ends... you are reduced to a janitor for all eternity.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonA.setForeground(new Color(100, 149, 237));
		answerButtonA.setBounds(145, 542, 300, 50);
		contentPane.add(answerButtonA);
		
		JButton answerButtonB = new JButton("<html>I will be rerouting the rivers Alpheus and Peneus to wash it out with my massive strength.</html>");
		answerButtonB.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis5.png");
				JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>BRAVO <br>Strong Boi</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				dispose();
				AugeanStablesQuestionnaire2 Augean2 = new AugeanStablesQuestionnaire2();
				Augean2.setVisible(true);
			}
		});
		answerButtonB.setForeground(new Color(100, 149, 237));
		answerButtonB.setBounds(469, 542, 300, 50);
		contentPane.add(answerButtonB);
		
		JButton answerButtonC = new JButton("<html>I am not doing that, that's disgusting.</html>");
		answerButtonC.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hp.getHP() <= 1) {
					final ImageIcon icon1 = new ImageIcon("src/main/resources/SpinellisCry.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>GAME OVER</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					dispose();
				} else {
					hp.setHP(hp.getHP() - 1);
					playerHPLabel.setText(String.valueOf(hp.getHP()));
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis7.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>No U</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonC.setForeground(new Color(100, 149, 237));
		answerButtonC.setBounds(145, 623, 300, 50);
		contentPane.add(answerButtonC);
		
		JButton answerButtonD = new JButton("<html>I will try to slay the cattle so they do not produce any more dung.</html>");
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
					final ImageIcon icon1 = new ImageIcon("src/main/resources/Spinellis3.png");
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>I said they are <Strong>IMMORTAL</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonD.setForeground(new Color(100, 149, 237));
		answerButtonD.setBounds(469, 623, 300, 50);
		contentPane.add(answerButtonD);
		
		JLabel AugeanStablesLabel_1 = new JLabel("");
		AugeanStablesLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/AUGEAN_STABLES.jpg")).getImage();
		AugeanStablesLabel_1.setIcon(new ImageIcon(img));
		AugeanStablesLabel_1.setBounds(6, 107, 918, 420);
		contentPane.add(AugeanStablesLabel_1);
		
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
		
		JLabel lblFeat = new JLabel("Feat:");
		lblFeat.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeat.setForeground(Color.WHITE);
		lblFeat.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblFeat.setBounds(648, 14, 53, 31);
		contentPane.add(lblFeat);
		
		JLabel Feat12Label = new JLabel("5/12");
		Feat12Label.setHorizontalAlignment(SwingConstants.CENTER);
		Feat12Label.setForeground(Color.WHITE);
		Feat12Label.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		Feat12Label.setBounds(689, 14, 61, 31);
		contentPane.add(Feat12Label);
		
		JLabel QuestionnaireLabel = new JLabel("Questionnaire:");
		QuestionnaireLabel.setHorizontalAlignment(SwingConstants.CENTER);
		QuestionnaireLabel.setForeground(Color.WHITE);
		QuestionnaireLabel.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		QuestionnaireLabel.setBounds(754, 14, 116, 31);
		contentPane.add(QuestionnaireLabel);
		
		JLabel Questionnaire3Label = new JLabel("1/3");
		Questionnaire3Label.setHorizontalAlignment(SwingConstants.CENTER);
		Questionnaire3Label.setForeground(Color.WHITE);
		Questionnaire3Label.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		Questionnaire3Label.setBounds(853, 14, 61, 31);
		contentPane.add(Questionnaire3Label);
	}
}
