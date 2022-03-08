package br.com.generation.aula04Classes;

public class Cliente {
	
	
	String nome;
	int idade;
	String endereço;
	
	void comprandoProduto(String string){
		System.out.println("  ||| COMPRANDO PRODUTOS |||  \n");
		System.out.println("Nome do cliente: " + nome + "\nidade: " + idade + "\nEndereço: " + endereço + "\n");
	}
	void enviandoProduto(String string){
		System.out.println("  ||| PRODUTOS EM PROCESSO DE ENVIO |||\n");
		System.out.println("Nome do recebedor: " + nome + "\nEndereço: " + endereço + "\n");
	}
}