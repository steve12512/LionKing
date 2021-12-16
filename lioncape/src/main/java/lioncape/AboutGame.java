package lioncape;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class AboutGame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton NextButton;
	int counterButton = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutGame frame = new AboutGame();
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
	public AboutGame() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("STORY");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Apple Color Emoji", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(6, 30, 908, 156);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("<html>You open your eyes in the midst of night by a feeling of something ominous awaiting to happen. You look around to find you are on your own, in a dim lit room inside a wooden cradle. You try to come up with a voice to call for help. You are a baby though so incoherent blabbering is the best you can do. Your meaningless voice failed to grab anybody’s attention. Suddenly, slithering upon your tiny baby body you feel the deadly touch of two poisonous serpents. Their tongues scan you menacingly and their bodies crawl up ready for an attack.<br><br>“This baby is not going down tonight” you think, and your tiny baby fingers clamp tight around both the snakes’ necks and squeeze till the snakes fall limp on the cradle next to you. You proudly turn around and graze into a deep sleep, strong and satisfied. The next morning found your mother Alcmene finding you cuddling two unconscious snakes.</html>");
		lblNewLabel.setFont(new Font("Apple Color Emoji", Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(54, 151, 835, 503);
		contentPane.add(lblNewLabel);
		
		NextButton = new JButton("Next");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (counterButton == 1) {
					counterButton++;
					lblNewLabel.setText("<html>You slowly grew up to find yourself having more and more courage and strength than all your peers. You took upon you jobs nobody could perform and your wits surpassed all the brightest minds of your village. You have been always protecting the weak and everyone praised you with the greatest words. You knew there was something special about you. You were the son of the gods. You were Hercules the son of Zeus and you were ready to take on the world!<br><br>However, your future would not be as clean-cut as one would imagine, as before great feats comes a great downfall. As a son of Zeus with a mortal, you may have had some of the Gods’ favor on your side, but not the one of Goddess Hera who vowed to end the illegitimate child of her husband. She put you in deep troubles throughout your lifetime but this one was the greatest sin of them all. She cursed you with crippling madness, and blinded by it she guided you to slaughter your family, the ones nearest to you.</html>");
				} else if (counterButton==2){
					counterButton++;
					lblNewLabel.setText("<html>After the mind fog subsided, and after you found what horrible sins you committed, you had to hurry to the Oracle of Delphi to find away to atone. There the priestesses, guided by Apollo told you to serve Eurystheus, king of Mycenae, for ten years. During this time, you were to be sent to perform a series of difficult feats, called labours…</html>");
					NextButton.setText("Close");
				} else if (counterButton==3){
					dispose();
				}
			} 
		});
		NextButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		NextButton.setForeground(new Color(255, 215, 0));
		NextButton.setBounds(772, 666, 117, 29);
		contentPane.add(NextButton);
		
		
	
	}
}
