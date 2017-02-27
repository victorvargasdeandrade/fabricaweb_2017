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
		//Criando o usuário		
		Usuario u = new Usuario();
		u.setNome("Maria");
		u.setLogin("maria");
		u.setSenha("xxx");
		
		//Cadastrando o usuário de teste no banco de dados
		UsuarioDAO uDAO = new UsuarioDAO();
		uDAO.cadastrar(u);
		
		System.out.println("Usuário cadastrado com sucesso!");
	}
	
	public static void testAlterar() {
		//Criando o usuário	para alterar	
		Usuario u = new Usuario();
		u.setIdusuario(3);
		u.setNome("Maria de Fátima");
		u.setLogin("mariadefatima");
		u.setSenha("maria123");
		
		//Alterando os dados do usuário de teste no banco de dados
		UsuarioDAO uDAO = new UsuarioDAO();
		uDAO.alterar(u);
		
		System.out.println("Usuário alterado com sucesso!");
	}
	
	public static void testExcluir() {
		//Criando o usuário	para alterar	
		Usuario u = new Usuario();
		u.setIdusuario(3);

		//Excluindo o usuário de teste no banco de dados
		UsuarioDAO uDAO = new UsuarioDAO();
		uDAO.excluir(u);
				
		System.out.println("Usuário excluído com sucesso!");
		
	}

}
