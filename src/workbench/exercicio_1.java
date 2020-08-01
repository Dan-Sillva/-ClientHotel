package workbench;

import java.util.Locale;

import java.util.Scanner;

import ferramentas.ex1Client;

public class exercicio_1 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String decision2, deposit = "deposit", withdrawal = "withdrawal";
		double value;
		ex1Client client;
	
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();     // Quebra de linha
		String name = sc.nextLine();
		
		System.out.println("Is there a initial deposit (y/n) ? ");
		char response = sc.next().charAt(0);
		
		if ( response == 'y') {
			System.out.print("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			client = new ex1Client(number, name, initialDeposit);
			
		} else {
			client = new ex1Client(number, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(client);
		
		do {
			
			System.out.println("Do you want to make a deposit or withdrawal(deposit/withdrawal/not)?");
			decision2 = sc.next();
			
			if ( decision2.equals(deposit)) {
				System.out.print("Enter a deposit value: ");
				value = sc.nextDouble();
				client.depositMoney(value);
				
				System.out.println(client.toString());
			} else if ( decision2.equals(withdrawal)) {
				System.out.print("Enter a withdrawal value: ");
				value = sc.nextDouble();
				client.withdrawMoney(value);
				
				System.out.println(client.toString());
			}
			
		} while (decision2.equals(deposit) || decision2.equals(withdrawal));
		
		System.out.println("Thanks!!!!");
		
	}
}
