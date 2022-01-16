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

public class StymphalianBirdsText extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StymphalianBirdsText frame = new StymphalianBirdsText();
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
	public StymphalianBirdsText() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>The sixth labour is to defeat the Stymphalian birds, man-eating birds with beaks made of bronze and sharp metallic feathers they could launch at their victims. They were sacred to Ares, the god of war. Furthermore, their dung was highly toxic. They had migrated to Lake Stymphalia in Arcadia, where they bred quickly and took over the countryside, destroying local crops, fruit trees, and townspeople.</html>");
		lblNewLabel.setFont(new Font("Apple Color Emoji", Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(54, 195, 835, 462);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STYMPHALIAN BIRDS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Apple Color Emoji", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(6, 62, 908, 156);
		contentPane.add(lblNewLabel_1);
		
		JButton NextButton = new JButton("Next");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				StymphalianBirdsQuestionnaire1 stymphalian1 = new StymphalianBirdsQuestionnaire1();
				stymphalian1.setVisible(true);
			}
		});
		NextButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		NextButton.setForeground(new Color(255, 215, 0));
		NextButton.setBounds(772, 666, 117, 29);
		contentPane.add(NextButton);
		
		
	}
}
