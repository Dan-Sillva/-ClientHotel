package ferramentas;

public class ClientHouse {
	
	private int quantPessoas;
	private String email;
	private String nome;
	private double conta ;
	private int dias;
	
	public ClientHouse ( int pessoas, String email, String nome, int dias ) {
		this.quantPessoas = pessoas;
		this.email = email;
		this.dias = dias;
		this.nome = nome;
	}
	
	public int getQuantPessoas() {
		return quantPessoas;
	}
	
	public String getEmail() {
		return email;
	}
	
	public double getConta() {
		return conta;
	}
	
	public int getDias() {
		return dias;
	}
	
	public String getNome() {
		String noome = this.nome;
		return noome;
	}
	
	public double calcularConta() {
		return quantPessoas * 20 * dias;
	}
	public String toString(int numQuarto, String nome, int numPessoas, 
			String email, int dias, double diaria) {
		
		return String.format("Numero do quarto: #"+ numQuarto +"\n"
				+ "Nome do inquilino responsavel: "+ nome +"\n"
				+ "Quantidade de pessoas: "+ numPessoas +"\n"
				+ "E-mail do responsavel: "+ email +"\n"
				+ "Quantidade de dias que ficarão: "+ dias +"\n"
				+ "Conta a ser paga no final (Diaria custa $20 por pessoa) : $ %.2f "
				+ "\n", diaria) ;
	}

}















