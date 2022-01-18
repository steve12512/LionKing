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

public class CattleOfGeryonQuestionnaire2 extends JFrame {

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
					CattleOfGeryonQuestionnaire2 frame = new CattleOfGeryonQuestionnaire2();
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
	public CattleOfGeryonQuestionnaire2() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Entertained by your um… courage, the God Helios offers you his magic golden cup for you to travel into through the desert quickly. Arriving in Eurytion though, you find two guard dogs waiting to defend their territory.</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(6, 47, 898, 67);
		contentPane.add(lblNewLabel);
		
		JButton answerButtonA = new JButton("<html>I will try to pet them. Good doggies!</html>");
		answerButtonA.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hp.getHP() <= 1) {
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/SpinellisCry.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>GAME OVER</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					dispose();
				} else {
					hp.setHP(hp.getHP() - 1);
					playerHPLabel.setText(String.valueOf(hp.getHP()));
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis16.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>Say goodbye to your fingers.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonA.setForeground(new Color(100, 149, 237));
		answerButtonA.setBounds(145, 542, 300, 50);
		contentPane.add(answerButtonA);
		
		JButton answerButtonB = new JButton("<html>I will smash them with my club.</html>");
		answerButtonB.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis6.png"));
				JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>You smacked them both in one shot! What a combo!</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				dispose();
				CattleOfGeryonQuestionnaire3 gattleOfGeryon3 = new CattleOfGeryonQuestionnaire3();
				gattleOfGeryon3.setVisible(true);
			}
		});
		answerButtonB.setForeground(new Color(100, 149, 237));
		answerButtonB.setBounds(469, 542, 300, 50);
		contentPane.add(answerButtonB);
		
		JButton answerButtonC = new JButton("<html>I will run away.</html>");
		answerButtonC.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hp.getHP() <= 1) {
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/SpinellisCry.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>GAME OVER</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					dispose();
				} else {
					hp.setHP(hp.getHP() - 1);
					playerHPLabel.setText(String.valueOf(hp.getHP()));
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis19.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br><Strong>PRO TIP:</Strong> Never run when you see an angry dog.<br>It will chase you and injure you.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonC.setForeground(new Color(100, 149, 237));
		answerButtonC.setBounds(145, 623, 300, 50);
		contentPane.add(answerButtonC);
		
		JButton answerButtonD = new JButton("<html>I will hit them with arrows.</html>");
		answerButtonD.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hp.getHP() <= 1) {
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/SpinellisCry.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>GAME OVER</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					dispose();
				} else {
					hp.setHP(hp.getHP() - 1);
					playerHPLabel.setText(String.valueOf(hp.getHP()));
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis20.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>They are too nimble for you to hit and dive on you immediately.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonD.setForeground(new Color(100, 149, 237));
		answerButtonD.setBounds(469, 623, 300, 50);
		contentPane.add(answerButtonD);
		
		JLabel CattleOfGeryonLabel_1 = new JLabel("");
		CattleOfGeryonLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/CATTLE_OF_GERYON.jpg")).getImage();
		CattleOfGeryonLabel_1.setIcon(new ImageIcon(img));
		CattleOfGeryonLabel_1.setBounds(6, 107, 918, 420);
		contentPane.add(CattleOfGeryonLabel_1);
		
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
		
		JLabel Feat12Label = new JLabel("10/12");
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
		
		JLabel Questionnaire3Label = new JLabel("2/3");
		Questionnaire3Label.setHorizontalAlignment(SwingConstants.CENTER);
		Questionnaire3Label.setForeground(Color.WHITE);
		Questionnaire3Label.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		Questionnaire3Label.setBounds(853, 14, 61, 31);
		contentPane.add(Questionnaire3Label);
	}
}
