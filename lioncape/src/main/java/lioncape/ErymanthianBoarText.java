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

public class ErymanthianBoarText extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErymanthianBoarText frame = new ErymanthianBoarText();
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
	public ErymanthianBoarText() {
		super("Lioncape");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 80, 920, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Eurystheus seems disappointed that you had overcome yet another creature and he feels humiliated by the hind's escape, so he assigned you another dangerous task. By some accounts, the fourth labour is to bring the fearsome Erymanthian Boar back to him alive.<br><br> On the way to Mount Erymanthos where the boar lived, you decided to visit Pholus, a hospitable centaur and old friend. You met with him in the cave he called home and he offered you to eat with him.</html>");
		lblNewLabel.setFont(new Font("Apple Color Emoji", Font.ITALIC, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(54, 195, 835, 462);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ERYMANTHIAN BOAR");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Apple Color Emoji", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_1.setBounds(6, 62, 908, 156);
		contentPane.add(lblNewLabel_1);
		
		JButton NextButton = new JButton("Next");
		NextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ErymanthianBoarQuestionnaire1 Erymanthian1 = new ErymanthianBoarQuestionnaire1();
				Erymanthian1.setVisible(true);
			}
		});
		NextButton.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		NextButton.setForeground(new Color(255, 215, 0));
		NextButton.setBounds(772, 666, 117, 29);
		contentPane.add(NextButton);
		
		
	}
}
