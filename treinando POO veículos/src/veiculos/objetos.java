package veiculos;

import java.util.Scanner;

public class objetos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//criando objetos carros da classe Carro
		ClasseCarro carro1 = new ClasseCarro();
		ClasseCarro carro2 = new ClasseCarro();
		
		//para carros: populando objetos carros com método Populando
		carro1.PopulandoCarro();
		carro2.PopulandoCarro();
		
		//para carros: exibindo formulários preenchidos pelo método Populando com método Exibindo
		carro1.ExibindoCarro();
		carro2.ExibindoCarro();
		
		
		
//		//criando objetos motos da classe Moto
//		ClasseMoto moto1 = new ClasseMoto();
//		ClasseMoto moto2 = new ClasseMoto();
//		
//		//para motos: populando objetos motos com método Populando
//		moto1.PopulandoMoto();
//		moto2.PopulandoMoto();
//		
//		//para motos: exibindo formulários preenchidos pelo método Populando com método Exibindo
//		moto1.Exibindo();
//		moto2.Exibindo();

	}

}
