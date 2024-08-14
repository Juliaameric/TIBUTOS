package atributos;

public class Aviao {

		String companhia;
		String tipo;
		int capacidade;
		String cor;
		String identificacao;
		
		public String getCompanhia() {
			return companhia;
		}
		public void setCompanhia(String companhia) {
			this.companhia = companhia;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;

		}
		public int getCapacidade() {
			return capacidade;

		}
		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}
		
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public String getIdentificacao() {
			return identificacao;
		}
		public void setIdentificacao(String identificacao) {
			this.identificacao = identificacao;
	}
		public String voar() {
			return "Voando";
		}
		public String pousar() {
			return "Pousando";
		}
		public String planando() {
			return "Planando";
		}
}
