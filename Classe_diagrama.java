package atributos;

public class Classe_diagrama {
	String nome; //declarando e armazenando nossas variaveis Strings
	String telefone;
	String cpf;
	String rg;
	int id; //declarando e armazenando nossas variaveis Int 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;

	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String comprar() {
		return "compra";
	}
	public String reservar() {
		return "reserva";
	}
}
	