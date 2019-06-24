package br.ucam.yukio.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class ConnectionFactory {
	public Statement stm;
	public ResultSet res;
	private String driver = "org.postgresql.Driver";
	private String caminho = "jdbc:postgresql://localhost:5432/postgres";
	private String usuario ="postgres";
	private String senha= "root";
	public Connection con;
	public void conexao() {
		try {
			System.setProperty("jdbc.Drivers", driver);
			con= DriverManager.getConnection(caminho, usuario, senha);
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "falha na conexao:\n"+ex.getMessage());
		}
	}
	 public void executaSql(String sql) {
		 try {
			stm= con.createStatement(res.TYPE_SCROLL_INSENSITIVE, res.CONCUR_READ_ONLY);
			res = stm.executeQuery(sql);
			
		 } catch (SQLException e) {
		JOptionPane.showMessageDialog(null, "falha na consulta:\n"+e.getMessage());
		 }
	 }
	public void desconecta() {
		try {
			con.close();
			//JOptionPane.showMessageDialog(null, "desconectado com sucesso");
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, "falha ao se desconectar:\n"+ex.getMessage());
		}
	}
}
