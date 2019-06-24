package br.ucam.yukio.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLocacao extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLocacao frame = new TelaLocacao();
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
	public TelaLocacao() {
		setTitle("Loca\u00E7\u00E3o");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 708);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Loca\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 745, 157);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFilme = new JLabel("Filme :");
		lblFilme.setBounds(10, 26, 46, 14);
		panel.add(lblFilme);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 51, 340, 20);
		panel.add(comboBox);
		
		JLabel lblCliente = new JLabel("Cliente :");
		lblCliente.setBounds(10, 82, 46, 14);
		panel.add(lblCliente);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 107, 340, 20);
		panel.add(comboBox_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(600, 107, 135, 39);
		panel.add(btnCadastrar);
		
		JButton btnListarLocacao = new JButton("Listar");
		btnListarLocacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListarLocacao.setBounds(434, 107, 140, 39);
		panel.add(btnListarLocacao);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Consultar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 179, 745, 479);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(731, 11, -719, 457);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setBounds(11, 464, 724, -452);
		panel_1.add(table);
	}
}
