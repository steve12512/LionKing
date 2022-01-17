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

public class BeltOfHippolytaText extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BeltOfHippolytaText frame = new BeltOfHippolytaText();
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
	public BeltOfHippolytaText() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Eurystheus’ daughter Admete wanted the Belt of Hippolyta, queen of the Amazons, a gift from her father Ares. To please his daughter, Eurystheus ordered you to retrieve the belt as your ninth labour.<br><br>You set off for Themiscyra, where Hippolyta lived. You found yourself in a lush forest where beautifully ornamented wooden cabins stood proudly. Guarding them, eyeing you suspiciously were hundreds of women, young and old, by no means frail in mass and stature. There was not a single men in sight. Your curious stroll was to be interrupted by many armoured women on horseback pinching you with their long spears. You complied in surrendering your weapons and they were to lead you to their esteemed queen Hippolyta, where you had already been arranged a suspicious meeting.</html>");
		lblNewLabel.setFont(new Font("Apple Color Emoji", Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(54, 195, 835, 462);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BELT OF HIPPOLYTA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Apple Color Emoji", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(6, 62, 908, 156);
		contentPane.add(lblNewLabel_1);
		
		JButton NextButton = new JButton("Next");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				BeltOfHippolytaQuestionnaire1 beltOfHippolyta1 = new BeltOfHippolytaQuestionnaire1();
				beltOfHippolyta1.setVisible(true);
			}
		});
		NextButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		NextButton.setForeground(new Color(255, 215, 0));
		NextButton.setBounds(772, 666, 117, 29);
		contentPane.add(NextButton);
		
		
	}
}
