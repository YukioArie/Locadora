package br.ucam.yukio.views;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import br.ucam.yukio.model.DAO.ClienteDAO;
import br.ucam.yukio.model.bean.Cliente;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroCliente extends JFrame {
	private JTextField txtNomeCli;
	private JTextField txtEmail;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente frame = new TelaCadastroCliente();
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
	public TelaCadastroCliente() {
		setTitle("Cadastrar Clientes");
		setBounds(100, 100, 588, 606);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dados Pessoais", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 552, 264);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		txtNomeCli = new JTextField();
		txtNomeCli.setBounds(10, 44, 425, 20);
		panel.add(txtNomeCli);
		txtNomeCli.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(10, 19, 46, 14);
		panel.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF :");
		lblCpf.setBounds(10, 75, 46, 14);
		panel.add(lblCpf);
		
		JLabel lblSexo = new JLabel("Sexo :");
		lblSexo.setBounds(10, 133, 46, 14);
		panel.add(lblSexo);
		
		JComboBox boxSexo = new JComboBox();
		boxSexo.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "Masculino ", "Feminino"}));
		boxSexo.setBounds(10, 158, 187, 20);
		panel.add(boxSexo);
		
		JFormattedTextField txtNasc = new JFormattedTextField();
		txtNasc.setBounds(10, 219, 167, 20);
		panel.add(txtNasc);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento :");
		lblDataDeNascimento.setBounds(10, 194, 111, 14);
		panel.add(lblDataDeNascimento);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(10, 100, 206, 20);
		panel.add(txtCPF);
		txtCPF.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Contato", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 286, 552, 203);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTelefone = new JLabel("Telefone :");
		lblTelefone.setBounds(10, 22, 70, 14);
		panel_1.add(lblTelefone);
		
		JFormattedTextField txtTel = new JFormattedTextField();
		txtTel.setBounds(10, 47, 170, 20);
		panel_1.add(txtTel);
		
		JLabel lblCelular = new JLabel("Celular :");
		lblCelular.setBounds(10, 78, 46, 14);
		panel_1.add(lblCelular);
		
		JFormattedTextField txtCel = new JFormattedTextField();
		txtCel.setBounds(10, 103, 170, 20);
		panel_1.add(txtCel);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setBounds(10, 135, 46, 14);
		panel_1.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(10, 160, 201, 20);
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente c = new Cliente();
				ClienteDAO dao = new ClienteDAO();
				c.setNome(txtNomeCli.getText());
				c.setCpf(Integer.parseInt(txtCPF.getText()));

				
				c.setDataNasc(txtNasc.getText());
				c.setTelefone(Integer.parseInt(txtTel.getText()));
				c.setCelular(Integer.parseInt(txtCel.getText()));
				c.setEmail(txtEmail.getText());
				
				dao.create(c);
				
				
				
			}
		});
		btnCadastrar.setBounds(10, 500, 552, 56);
		getContentPane().add(btnCadastrar);

	}
}
