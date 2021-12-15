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
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;
	private JLabel imageTitleLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(300, 80, 920, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		imageTitleLabel = new JLabel("");
		imageTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/lioncape.png")).getImage();
		imageTitleLabel.setIcon(new ImageIcon(img));
		
		imageTitleLabel.setBounds(6, 96, 908, 214);
		frame.getContentPane().add(imageTitleLabel);
		
		JButton startButton = new JButton("START");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				NemeasText nemeatxt = new NemeasText();
				nemeatxt.setVisible(true);
			}
		});
		
		startButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 26));
		startButton.setBackground(new Color(0, 0, 0));
		startButton.setForeground(new Color(255, 215, 0));
		startButton.setBounds(380, 387, 171, 68);
		frame.getContentPane().add(startButton);
		
		JButton aboutGameButton = new JButton("About Game");
		aboutGameButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		aboutGameButton.setBackground(new Color(255, 255, 255));
		aboutGameButton.setForeground(new Color(128, 128, 128));
		frame.getContentPane().add(aboutGameButton);
		aboutGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("src/main/resources/lion.png");
				JOptionPane.showMessageDialog(null, "<html>The purpose of LIONCAPE is to teach us the 12 Feats of Hercules. <br>The game consists of 12 stages and each stage of 3 questions. <br>At each correct answer the player proceeds to the next question. <br>In each wrong question the player loses 1 life. <br>In the 3 lives that the player loses the game ends.</html>", "About Game", + JOptionPane.INFORMATION_MESSAGE, icon1);
			}
		});
		aboutGameButton.setBounds(390, 492, 150, 51);
		frame.getContentPane().add(aboutGameButton);
		
		JButton quitButton = new JButton("Quit");
		quitButton.setForeground(new Color(255, 0, 0));
		quitButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		quitButton.setBounds(390, 590, 150, 51);
		frame.getContentPane().add(quitButton);
	}
}
