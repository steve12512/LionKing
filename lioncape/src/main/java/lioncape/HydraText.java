package lioncape;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HydraText extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HydraText frame = new HydraText();
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
	public HydraText() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>King Eurystheus warned you that your tasks would become harder and harder, yet nothing could prepare you for your second labour. Your task was to slay the Giant serpent with the nine heads in the lake Lerna. The Hydra was coming out to terrorize many villages, and was deemed not only very dangerous but also immortal. You decide to ask your nephew Iolaus to assist you with this great task. <br><br>You and your partner reach the lake to find no monster. No matter the dark of night however, you scoped a  large cave that was deemed to be its lair, the spring of Amymone. There, in order to attract the beast out you shoot an arrow lit by fire of your torch. That was enough to lure the Lernaean Hydra outside. Her huge body towered above you and its poisonous heads did not take a second to start clamping on you, as thunders lit the night skies.</html>");
		lblNewLabel.setFont(new Font("Apple Color Emoji", Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(54, 195, 835, 462);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HYDRA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Apple Color Emoji", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(6, 62, 908, 156);
		contentPane.add(lblNewLabel_1);
		
		JButton NextButton = new JButton("Next");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				HydraQuestionnaire1 Hydra1 = new HydraQuestionnaire1();
				Hydra1.setVisible(true);
			}
		});
		NextButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		NextButton.setForeground(new Color(255, 215, 0));
		NextButton.setBounds(772, 666, 117, 29);
		contentPane.add(NextButton);
		
		
	}
}
