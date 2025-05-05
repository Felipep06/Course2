package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class progam {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
   
      product Product = new product();
		System.out.println("Dados do produto: ");
		System.out.println("Nome: ");
		Product.name = sc.nextLine();
		System.out.print("Preço do produto: ");
		Product.price = sc.nextDouble();
		System.out.println("Quantidade de produtos em estoque: ");
		Product.quantity = sc.nextInt();
			
		System.out.println("Dados do produto: "+  Product);
		
		System.out.println();
		System.out.println("Insira a quantidade de produtos a serem adicionados ao estoque:");
		int quantity = sc.nextInt();
		Product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: "+  Product);
		
		System.out.println();
		System.out.println("Insira a quantidade de produtos a serem retirados do estoque:");
		quantity = sc.nextInt();
		Product.removeProdut(quantity);
		
		System.out.println();
		System.out.println("Dados atualizado: "+ Product);
		
		sc.close();
		
		
	}

}
