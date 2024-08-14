package atributos;

public class Cadeira_objeto {

	public static void main(String[] args) {
		Cadeira cadeira1 = new Cadeira();
		Cadeira cadeira2= new Cadeira();
		
		cadeira1.setCor("vinho");
		cadeira1.setTamanho("altura do encosto 96 cm, comprimento do assento 60 cm e altura do chão até o assento de 3 a 45 cm.");
		cadeira1.setMaterial("aço e couro ");
		cadeira1.setTipo("Escritorio");
		

		System.out.println("-----------cadeira 1----------");
		System.out.println(cadeira1.getCor());
	    System.out.println(cadeira1.getTamanho());
		System.out.println(cadeira1.getMaterial());
		System.out.println(cadeira1.getTipo());
		System.out.println(cadeira1.reclina());
	    
			
	    cadeira2.setCor("Azul");
	    cadeira2.setTamanho("encosto 59 cm,assento 44 cm e altura do chão até o assento de 35 a 43 cm.");
	    cadeira2.setMaterial("aço e couro");
	    cadeira2.setTipo("Gamer");
	   
			System.out.println("-----------cadeira 2----------");
			System.out.println(cadeira2.getCor());
			System.out.println(cadeira2.getTamanho());
			System.out.println(cadeira2.getMaterial());
			System.out.println(cadeira2.getTipo());
			System.out.println(cadeira2.rodar());
			
	}

}
