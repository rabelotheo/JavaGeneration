package br.com.generation.aula02;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2, num3, maior;
		
		System.out.printf("Digite o primeiro n�mero: ");
		num1 = entrada.nextInt();
		
		System.out.printf("Digite o segundo n�mero: ");
		num2 = entrada.nextInt();
		
		System.out.printf("Digite o terceiro n�mero: ");
		num3 = entrada.nextInt();
		{
		
	    if(num1 > num2){
	        if(num1 > num3)
	            maior = num1;
	        else
	            maior = num3;
	    }
	    else{
	        if(num2 > num3)
	            maior = num2;
	        else
	            maior = num3;
	    	}
	    System.out.printf("O maior n�mero �: " + maior);
	    entrada.close();
		}
	}
}