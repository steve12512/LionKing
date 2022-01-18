package lioncape;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NemeaQuestionnaire1 extends JFrame {

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
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("How will you attack the Nemean Lion?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(6, 47, 898, 67);
		contentPane.add(lblNewLabel);
		
		JButton answerButtonA = new JButton("I will shoot it with my arrows");
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
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis2.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>You and the god Eros with your arrows.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonA.setForeground(new Color(100, 149, 237));
		answerButtonA.setBounds(145, 542, 300, 50);
		contentPane.add(answerButtonA);
		
		JButton answerButtonB = new JButton("I will strangle it with my bare hands");
		answerButtonB.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis5.png"));
				JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>BRAVO</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				dispose();
				NemeaQuestionnaire2 nemea2 = new NemeaQuestionnaire2();
				nemea2.setVisible(true);
			}
		});
		answerButtonB.setForeground(new Color(100, 149, 237));
		answerButtonB.setBounds(469, 542, 300, 50);
		contentPane.add(answerButtonB);
		
		JButton answerButtonC = new JButton("I will smack it with my wooden club");
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
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis4.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>Should I bring my grandfather in the stroller for help?</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonC.setForeground(new Color(100, 149, 237));
		answerButtonC.setBounds(145, 623, 300, 50);
		contentPane.add(answerButtonC);
		
		JButton answerButtonD = new JButton("I will run away");
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
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis16.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>Ciao Bella</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonD.setForeground(new Color(100, 149, 237));
		answerButtonD.setBounds(469, 623, 300, 50);
		contentPane.add(answerButtonD);
		
		JLabel NemeaLabel_1 = new JLabel("");
		NemeaLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/NEMEA.jpg")).getImage();
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
		
		JLabel lblFeat = new JLabel("Feat:");
		lblFeat.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeat.setForeground(Color.WHITE);
		lblFeat.setFont(new Font("Lucida Grande", Font.ITALIC, 15));
		lblFeat.setBounds(648, 14, 53, 31);
		contentPane.add(lblFeat);
		
		JLabel Feat12Label = new JLabel("1/12");
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
