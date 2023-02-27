package mercadinhoFuctura;

import java.util.Scanner;

import mercadinhoFuctura.itens.Frutas;

public class Mercado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Frutas frutas = new Frutas();
		
		float pref = 0f;
		int contador = 0;
		
		System.out.println("O que está comprando?"
				+ "\n1 - Frutas"
				+ "\n2 - Movéis"
				+ "\n3 - Materiais de construção");
		int compras = input.nextInt();
		do {
		switch (compras) {
		case 1:
			float precof = frutas.frutasoperacao();
			pref = precof;
			contador ++;
			break;
		case 2:
			float precof2 = frutas.moveis();
			pref = precof2;
			contador ++;
			break;
		case 3:
			float precof3 = frutas.Materiais();
			pref  = precof3;
			contador ++;
			break;
			default:
				System.out.println("Digito inválido, repita um número válido");
				break;
		}
		} while (contador == 0);
		
		System.out.printf("O valor final dos produtos é R$: %.2f \n",pref);
		
	}

}
