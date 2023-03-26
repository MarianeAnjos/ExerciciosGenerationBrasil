/*  Utilizando os conceitos de Classe, Objeto e Métodos, da Programação Orientada a Objetos,
 *  crie a Classe Cliente com os seus respectivos Métodos e Atributos.
 *  Na sequência, crie uma Classe chamada TestaCliente,
 *  instancie dois objetos da Classe Cliente e apresente as informações destes 2 Objetos no console.*/


package ExerciciosPoo;

import java.sql.Date;

public class Cliente {
	
	
	String nome;
	String 	CPF;
	Date nascimentoData;
	String telefone;
	String endereco;
	
	
	Cliente(String nome, String CPF, Date nascimentoData, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.CPF = CPF;
		this.nascimentoData = nascimentoData;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public void visualizar() {
		System.out.println("\nNome do cliente: "+nome);
		System.out.println("CPF do cliente: "+CPF);
		System.out.println("Data de nascimento do cliente: "+nascimentoData);
		System.out.println("Telefone do cliente: "+telefone);
		System.out.println("Endereço do cliente: "+ endereco);
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String CPF) {
		this.CPF = CPF;
	}


	public Date getNascimentoData() {
		return nascimentoData;
	}


	public void setNascimentoData(Date nascimentoData) {
		this.nascimentoData = nascimentoData;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	
}
