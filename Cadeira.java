package atributos;

public class Cadeira {
	String cor; //declarando e armazenando nossas variaveis Strings
	String tamanho;
	String material;
	String tipo;
	
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;

	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String reclina() {
		return "reclinar";
	}
	public String rodar() {
		return "rodar";
	}
}
	

