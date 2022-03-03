package br.com.generation.aula01;
import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int a, b, soma, subtracao;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		soma = a + b;
		subtracao = a - b;
		System.out.println("Resultado de a + b: " + soma);
		System.out.println("Resultado de a + b: " + subtracao);
		
		leia.close();
		fim();
				
	}
	
	public static void fim() {
		System.out.println("Nova Função - que se chama fim...");

	}
		
}
