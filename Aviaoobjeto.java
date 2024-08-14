package atributos;



public class Aviaoobjeto {

	public static void main(String[] args) {
		
				Aviao aviao1 = new Aviao();
				Aviao aviao2 = new Aviao();
					
				aviao1.setCompanhia("turma 9");
				aviao1.setTipo("modelo 244");
				aviao1.setCapacidade(200);
				aviao1.setCor("roxo");
				aviao1.setIdentificacao("55657577");

					System.out.println("-----AVIAO 1-----");
					System.out.println(aviao1.getCompanhia());
					System.out.println(aviao1.getTipo());
					System.out.println(aviao1.getCapacidade());
					System.out.println(aviao1.getCor());
					System.out.println(aviao1.getIdentificacao());
					System.out.println(aviao1.voar());
					
					aviao2.setCompanhia("turma 9");
					aviao2.setTipo("modelo 244");
					aviao2.setCapacidade(200);
					aviao2.setCor("roxo");
					aviao2.setIdentificacao("55657577");
	
							System.out.println("-----AVIAO 2-----");
							System.out.println(aviao2.getCompanhia());
							System.out.println(aviao2.getTipo());
							System.out.println(aviao2.getCapacidade());
							System.out.println(aviao2.getCor());
							System.out.println(aviao2.getIdentificacao());	
							System.out.println(aviao1.pousar());
						
					

					}
			}