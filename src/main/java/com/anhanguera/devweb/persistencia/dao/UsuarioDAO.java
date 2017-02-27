package com.anhanguera.devweb.persistencia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.anhanguera.devweb.entidade.Usuario;
import com.anhanguera.devweb.persistencia.jdbc.ConexaoFactory;

public class UsuarioDAO {

	//fazendo a conex�o com o banco
	private Connection conn = ConexaoFactory.getConnection();
	
	public void cadastrar(Usuario u) {
		String sql = "insert into usuario (nome, login, senha) values (?, ?, ?)";
				
		//fazer o statement	
		try (PreparedStatement statment = conn.prepareStatement(sql)) {				
			//substitui o ? pelo dado do usu�rio
			statment.setString(1, u.getNome());
			statment.setString(2, u.getLogin());
			statment.setString(3, u.getSenha());
			
			//executa o comando sql no banco de dados
			statment.execute();
			
			//encerra o objeto PreparedStatement
			//statment.close(); N�o precisa pq j� faz automaticamente (dentro do try)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public void alterar(Usuario u) {
		String sql = "update usuario set nome=?, login=?, senha=? where idusuario=?";
						
		//fazer o statement	
		try (PreparedStatement statment = conn.prepareStatement(sql)) {
			//substitui o ? pelo dado do usu�rio
			statment.setString(1, u.getNome());
			statment.setString(2, u.getLogin());
			statment.setString(3, u.getSenha());
			statment.setInt(4, u.getIdusuario());
		
			//executa o comando sql no banco de dados
			statment.execute();
			
			//encerra o objeto PreparedStatement
			//statment.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(Usuario u) {
		String sql = "delete from usuario where idusuario=?";
		
		//fazer o statement	
		try (PreparedStatement statment = conn.prepareStatement(sql)) {
			//substitui o ? pelo dado do usu�rio
			statment.setInt(1, u.getIdusuario());
		
			//executa o comando sql no banco de dados
			statment.execute();
					
			//encerra o objeto PreparedStatement
			//statment.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
