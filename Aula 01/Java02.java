package br.com.generation.aula01;


//Autor: Matheus Rabelo
//Data: 25/02/2022
/* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias. */

import java.util.Scanner;

public class Java02 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int anos, mes, di, D;
		anos = 365;
		mes = 30;

	  	System.out.println("Escreva sua idade (somente em dias) ");
	  	di = leia.nextInt();

		anos = di / anos;
	  	System.out.println("\nSua idade em anos é: " + anos);
	  	  	
		mes = di / mes;
	  	System.out.println("\nSua idade em meses é: " + mes);

	  	D = di;
	 	System.out.println("\nSua idade em dias é: " + D );
	 	
	 	leia.close();
	}

}
