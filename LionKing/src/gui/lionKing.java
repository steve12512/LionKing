import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class lionKing {

	private JFrame frame;
	private JLabel imageTitleLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lionKing window = new lionKing();
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
	public lionKing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(600, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		imageTitleLabel = new JLabel("");
		imageTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/lioncape.png")).getImage();
		imageTitleLabel.setIcon(new ImageIcon(img));
		
		imageTitleLabel.setBounds(6, 6, 588, 148);
		frame.getContentPane().add(imageTitleLabel);
		
		JButton beginButton = new JButton("ΑΡΧΙΣΕ");
		beginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon("img/Spinellis1.png");
				JOptionPane.showMessageDialog(null, "Let's see what you know about the 12 Feats of Hercules", "Lioncape", + JOptionPane.INFORMATION_MESSAGE, icon1);
				frame.dispose();
				NemeaQuestionnaire1 nemea1 = new NemeaQuestionnaire1();
				nemea1.setVisible(true);
			}
		});
		beginButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 26));
		beginButton.setBackground(new Color(169, 169, 169));
		beginButton.setForeground(new Color(255, 215, 0));
		beginButton.setBounds(223, 166, 150, 51);
		frame.getContentPane().add(beginButton);
	}

}
