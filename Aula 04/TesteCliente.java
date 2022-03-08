package br.com.generation.aula04Classes;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.nome = "Lucas";
		c1.idade = 32;
		c1.endereço = "Av. Marques da Rocha N 3123";
		
		System.out.println();
		
		c2.nome = "Joana";
		c2.idade = 23;
		c2.endereço = "Rua Guilhermina Freire N 235";
		
		c1.comprandoProduto(c1.nome + c1.idade + c1.endereço);
		c2.comprandoProduto(c2.nome + c2.idade + c2.endereço);
		c1.enviandoProduto(c1.nome + c1.endereço);
		c2.enviandoProduto(c2.nome + c2.endereço);

	}
}