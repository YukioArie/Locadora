package br.ucam.yukio.model.DAO;

import javax.swing.JOptionPane;

import br.ucam.yukio.connection.ConnectionFactory;
import br.ucam.yukio.model.bean.Cliente;
import br.ucam.yukio.model.bean.Locacao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LocacaoDAO {

	public void cadastrar(Locacao locacao) {
		Connection con = null;
		PreparedStatement stmt = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		
		try {
			stmt = conect.con.prepareStatement("insert into locacao(cliente, filme) values(?,?)");
			stmt.setInt(1, locacao.getCliente().getId());
			stmt.setInt(2, locacao.getFilme().getId());
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Locação feita com sucesso");
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao consultar: "+e);
		}finally {
			conect.desconecta();
		}
	
}
	public List<Locacao> listar(){
		
		PreparedStatement stmt = null;
		Connection con = null;
		ResultSet rs = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		List<Locacao> locacao = new ArrayList<>();
		
		try {
			stmt = conect.con.prepareStatement("select * from locacao");
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Locacao l = new Locacao();
				
				l.setCliente(rs.getInt("id"));
				l.setFilme(rs.getInt("id"));
				
				locacao.add(l);
				
				
			}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao consultar: "+e);
		}finally {
			conect.desconecta();
		}
		return locacao;
	}
	
}