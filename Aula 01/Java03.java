package br.com.generation.aula01;


// Autor: Matheus Rabelo
//  Data: 25/02/2022
/* 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos. */

import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int seg, h, m, mi;
		
		System.out.printf("Digite a duração do evento (segundos): ");
		seg = leia.nextInt();
			
		mi = seg / 60;
		
		System.out.printf("Conversão de valores: ");
	    System.out.printf(seg + " segundos = ");
	    System.out.printf(mi + "min ");
		
		h = seg / 3600;
		seg %= 3600;
		m = seg / 60;
		seg %= 60;
		
		System.out.println();
		
		System.out.printf("Tempo total: ");
		
		if (h > 0);
		    System.out.printf(h + " horas ");
		if (m > 0);
		    System.out.printf(m + " minutos ");
		if (seg > 0);
		    System.out.printf(seg + " segundos ");
			
		leia.close();
	}
}
