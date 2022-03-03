package br.com.generation.aula01;


//Autor: Matheus Rabelo
//Data: 25/02/2022
/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias. */

import java.util.Scanner;

public class Java01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int a, m, di, D;

		System.out.println("Escreva sua idade (somente em anos) ");
	  	a = leia.nextInt();

	  	System.out.println("Escreva sua idade (somente em meses) ");
	  	m = leia.nextInt();

	  	System.out.println("Escreva sua idade (somente em dias) ");
	  	di = leia.nextInt();
	  	
	  	D = (a*365)+(m*30)+(di);
	 	System.out.println("Sua idade em dias é: " + D );
	 	
	 	leia.close();

	}
}
