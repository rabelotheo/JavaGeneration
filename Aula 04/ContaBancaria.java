package br.com.generation.aula04Classes;

public class ContaBancaria {
	
	String nome;
	int agencia;
	int conta;
	double credito;
	
	void dadosConta(String string){
		System.out.println("Titular da conta: " + nome + "\nAgencia: " + agencia + "\nConta: " + conta + "\nCr�dito pr�-aprovado: " + credito + "\n");
	}
}