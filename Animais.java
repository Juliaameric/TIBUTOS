package atributos;

public class Animais {
	
	String nome;
	String raca;
	int idade;
	String cor;
	String tamanho;
	String comidas;
	String genero;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;

	}
	public int getIdade() {
		return idade;

	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
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
	public void setComidas(String comidas) {
		this.comidas = comidas;
}
	public String getComida() {
		return comidas;
	}
	public void setGenero(String genero) {
		this.genero = genero;
}
	public String getGenero() {
		return genero;
	}

	public String andar() {
		return "andando";
	}
	public String dormir() {
		return "dormindo";
	}
	public String ciscar() {
		return "ciscando";
	}
	public String pular() {
		return "saltitando";
	}
	public String pastar() {
		return "pastar";
	}
	
}
