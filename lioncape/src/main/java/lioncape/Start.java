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
import javax.swing.SwingConstants;

public class Start {

	private JFrame frame;
	private JLabel imageTitleLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
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
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Lioncape");
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(300, 80, 920, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		imageTitleLabel = new JLabel("");
		imageTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/lioncape.png")).getImage();
		imageTitleLabel.setIcon(new ImageIcon(img));
		
		imageTitleLabel.setBounds(6, 35, 908, 318);
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
		startButton.setBounds(380, 387, 190, 90);
		frame.getContentPane().add(startButton);
		
		JButton aboutGameButton = new JButton("About Game");
		aboutGameButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		aboutGameButton.setBackground(new Color(255, 255, 255));
		aboutGameButton.setForeground(new Color(128, 128, 128));
		frame.getContentPane().add(aboutGameButton);
		aboutGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutGame aboutGame = new AboutGame();
				aboutGame.setVisible(true);
			}
		});
		aboutGameButton.setBounds(380, 492, 190, 65);
		frame.getContentPane().add(aboutGameButton);
		
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		quitButton.setForeground(new Color(255, 0, 0));
		quitButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		quitButton.setBounds(380, 574, 190, 65);
		frame.getContentPane().add(quitButton);
	}
}
