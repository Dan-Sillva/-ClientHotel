package ferramentas;

public class test {
	
	private String name;
	private double value;
	
	public test () {
		
	}
	
	public test ( String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public String toString() {
		return String.format("Nome: "
				+this.name
				+"\nPreço: "
				+this.value);
	}
	
}
