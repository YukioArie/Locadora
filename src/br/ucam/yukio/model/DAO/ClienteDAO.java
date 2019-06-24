package br.ucam.yukio.model.DAO;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


import br.ucam.yukio.connection.ConnectionFactory;
import br.ucam.yukio.model.bean.*;

public class ClienteDAO {

	public void create(Cliente cliente) {
		Connection con = null;
		PreparedStatement stmt = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		try {
			stmt = conect.con.prepareStatement("insert into cliente(nome, cpf, sexo, data_nasc, telefone, celular, email) values(?,?,?,?,?,?,?)");
			stmt.setString(1, cliente.getNome());
			stmt.setInt(2, cliente.getCpf());
			stmt.setString(3, cliente.getSexo());
			stmt.setString(4, cliente.getDataNasc());
			stmt.setInt(5, cliente.getTelefone());
			stmt.setInt(6, cliente.getCelular());
			stmt.setString(7, cliente.getEmail());
			
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Cliente : " + cliente.getNome() + " inserido com sucesso!");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
		} finally {
			//ConnectionFactory.closeConnection((ConnectionFactory) con, stmt);
			//JOptionPane.showMessageDialog(null, "Conexão fechada!");
			conect.desconecta();
		}
	}
	
	public void update(Cliente cliente) {
		PreparedStatement stmt = null;
		Connection con = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		
		try {
			stmt = conect.con.prepareStatement("update aluno set nome = ?, cpf = ?, sexo = ?, data_nasc = ?, telefone = ?, celular = ?, email = ? where id = ?");
			stmt.setString(1, cliente.getNome());
			stmt.setInt(2, cliente.getCpf());
			stmt.setString(3, cliente.getSexo());
			stmt.setString(4, cliente.getDataNasc());
			stmt.setInt(5, cliente.getTelefone());
			stmt.setInt(6, cliente.getCelular());
			stmt.setString(7, cliente.getEmail());
			stmt.setInt(8, cliente.getId());
			
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Cliente "+cliente.getNome()+" atualizado com sucesso!");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar: "+ex);
		}finally {
			conect.desconecta();
		}
		
	}
	
	public void delete(Cliente cliente) {
		PreparedStatement stmt = null;
		Connection con = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		
		try {
			stmt = conect.con.prepareStatement("delete from cliente where id = ?");
			stmt.setInt(1, cliente.getId());
			
			stmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Deletado!");
		}catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar: "+ex);
		}finally {
			conect.desconecta();
		}
	}
	
	public List<Cliente> listar(){
		
		PreparedStatement stmt = null;
		Connection con = null;
		ResultSet rs = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		List<Cliente> clientes = new ArrayList<>();
		
		try {
			stmt = conect.con.prepareStatement("select * from cliente");
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Cliente c = new Cliente();
				
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getInt("cpf"));
				c.setDataNasc(rs.getString("data_nasc"));
				c.setSexo(rs.getString("sexo"));
				c.setTelefone(rs.getInt("telefone"));
				c.setCelular(rs.getInt("celular"));
				c.setEmail(rs.getString("email"));
				
				clientes.add(c);
				
				
			}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao consultar: "+e);
		}finally {
			conect.desconecta();
		}
		return clientes;
	}
	public List<Cliente> buscaNome(String nome){
		
		PreparedStatement stmt = null;
		Connection con = null;
		ResultSet rs = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		List<Cliente> clientes = new ArrayList<>();
		
		try {
			stmt = conect.con.prepareStatement("select * from cliente where nome like ?");
			stmt.setString(1, "%"+ nome + "%");
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				Cliente c = new Cliente();
				
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getInt("cpf"));
				c.setDataNasc(rs.getString("data_nasc"));
				c.setSexo(rs.getString("sexo"));
				c.setTelefone(rs.getInt("telefone"));
				c.setCelular(rs.getInt("celular"));
				c.setEmail(rs.getString("email"));
				
				clientes.add(c);
				
				
			}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao consultar: "+e);
		}finally {
			conect.desconecta();
		}
		return clientes;
	}
	
}
