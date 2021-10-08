package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.*;
/**
 * Parte de testes
 * @author Hian
 *
 */
class testCadastro {
	
	public static DadoController dados = new DadoController();

	@Test
	/**
	 * Teste de tamanho do nome de usuario cadastrado
	 */
	void test() {
		
		String nome = "ANNA";
		String cpf = "12345678998";
		String dataNasc = "20/05/2000";
		String telefone = "(61)987654654";
		String[] dado = new String [3];
		TelaCadastroController telaCadastroController = new TelaCadastroController(dados, 1, 3, nome,
                cpf, dataNasc, telefone, 0,dado);
		boolean verificar;
		if(dado[0].length()>=3) {
			verificar = false;
		}else {
			verificar = true;
		}
		assertFalse(verificar);
	}
	@Test
	/**
	 * Teste de tamanho do cpf de usuario cadastrado
	 */
	void test1() {
		
		String nome = "JOAO";
		String cpf = "12345678998";
		String dataNasc = "20/05/2000";
		String telefone = "(61)987654654";
		String[] dado = new String [3];
		TelaCadastroController telaCadastroController = new TelaCadastroController(dados, 1, 3, nome,
                cpf, dataNasc, telefone, 0,dado);
		boolean verificar;
		if(dado[1].length()>=7) {
			verificar = false;
		}else {
			verificar = true;
		}
		assertFalse(verificar);
	}
	@Test
	/**
	 * Teste de tamanho do telefone de usuario cadastrado
	 */
	void test2() {
		
		String nome = "HIAN";
		String cpf = "12345678998";
		String dataNasc = "20/05/2000";
		String telefone = "(61)987654654";
		String[] dado = new String [3];
		TelaCadastroController telaCadastroController = new TelaCadastroController(dados, 1, 3, nome,
                cpf, dataNasc, telefone, 0,dado);
		boolean verificar;
		if(dado[2].length()>=8) {
			verificar = false;
		}else {
			verificar = true;
		}
		assertFalse(verificar);
	}
	@Test
	/**
	 * Teste de tamanho do nome do produto cadastrado
	 */
	void test3() {
		
		String nome= "aaaaaaa";
		String id ="C1";
		String marca = "havaiana";
		Double valor = 100.0;
		int tamanho = 42;
		int quantidade = 5;
		String cor = "amarelo";
		String tipoBico ="fino";
		String material = "borracha";
		String [] nomeP = new String[1];
		
		TelaCadastroController cP = new TelaCadastroController(0, 0, dados, nome, marca, id, tamanho, cor,
                valor, quantidade, tipoBico, material,nomeP);
		boolean verificar;
		if(nomeP[0].length()>=3) {
			verificar = false;
		}else {
			verificar = true;
		}
		assertFalse(verificar);
	}
	@Test
	/**
	 * Teste de valor do produto cadastrado
	 */
	void test4() {
		
		String nome= "aaaaaaa";
		String id ="C1";
		String marca = "havaiana";
		Double valor = 100.0;
		int tamanho = 42;
		int quantidade = 5;
		String cor = "amarelo";
		Double circunferencia =15.0;
		Double altSalto = 5.0;
		String [] valorP = new String[1];
		Double valorPro;
		
		TelaCadastroController cP = new TelaCadastroController(0,0,dados, nome, marca, id,tamanho,
	            cor, valor,quantidade, circunferencia, altSalto, valorP);
		boolean verificar;
		valorPro = Double.parseDouble(valorP[0]);
		
		if(valorPro>0) {
			verificar = false;
		}else {
			verificar = true;
		}
		assertFalse(verificar);
	}
	@Test
	void test5() {
		/**
		 * Teste de quantidade do produto cadastrado
		 */
		String nome= "aaaaaaa";
		String id ="C1";
		String marca = "havaiana";
		Double valor = 100.0;
		int tamanho = 42;
		int quantidade = 5;
		String cor = "amarelo";
		Double alturaCano = 3.0;
		String modelo = "aaaaaaaa";
		String [] qtdP = new String[1];
		int qtdPro;
		
		TelaCadastroController cP = new TelaCadastroController(0, 0, dados,nome,marca, id, tamanho,
	           cor, valor,quantidade, alturaCano,  modelo, qtdP);
		boolean verificar;
		qtdPro = Integer.parseInt(qtdP[0]);
		
		if(qtdPro>0) {
			verificar = false;
		}else {
			verificar = true;
		}
		assertFalse(verificar);
	}

}
