package br.ucam.yukio.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaSobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSobre frame = new TelaSobre();
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
	public TelaSobre() {
		setTitle("Sobre");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaSobre.class.getResource("/imagens/info.png")));
		lblNewLabel.setBounds(26, 11, 64, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblParaInformaesAcesse = new JLabel("Para Informa\u00E7\u00F5es acesse :");
		lblParaInformaesAcesse.setBounds(114, 35, 164, 14);
		contentPane.add(lblParaInformaesAcesse);
		
		JLabel lblNewLabel_1 = new JLabel("github.com/YukioArie");
		lblNewLabel_1.setBounds(114, 60, 165, 14);
		contentPane.add(lblNewLabel_1);
	}
}
