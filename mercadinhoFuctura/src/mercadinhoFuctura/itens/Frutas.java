package mercadinhoFuctura.itens;

import java.util.Scanner;

public class Frutas {
	
	public float frutasoperacao () {
	Scanner input = new Scanner(System.in);
	System.out.println("Quantos produtos deseja comprar?");
	int produtos = input.nextInt();
	
	float Banana = 4.50f;
	float Maça = 3.00f;
	float Melão = 6.45f;
	float Goiaba = 2.90f;
	float Mamão = 3.50f;
	
	int contador =0;
	int contador1 = 0;
	float precof =0;
	float preco1= 0;
	
	do {
		do {
		System.out.println("Qual fruta irá comprar?");
		String Fruta = input.next();
		
		switch (Fruta){
		case "Banana":
			System.out.println("Digite a quantidade desejada: ");
			float quantidade = input.nextFloat();
			preco1 = preco(quantidade,Banana);
			precof = precof +preco1;
			contador1 ++;
			break;
		case "Maça":
			System.out.println("Digite a quantidade desejada: ");
			float quantidade1 = input.nextFloat();
			preco1 = preco(quantidade1,Maça);
			precof = precof +preco1;
			contador1 ++;
			break;
		case "Melão":
			System.out.println("Digite a quantidade desejada: ");
			float quantidade2 = input.nextFloat();
			preco1 = preco(quantidade2,Melão);
			precof = precof +preco1;
			contador1 ++;
			break;
		case "Goiaba":
			System.out.println("Digite a quantidade desejada: ");
			float quantidade3 = input.nextFloat();
			preco1 = preco(quantidade3, Goiaba);
			precof = precof +preco1;
			contador1 ++;
			break;
		case "Mamão":
			System.out.println("Digite a quantidade desejada: ");
			float quantidade4 = input.nextFloat();
			preco1 = preco(quantidade4,Mamão);
			precof = precof +preco1;
			contador1 ++;
			break;
			default:
				System.out.println("Esta fruta não está disponível no estoque, por favor digite novamente:");
				break;
		}
		} while (contador1 == 0);
		contador1 --;
		
		contador++;
	} while (contador<produtos);
	return precof;
	}
	
	public float moveis() {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos produtos deseja comprar?");
		int produtos = input.nextInt();
		float Cadeira = 25.50f;
		float Mesa = 60.0f;
		float Roupao = 23.45f;
		float oculosdsol = 10.60f;
		
		int contador =0;
		int contador1 = 0;
		float precof =0;
		float preco1= 0;
		
		do {
			do {
			System.out.println("Qual movél irá comprar?");
			String Fruta = input.next().toLowerCase();
			
			switch (Fruta){
			case "cadeira":
				System.out.println("Digite a quantidade desejada: ");
				float quantidade = input.nextFloat();
				preco1 = preco(quantidade,Cadeira);
				precof = precof +preco1;
				contador1 ++;
				break;
			case "mesa":
				System.out.println("Digite a quantidade desejada: ");
				float quantidade1 = input.nextFloat();
				preco1 = preco(quantidade1,Mesa);
				precof = precof +preco1;
				contador1 ++;
				break;
			case "roupao":
				System.out.println("Digite a quantidade desejada: ");
				float quantidade2 = input.nextFloat();
				preco1 = preco(quantidade2,Roupao);
				precof = precof +preco1;
				contador1 ++;
				break;
			case "oculosdesol":
				System.out.println("Digite a quantidade desejada: ");
				float quantidade3 = input.nextFloat();
				preco1 = preco(quantidade3,oculosdsol);
				precof = precof +preco1;
				contador1 ++;
				break;
				default:
					System.out.println("Esta fruta não está disponível no estoque, por favor digite novamente:");
					break;
			}
			} while (contador1 == 0);
			contador1 --;
			
			contador++;
		} while (contador<produtos);
		return precof;

		
	}
	
	public float Materiais() {
		Scanner input = new Scanner(System.in);
		System.out.println("Quantos produtos deseja comprar?");
		int produtos = input.nextInt();
		
		float Tinta = 60.90f;
		float Pincel = 21.89f;
		float Baldedplas = 23.49f;
		float Escada = 110.60f;
		float Martelo = 31.99f;
		
		int contador =0;
		int contador1 = 0;
		float precof =0;
		float preco1= 0;
		
		do {
			do {
			System.out.println("Qual material irá comprar?");
			String Fruta = input.next().toLowerCase();
			
			switch (Fruta){
			case "tinta":
				System.out.println("Digite a quantidade desejada: ");
				float quantidade = input.nextFloat();
				preco1 = preco(quantidade,Tinta);
				precof = precof +preco1;
				contador1 ++;
				break;
			case "pincel":
				System.out.println("Digite a quantidade desejada: ");
				float quantidade1 = input.nextFloat();
				preco1 = preco(quantidade1,Pincel);
				precof = precof +preco1;
				contador1 ++;
				break;
			case "baldedeplastico":
				System.out.println("Digite a quantidade desejada: ");
				float quantidade2 = input.nextFloat();
				preco1 = preco(quantidade2,Baldedplas);
				precof = precof +preco1;
				contador1 ++;
				break;
			case "escada":
				System.out.println("Digite a quantidade desejada: ");
				float quantidade3 = input.nextFloat();
				preco1 = preco(quantidade3,Escada);
				precof = precof +preco1;
				contador1 ++;
				break;
			case "martelo":
				System.out.println("Digite a quantidade desejada: ");
				float quantidade4 = input.nextFloat();
				preco1 = preco(quantidade4,Martelo);
				precof = precof +preco1;
				contador1 ++;
				break;
				default:
					System.out.println("Esta fruta não está disponível no estoque, por favor digite novamente:");
					break;
			}
			} while (contador1 == 0);
			contador1 --;
			
			contador++;
		} while (contador<produtos);
		return precof;

		
	}
	
	public float preco (float quantidade, float preço) {
		return quantidade*preço;
	}

}
