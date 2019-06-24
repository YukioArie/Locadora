package br.ucam.yukio.model.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.ucam.yukio.connection.ConnectionFactory;
import br.ucam.yukio.model.bean.Cliente;
import br.ucam.yukio.model.bean.Filme;

public class FilmeDAO {

	public void create(Filme filme) {
		Connection con = null;
		PreparedStatement stmt = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		try {
			stmt = conect.con.prepareStatement("insert into filme(titulo, categoria, sinopse, valor) values(?,?,?,?)");
			stmt.setString(1, filme.getTitulo());
			stmt.setString(2, filme.getCategoria());
			stmt.setString(3, filme.getSinopse());
			stmt.setInt(4, filme.getValor());

			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Filme : " + filme.getTitulo() + " inserido com sucesso!");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
		} finally {
			// ConnectionFactory.closeConnection((ConnectionFactory) con, stmt);
			// JOptionPane.showMessageDialog(null, "Conexão fechada!");
			conect.desconecta();
		}
	}

	public void update(Filme filme) {
		Connection con = null;
		PreparedStatement stmt = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		try {
			stmt = conect.con.prepareStatement("update filme set titulo = ?, categoria = ?, sinopse = ?, valor = ?");
			stmt.setString(1, filme.getTitulo());
			stmt.setString(2, filme.getCategoria());
			stmt.setString(3, filme.getSinopse());
			stmt.setInt(4, filme.getValor());

			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Filme : " + filme.getTitulo() + " atualizado com sucesso!");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
		} finally {
			// ConnectionFactory.closeConnection((ConnectionFactory) con, stmt);
			// JOptionPane.showMessageDialog(null, "Conexão fechada!");
			conect.desconecta();
		}
	}

	public void delete(Filme filme) {
		Connection con = null;
		PreparedStatement stmt = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();

		try {
			stmt = conect.con.prepareStatement("delete from filme where id = ?");
			stmt.setInt(1, filme.getId());

			stmt.executeUpdate();

			JOptionPane.showMessageDialog(null, "Deletado!");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex);
		} finally {
			conect.desconecta();
		}
	}

	public List<Filme> listar() {
		PreparedStatement stmt = null;
		Connection con = null;
		ResultSet rs = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		List<Filme> filme = new ArrayList<>();

		try {
			stmt = conect.con.prepareStatement("select * from filme");
			rs = stmt.executeQuery();

			while (rs.next()) {

				Filme f = new Filme();

				f.setTitulo(rs.getString("titulo"));
				f.setCategoria(rs.getString("categoria"));
				f.setSinopse(rs.getString("sinopse"));
				f.setValor(rs.getInt("valor"));

				filme.add(f);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao consultar: " + e);
		} finally {
			conect.desconecta();
		}
		return filme;

	}
	
	public List<Filme> buscaFilme(String titulo){
		PreparedStatement stmt = null;
		Connection con = null;
		ResultSet rs = null;
		ConnectionFactory conect = new ConnectionFactory();
		conect.conexao();
		List<Filme> filme = new ArrayList<>();
		
		try {
			stmt = conect.con.prepareStatement("select * from filme where titulo like ?");
			stmt.setString(1, "%"+ titulo + "%");
			rs = stmt.executeQuery();
			while(rs.next()) {
				
				Filme f = new Filme();

				f.setTitulo(rs.getString("titulo"));
				f.setCategoria(rs.getString("categoria"));
				f.setSinopse(rs.getString("sinopse"));
				f.setValor(rs.getInt("valor"));


				
				filme.add(f);
				
				
			}
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao consultar: "+e);
		}finally {
			conect.desconecta();
		}
		return filme;
	}
}
