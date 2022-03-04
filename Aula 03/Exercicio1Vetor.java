package br.com.generation.aula03;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {

		double[] valor;
		double maior;
		

		valor = new double [5];
		maior = 0;{		
			
			for (int i = 0; i < valor.length; i++) {
				System.out.printf("Digite o " + (i+1) + "° valor: ");
				valor[i] = new Scanner(System.in).nextDouble();
				
				if (valor[i] > maior) {
					maior = valor[i];
				}
			}
			System.out.println("O maior valor é: "+ maior);
		}
	}
}