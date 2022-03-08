package br.com.generation.aula04Classes;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		ContaBancaria c2 = new ContaBancaria();
		
		c1.nome = "Amanda";
		c1.agencia = 952;
		c1.conta = 6871;
		c1.credito = 800.00;
		
		System.out.println();
		
		c2.nome = "Felipe";
		c2.agencia = 624;
		c2.conta = 3567;
		c2.credito = 1300.00;
		
		c1.dadosConta(c1.nome + c1.conta + c1.agencia + c1.credito);
		c2.dadosConta(c2.nome + c2.conta + c2.agencia + c2.credito);
	}
}