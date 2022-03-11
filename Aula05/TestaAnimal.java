package br.com.generation.aula06;

public class TestaAnimal {
	
	public static void main(String[] args) {
		
	//		 - - - - - - - >    CACHORRO    < - - - - - - -                        
	Cachorro cachorro = new Cachorro();
		cachorro.setNome("Nome do Cachorro: Totó");
			cachorro.setIdade(3);			
				System.out.println();	
					System.out.println(cachorro.getNome());
						System.out.println(cachorro.getIdade() + " anos");
							cachorro.som();
								cachorro.correr();
		
	//		 - - - - - - - >    CAVALO    < - - - - - - -                        
	Cavalo cavalo = new Cavalo ();
		cavalo.setNome("Nome do cavalo: Romeu");
			cavalo.setIdade(9);	
				System.out.println();
					System.out.println(cavalo.getNome());
						System.out.println(cavalo.getIdade() + " anos");
							cavalo.som();
								cavalo.correr();
		
	//		 - - - - - - - >    PREGUICA    < - - - - - - -                        
	Preguica preguica = new Preguica();	
		preguica.setNome("Nome da preguiça: Lulu");
			preguica.setIdade(5);				
				System.out.println();			
					System.out.println(preguica.getNome());
						System.out.println(preguica.getIdade() + " anos");
							preguica.som();
								preguica.subindo();
	}
}