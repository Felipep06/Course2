package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class progam {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
   
      product Product = new product();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		Product.name = sc.nextLine();
		System.out.print("Price: ");
		Product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		Product.quantity = sc.nextInt();
			
		System.out.println("Product data: "+  Product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock:");
		int quantity = sc.nextInt();
		Product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Upadate data: "+  Product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock:");
		quantity = sc.nextInt();
		Product.removeProdut(quantity);
		
		System.out.println();
		System.out.println("Upadate data: "+ Product);
		
		sc.close();
		
		
	}

}
