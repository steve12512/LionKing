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

public class BeltOfHippolytaQuestionnaire3 extends JFrame {

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
					BeltOfHippolytaQuestionnaire3 frame = new BeltOfHippolytaQuestionnaire3();
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
	public BeltOfHippolytaQuestionnaire3() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>There is an impostor among us! Even though you were so close someone (TIP: Goddess Hera) walked among the amazons and spread bad word about you. Maybe that's why they all hate you... But they could not have been such fools right?</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setForeground(new Color(255, 215, 0));
		lblNewLabel.setBounds(6, 47, 898, 67);
		contentPane.add(lblNewLabel);
		
		JButton answerButtonA = new JButton("<html>Right! They were indeed plotting against me, I will erase them all from the map!</html>");
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
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis11.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>What did we say about cutting on the mass killing?</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonA.setForeground(new Color(100, 149, 237));
		answerButtonA.setBounds(145, 542, 300, 50);
		contentPane.add(answerButtonA);
		
		JButton answerButtonB = new JButton("<html>Oh well, I will leave without my prize then.</html>");
		answerButtonB.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hp.getHP() <= 1) {
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/SpinellisCry.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>GAME OVER</Strong></html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
					dispose();
				} else {
					hp.setHP(hp.getHP() - 1);
					playerHPLabel.setText(String.valueOf(hp.getHP()));
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis15.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>You failed the Labours after 9 years of trying. What a waste of time.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonB.setForeground(new Color(100, 149, 237));
		answerButtonB.setBounds(469, 542, 300, 50);
		contentPane.add(answerButtonB);
		
		JButton answerButtonC = new JButton("<html>I will only kill their queen and run away with the belt.</html>");
		answerButtonC.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		answerButtonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hp.setHP(hp.getHP() + 1);
				playerHPLabel.setText(String.valueOf(hp.getHP()));
				final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis6.png"));
				JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>You slay the queen and run away in the forest. They finally lost you.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				final ImageIcon icon2 = new ImageIcon(getClass().getResource("/SpinellisCongratulations.png"));
				JOptionPane.showMessageDialog(null, "<html><Strong>CONGRATULATIONS!</Strong><br><br>YOU BEAT YOUR NINTH LABOUR: THE BELT OF HIPPOLYTA</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon2);
				dispose();
				CattleOfGeryonText geryonText = new CattleOfGeryonText();
				geryonText.setVisible(true);
			}
		});
		answerButtonC.setForeground(new Color(100, 149, 237));
		answerButtonC.setBounds(145, 623, 300, 50);
		contentPane.add(answerButtonC);
		
		JButton answerButtonD = new JButton("<html>I will plead for their friendship back!</html>");
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
					final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis14.png"));
					JOptionPane.showMessageDialog(null, "<html><Strong>Diomidis Spinellis said:</Strong><br><br>There are tens of armoured and strong women.<br>Their faces are angry.</html>", "Message", + JOptionPane.INFORMATION_MESSAGE, icon1);
				}
			}
		});
		answerButtonD.setForeground(new Color(100, 149, 237));
		answerButtonD.setBounds(469, 623, 300, 50);
		contentPane.add(answerButtonD);
		
		JLabel BeltOfHippolytaLabel_1 = new JLabel("");
		BeltOfHippolytaLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/BELT_OF_HIPPOLYTA.png")).getImage();
		BeltOfHippolytaLabel_1.setIcon(new ImageIcon(img));
		BeltOfHippolytaLabel_1.setBounds(6, 107, 918, 420);
		contentPane.add(BeltOfHippolytaLabel_1);
		
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
		
		JLabel Feat12Label = new JLabel("9/12");
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
		
		JLabel Questionnaire3Label = new JLabel("3/3");
		Questionnaire3Label.setHorizontalAlignment(SwingConstants.CENTER);
		Questionnaire3Label.setForeground(Color.WHITE);
		Questionnaire3Label.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		Questionnaire3Label.setBounds(853, 14, 61, 31);
		contentPane.add(Questionnaire3Label);
	}
}
