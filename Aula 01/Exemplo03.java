package br.com.generation.aula01;
import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int galoes;
		double  litros;
		
		System.out.println("Digite a quantidade de Galões: ");
		galoes = leia.nextInt();
		
		
		litros = galoes * 3.7854;
		
		System.out.println(galoes + " Galões = " + litros + " Litros.");
		
		leia.close();
		
	}

}
