package br.ucam.yukio.model.DAO;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.ucam.yukio.connection.ConnectionFactory;
import br.ucam.yukio.model.bean.Filme;
import br.ucam.yukio.model.bean.Fornecedor;

public class FornecedorDAO {
	public void create(Fornecedor fornecedor) {
		Connection con = null;
		PreparedStatement stmt = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		
		try {
			stmt = conect.con.prepareStatement("insert into fornecedor(razao_social, nome_fantasia, cnpj) values(?,?,?)");
			stmt.setString(1, fornecedor.getRazaoSocial());
			stmt.setString(2, fornecedor.getNomeFantasia());
			stmt.setInt(3, fornecedor.getCnpj());
			
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Fornecedor : " + fornecedor.getNomeFantasia() + " inserido com sucesso!");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
		} finally {
			// ConnectionFactory.closeConnection((ConnectionFactory) con, stmt);
			// JOptionPane.showMessageDialog(null, "Conexão fechada!");
			conect.desconecta();
		}
	}
	
	public void update(Fornecedor fornecedor) {
		Connection con = null;
		PreparedStatement stmt = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		
		try {
			stmt = conect.con.prepareStatement("update fornecedor set razao_social = ?, nome_fantasia = ?, cnpj = ?");
			stmt.setString(1, fornecedor.getRazaoSocial());
			stmt.setString(2, fornecedor.getNomeFantasia());
			stmt.setInt(3, fornecedor.getCnpj());
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Fornecedor : " + fornecedor.getNomeFantasia() + " atualizado com sucesso!");
		}catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
		} finally {
			// ConnectionFactory.closeConnection((ConnectionFactory) con, stmt);
			// JOptionPane.showMessageDialog(null, "Conexão fechada!");
			conect.desconecta();
		}
		
	}
	
	public void delete(Fornecedor fornecedor) {
		Connection con = null;
		PreparedStatement stmt = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		
		try {
			stmt = conect.con.prepareStatement("delete from fornecedor where id = ?");
			stmt.setInt(1, fornecedor.getId());
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Deletado!");
			
			
		}catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex);
		} finally {
			conect.desconecta();
		}
	}
	public List<Fornecedor> listar(){
		PreparedStatement stmt = null;
		Connection con = null;
		ResultSet rs = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		List<Fornecedor> fornecedor = new ArrayList<>();
		
		try {
			stmt = conect.con.prepareStatement("select * from fornecedor");
			rs = stmt.executeQuery();

			while (rs.next()) {

				Fornecedor f = new Fornecedor();

				f.setRazaoSocial(rs.getString("razao_social"));
				f.setNomeFantasia(rs.getString("nome_fantasia"));
				f.setCnpj(rs.getInt("cnpj"));

				fornecedor.add(f);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao consultar: " + e);
		} finally {
			conect.desconecta();
		}
		return fornecedor;
	}
	public List<Fornecedor> buscaFornecedor(String nomeFantasia){
		PreparedStatement stmt = null;
		Connection con = null;
		ResultSet rs = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		List<Fornecedor> fornecedor = new ArrayList<>();
		
		try {
			stmt = conect.con.prepareStatement("select * from filme where nome_fantasia like ?");
			stmt.setString(1, "%"+ nomeFantasia + "%");
			rs = stmt.executeQuery();
			while(rs.next()) {
				
				Fornecedor f = new Fornecedor();

				f.setRazaoSocial(rs.getString("razao_social"));
				f.setNomeFantasia(rs.getString("nome_fantasia"));
				f.setCnpj(rs.getInt("cnpj"));


				
				fornecedor.add(f);
				
				
			}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao consultar: "+e);
		}finally {
			conect.desconecta();
		}
		return fornecedor;
	}
	
	
}
