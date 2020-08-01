package ferramentas;

public class Product {

	//Como são variaveis privadas, utilizamos metodos get e set para alterar e pegar;
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProduct(int quant) {
		quantity += quant;
	}
	
	public void removeProduct(int quant) {
		quantity -= quant;
	}
	
	public String toString() {
		return name
			+", $"
			+String.format(" %.2f", price)
			+", "
			+quantity 
			+" units, Total: $ "	
			+String.format("%.2f",totalValueInStock());
	}
}
