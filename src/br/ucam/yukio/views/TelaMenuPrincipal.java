package br.ucam.yukio.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.DesktopPaneUI;



import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.Color;

public class TelaMenuPrincipal extends JFrame {

	private JPanel contentPane;
	TelaCadastroCliente cadcli = new TelaCadastroCliente();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenuPrincipal frame = new TelaMenuPrincipal();
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
	public TelaMenuPrincipal() {
		setResizable(false);
		setTitle("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		mnNewMenu.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/script.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCadastrarCliente = new JMenuItem("Cadastrar Cliente");
		mntmCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				TelaCadastroCliente cadastroCliente = new TelaCadastroCliente();
				cadastroCliente.setVisible(true);
						
				
				
			}
		});
		mntmCadastrarCliente.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/user_add.png")));
		mnNewMenu.add(mntmCadastrarCliente);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Cadastrar Filme");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroFilme cadastroFilme = new TelaCadastroFilme();
				cadastroFilme.setVisible(true);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/film_add.png")));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmCadastrarFornecedor = new JMenuItem("Cadastrar Fornecedor");
		mntmCadastrarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroFornecedor cadastroFornecedor = new TelaCadastroFornecedor();
				cadastroFornecedor.setVisible(true);
			}
		});
		mntmCadastrarFornecedor.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/group_add.png")));
		mnNewMenu.add(mntmCadastrarFornecedor);
		
		JMenu mnConsultar = new JMenu("Consultar");
		mnConsultar.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/zoom.png")));
		menuBar.add(mnConsultar);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsultaCliente consultaCliente = new TelaConsultaCliente();
				consultaCliente.setVisible(true);
			}
		});
		mntmClientes.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/user.png")));
		mnConsultar.add(mntmClientes);
		
		JMenuItem mntmFilmes = new JMenuItem("Filmes");
		mntmFilmes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsultaFilme consultaFilme = new TelaConsultaFilme();
				consultaFilme.setVisible(true);
			}
		});
		mntmFilmes.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/film.png")));
		mnConsultar.add(mntmFilmes);
		
		JMenuItem mntmFornecedor = new JMenuItem("Fornecedor");
		mntmFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaConsultaFornecedor consultaFornecedor = new TelaConsultaFornecedor();
				consultaFornecedor.setVisible(true);
			}
		});
		mntmFornecedor.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/group.png")));
		mnConsultar.add(mntmFornecedor);
		
		JMenu mnLocao = new JMenu("Loca\u00E7\u00E3o");
		mnLocao.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/dvd.png")));
		menuBar.add(mnLocao);
		
		JMenuItem mntmLocar = new JMenuItem("Locar");
		mntmLocar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaLocacao locacao = new TelaLocacao();
				locacao.setVisible(true);
			}
		});
		mntmLocar.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/dvd_add.png")));
		mnLocao.add(mntmLocar);
		
		JMenu mnSobre = new JMenu("Ajuda");
		mnSobre.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/help.png")));
		menuBar.add(mnSobre);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaSobre sobre = new TelaSobre();
				sobre.setVisible(true);
			}
		});
		mntmSobre.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/book_open.png")));
		mnSobre.add(mntmSobre);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.setIcon(new ImageIcon(TelaMenuPrincipal.class.getResource("/imagens/door_out.png")));
		mnSobre.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.BLUE);
		desktopPane.setBounds(0, 241, 434, -240);
		contentPane.add(desktopPane);
	}
}
