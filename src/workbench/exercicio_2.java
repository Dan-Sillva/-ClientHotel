package workbench;

import java.util.*;

import javax.swing.JOptionPane;

import ferramentas.ClientHouse;

public class exercicio_2 {

	public static void main(String[] Args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ClientHouse[] room = new ClientHouse[10];
		String alugar, despachar, mostInfo;
		alugar = "Alugar";
		despachar = "Despachar";
		mostInfo = "Mostrar informações";
		int j = 0, sn = 0;
		int quantidade = 0, quantDias = 0, numQuarto = 0;
		
		for (int i=0; i <= 9;i++) {
			room[i] = new ClientHouse(0, null, "Quarto vazio", 0);
		}
			

		do {
			
			System.out.printf("Serviços: \n" + "Alugar quarto (1)\n" + "Despachar quarto (2)\n"
					+ "Mostar informações de quarto(3)\n \n" + "Digite qual serviço deseja acessar: ");
			int resposta = sc.nextInt();

			if (!(resposta == 3)) {

				if (resposta == 1) {

					System.out.println("Digite as informações necesarias a baixo: ");
					System.out.println();
					
					do {

						System.out.print("Digite o quarto a ser alugado(0 a 9): ");
						int quarto = sc.nextInt();

						if (quarto <= 9 && quarto > 0 && room[quarto].getEmail() == null) {

							numQuarto = quarto; // numero do quarto

							j = 1;
						} else {
							System.out.println("Numero invalido, tente novamente.");
							System.out.println();
						}

					} while (j != 1);

					j = 0;
					System.out.println();
					
					System.out.print("Digite o nome do inquilino: ");
					String noome = sc.nextLine();
					noome = sc.nextLine();
					System.out.println();

					do {

						System.out.print("Quantidade de pessoas no quarto: ");
						int quantPessoas = sc.nextInt();

						if (quantPessoas <= 5 && quantPessoas > 0) {

							quantidade = quantPessoas; // quantidade de pessoas

							j = 1;
						} else {
							System.out.println("Numero invalido, tente novamente.");
							System.out.println();
						}

					} while (j != 1);

					j = 0;
					System.out.println();

					System.out.print("Digite o e-mail do responsavel: ");
					String email = sc.next();
					System.out.println();

					do {

						System.out.print("Digite o periodo em dias que o quarto ficara alugado: ");
						int dias = sc.nextInt();

						if (dias <= 7 && dias > 0) {

							quantDias = dias;

							j = 1;
						} else {
							System.out.println("Numero invalido, maximo 7 dias e minimo 1, tente novamente.");
							System.out.println();
						}

					} while (j != 1);

					j = 0;
					System.out.println();

					room[numQuarto] = new ClientHouse(quantidade, email, noome, quantDias);
					
					System.out.println("Quarto cadastrado com sucesso!!");
					System.out.println();

				} else if (resposta == 2) {

					System.out.println("Digite o numero do quarto a ser desocupado(0 à 9): ");
					int quarto = sc.nextInt();

					room[quarto] = new ClientHouse(0, null, "Quarto vazio", 0);
					System.out.println("Quarto esvaziado !! ");

				} else {

				}

			} else if (resposta == 3){
				
				System.out.println("Digite o numero do quarto a ser consultado:");
				int num = sc.nextInt();
				
				String mostrarNome = room[num].getNome();
				
				System.out.println("Informações do Hostel:");
				System.out.println();
				
				System.out.printf("Numero do quarto: #"+ num +"\n"
						+ "Nome do inquilino responsavel: "+mostrarNome+"\n"
						+ "Quantidade de pessoas: "+room[num].getQuantPessoas()+"\n"
						+ "E-mail do responsavel: "+room[num].getEmail()+"\n"
						+ "Quantidade de dias que ficarão: "+room[num].getDias()+"\n"
						+ "Conta a ser paga no final (Diaria custa $20 por pessoa) : $ %.2f "
						+ "\n", room[num].calcularConta());
				
				System.out.println();
				
			} else {
				System.out.println("Comando invalido, tente novamente.");
			}
			
			System.out.printf("Deseja utilizar outro serviço? \n"
					+ "(1 = sim/2 = não) \n ");
			sn = sc.nextInt();
			
			System.out.println();

		} while ( sn == 1);
		
		System.out.println("Obrigado pela preferencia!!");
	}

}	