package br.ucam.yukio.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastroFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFornecedor frame = new TelaCadastroFornecedor();
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
	public TelaCadastroFornecedor() {
		setTitle("Cadastrar Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Fornecedor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 519, 199);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRazoSocial = new JLabel("Raz\u00E3o social :");
		lblRazoSocial.setBounds(10, 22, 229, 14);
		panel.add(lblRazoSocial);
		
		textField = new JTextField();
		textField.setBounds(10, 47, 214, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome Fantasia :");
		lblNewLabel.setBounds(10, 78, 158, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 103, 214, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCnpj = new JLabel("CNPJ :");
		lblCnpj.setBounds(10, 134, 46, 14);
		panel.add(lblCnpj);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 159, 214, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 221, 519, 58);
		contentPane.add(btnCadastrar);
	}

}
