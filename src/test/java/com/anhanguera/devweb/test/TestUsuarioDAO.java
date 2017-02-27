package com.anhanguera.devweb.test;

import com.anhanguera.devweb.entidade.Usuario;
import com.anhanguera.devweb.persistencia.dao.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		//testCadastrar();
		//testAlterar();
		//testExcluir();
	}
	
	public static void testCadastrar() {
		//Criando o usu�rio		
		Usuario u = new Usuario();
		u.setNome("Maria");
		u.setLogin("maria");
		u.setSenha("xxx");
		
		//Cadastrando o usu�rio de teste no banco de dados
		UsuarioDAO uDAO = new UsuarioDAO();
		uDAO.cadastrar(u);
		
		System.out.println("Usu�rio cadastrado com sucesso!");
	}
	
	public static void testAlterar() {
		//Criando o usu�rio	para alterar	
		Usuario u = new Usuario();
		u.setIdusuario(3);
		u.setNome("Maria de F�tima");
		u.setLogin("mariadefatima");
		u.setSenha("maria123");
		
		//Alterando os dados do usu�rio de teste no banco de dados
		UsuarioDAO uDAO = new UsuarioDAO();
		uDAO.alterar(u);
		
		System.out.println("Usu�rio alterado com sucesso!");
	}
	
	public static void testExcluir() {
		//Criando o usu�rio	para alterar	
		Usuario u = new Usuario();
		u.setIdusuario(3);

		//Excluindo o usu�rio de teste no banco de dados
		UsuarioDAO uDAO = new UsuarioDAO();
		uDAO.excluir(u);
				
		System.out.println("Usu�rio exclu�do com sucesso!");
		
	}

}
