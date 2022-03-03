package br.com.generation.aula02;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] n = new int[4];
		 for (int i = 1; i < n.length; i++) 
         {
	           System.out.printf("Digite "+ i + "° numero: "); 
	           n[i] = (entrada.nextInt());
	       }
         
         Arrays.sort(n);
         
        System.out.printf("Ordem crescente:    "); 
     	  for (int i2 = 1; i2 < n.length; i2++) 
     	  {
     		System.out.printf(n[i2]+ "  ");       
		  }
     	  entrada.close();
	}
}