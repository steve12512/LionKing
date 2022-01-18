package lioncape;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EndOfFeatsText extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndOfFeatsText frame = new EndOfFeatsText();
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
	public EndOfFeatsText() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Congratulations. You, the demigod Hercules have succeeded in completing all the hard tasks thrown onto you. You atoned for the sins of your past and have ensured your place in the mount Olympus. There is no telling what adventures you, with your courage and your divine strength, could slide into. Some say you lived and died, leaving your labours behind, in peace. Some others claim that you joined Jason and the Argonauts in their quest for the Golden Fleece. What we know for sure is that you, after your death became a god, a legend, a resident of the mountain Olympus. And YOU player, you lived as the best Hercules would. Well done! Hercules now hangs his Lion Cape on this wooden club and rests easy for you completed all the labours-chapters of the game!</html>");
		lblNewLabel.setFont(new Font("Apple Color Emoji", Font.ITALIC, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(54, 195, 835, 462);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("END OF FEATS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Apple Color Emoji", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(6, 62, 908, 156);
		contentPane.add(lblNewLabel_1);
		
		JButton quitButton = new JButton("Quit");
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				final ImageIcon icon1 = new ImageIcon(getClass().getResource("/Spinellis21.png"));
				Object[] options = {"QUIT", "STAY"};
				int response = JOptionPane.showOptionDialog(null, "<html><h1 style=\"text-align:center;\">THANK YOU FOR PLAYING LIONCAPE! </h1><br><h3 style=\\\"text-align:center;\\\">WE HOPE YOU LEARNED ABOUT THE LABOURS OF HERCULES WITH US AND THAT YOU HAD FUN!</h3>", "THANK YOU ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon1, options, options[0]);
				if (response == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		});
		quitButton.setForeground(new Color(255, 0, 0));
		quitButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		quitButton.setBounds(406, 666, 117, 29);
		getContentPane().add(quitButton);
		
	}
}
