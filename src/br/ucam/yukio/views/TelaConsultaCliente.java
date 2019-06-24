package br.ucam.yukio.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaConsultaCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsultaCliente frame = new TelaConsultaCliente();
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
	public TelaConsultaCliente() {
		setTitle("Consultar Clientes");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnListarTodos = new JButton("Listar Todos");
		btnListarTodos.setBounds(10, 11, 109, 23);
		contentPane.add(btnListarTodos);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(225, 11, 89, 23);
		contentPane.add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(417, 11, 89, 23);
		contentPane.add(btnExcluir);
		
		JLabel lblNome = new JLabel("Cliente :");
		lblNome.setBounds(37, 70, 55, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(90, 67, 256, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(356, 66, 89, 23);
		contentPane.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 398, 496, -280);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBounds(10, 398, 496, -280);
		contentPane.add(table);
	}
}
