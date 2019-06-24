package br.ucam.yukio.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField userTxt;
	private JPasswordField passwordTxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 215, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(81, 38, 46, 14);
		contentPane.add(lblNewLabel);
		
		userTxt = new JTextField();
		userTxt.setFont(new Font("Dialog", Font.ITALIC, 12));
		userTxt.setText("Usu\u00E1rio");
		userTxt.setBounds(15, 89, 169, 20);
		contentPane.add(userTxt);
		userTxt.setColumns(10);
		
		passwordTxt = new JPasswordField();
		passwordTxt.setToolTipText("Senha");
		passwordTxt.setBounds(15, 120, 169, 20);
		contentPane.add(passwordTxt);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setBounds(16, 151, 169, 35);
		contentPane.add(btnLogar);
	}
}
