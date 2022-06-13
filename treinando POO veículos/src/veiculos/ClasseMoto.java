package veiculos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ClasseMoto {
	
	public String marca;
	public int cilindradas;
	public int ano;
	public double preco;
	
	public void PopulandoMoto () {
		
		try (Scanner teclado = new Scanner(System.in)) {
			
			
			System.out.println("Marca: ");
			marca = teclado.next();
			
			System.out.println("Cilindradas: ");
			cilindradas = teclado.nextInt();
			
			System.out.println("Ano: ");
			ano = teclado.nextInt();
			
			System.out.println("Preço: ");
			preco = teclado.nextDouble();
			
			}
		}
	
	public void PopulandoMoto () {
		
		DecimalFormat reais = new DecimalFormat("R$##0.00");
		
		System.out.println("Marca: " + marca + 
				"; Cilindradas: " +	cilindradas +
				"; Ano: " + ano +
				"; Preço: " + reais.format(preco));
	}

}
