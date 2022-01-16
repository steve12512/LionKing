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

public class MaresOfDiomedesText extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaresOfDiomedesText frame = new MaresOfDiomedesText();
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
	public MaresOfDiomedesText() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>As the eighth of your Twelve Labours, you were sent by King Eurystheus to steal the Mares from Diomedes. The horses’ madness was attributed to their unnatural diet which consisted of the flesh of unsuspecting guests or strangers to the island. The mares also expelled fire when they breathed. The animals, which were the terror of Thrace, were kept tethered by iron chains to a bronze manger in the now vanished city of Tirida and were named Podargos (the swift), Lampon (the shining), Xanthos (the yellow) and Deinos (or Deinus, the terrible).<br><br>Reaching the Diomedes’ estate you are welcomed by an overly friendly host. Diomedes offered you most of the luxuries known to man along with a big feast. He asked you to call him “your friend” and exclaimed that he was honoured to have such a heroic partner in life. He was not seeming to be as cruel as he had previously been described by the King you were serving.</html>");
		lblNewLabel.setFont(new Font("Apple Color Emoji", Font.ITALIC, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(54, 195, 835, 462);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MARES OF DIOMEDES");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Apple Color Emoji", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(6, 62, 908, 156);
		contentPane.add(lblNewLabel_1);
		
		JButton NextButton = new JButton("Next");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MaresOfDiomedesQuestionnaire1 maresOfDiomedes1 = new MaresOfDiomedesQuestionnaire1();
				maresOfDiomedes1.setVisible(true);
			}
		});
		NextButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		NextButton.setForeground(new Color(255, 215, 0));
		NextButton.setBounds(772, 666, 117, 29);
		contentPane.add(NextButton);
		
		
	}
}
