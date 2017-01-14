import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class frame1 {

	private JFrame frame;
	private JLabel lblNirvana; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Enter ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//JOptionPane.showMessageDialog(null, "Hello, yellow!");
				lblNirvana.setText("Enter Nivana");
				
			}
		});
		btnNewButton.setBounds(180, 115, 113, 32);
		btnNewButton.setForeground(Color.ORANGE);
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Candara", Font.BOLD | Font.ITALIC, 17));
		frame.getContentPane().add(btnNewButton);
		
	    lblNirvana = new JLabel("Nirvana");
		lblNirvana.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNirvana.setForeground(Color.ORANGE);
		lblNirvana.setBounds(96, 25, 251, 62);
		frame.getContentPane().add(lblNirvana);
	}
}
