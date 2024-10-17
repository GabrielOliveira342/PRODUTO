
public class slide1_ex2 {

	public static void main(String[] args) {
	
	//Instanciando a Pessoa
	Pessoa Pessoa = new Pessoa("gabriel", "alberto", 1.70, 1990);
	
	// Recorrendo o metodo 
	System.out.println(Pessoa.email());
	
	}
	public static class Pessoa {
	
	//Atributos
		String nome;
		String sobrenome;
		double altura;
		int data;
		
	//Contrutor
	Pessoa(String nome, String sobrenome, double altura, int data){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.altura = altura;
		this.data = data;
	}
	//Metodo da pessoa
	String email() {
		return
				this.nome+"."+
				this.sobrenome + "@gmail";
				
	}
	

	}
	
}
