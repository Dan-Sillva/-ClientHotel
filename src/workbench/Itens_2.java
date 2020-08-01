package workbench;

import java.util.*;

import ferramentas.Product;

public class Itens_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double total;		int add, remove;
		String decision, add1 = "add", remove1 = "remove";

		System.out.println("Enter a product data: ");
		System.out.print("Name: ");
		String name = sc.next();

		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);

		total = product.totalValueInStock();

		System.out.println(product.toString());

		System.out.println("Do you want to add, remove or finish (add/remove/na)?");
		decision = sc.next();

		do {

			if (decision.equals(add1)) {
				System.out.print("Enter the amount to add: ");
				add = sc.nextInt();

				product.addProduct(add);
				total = product.totalValueInStock();

				System.out.println(product.toString());

			} else if (decision.equals(remove1)) {
				System.out.print("Enter the amount to remove: ");
				remove = sc.nextInt();

				product.removeProduct(remove);
				total = product.totalValueInStock();

				System.out.println(product.toString());
			}

			System.out.println("Do you want to add, remove or finish (add/remove/na)?");
			decision = sc.next();
		} while (decision.equals(add1) || decision.equals(remove1));
		System.out.println("Thanks!!!");
	}
}
