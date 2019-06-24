package br.ucam.yukio.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

public class TelaCadastroFilme extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtDigiteASinopse;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroFilme frame = new TelaCadastroFilme();
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
	public TelaCadastroFilme() {
		setTitle("Cadastrar Filmes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Filmes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 508, 250);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("T\u00EDtulo :");
		lblNewLabel.setBounds(10, 22, 46, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 47, 324, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCategoria = new JLabel("Categoria :");
		lblCategoria.setBounds(10, 78, 187, 14);
		panel.add(lblCategoria);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 103, 128, 20);
		panel.add(comboBox);
		
		JLabel lblSinopse = new JLabel("Sinopse :");
		lblSinopse.setBounds(10, 137, 157, 14);
		panel.add(lblSinopse);
		
		txtDigiteASinopse = new JTextField();
		txtDigiteASinopse.setFont(new Font("Dialog", Font.ITALIC, 11));
		txtDigiteASinopse.setText("Digite a sinopse");
		txtDigiteASinopse.setBounds(10, 162, 287, 20);
		panel.add(txtDigiteASinopse);
		txtDigiteASinopse.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor :");
		lblValor.setBounds(10, 193, 46, 14);
		panel.add(lblValor);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 218, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 272, 508, 51);
		contentPane.add(btnCadastrar);
	}

}
