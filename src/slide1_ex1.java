
public class slide1_ex1 {

	
	public static void main(String[] args) {
	
		// Instanciando a class produto, atendendo os parametros 
		Produto p1 = new Produto("Carro", "Ford");
			
		 System.out.println(p1.produto());
	
		// Instanciando a class conta 
		 Conta conta = new Conta(0, 0);
		 
		 conta.vendido(1500);
		 conta.recebido(500);
		 
		 System.out.println("Lucro: R$"+conta.saldo);
	}
			public static class Produto {
			
		// Atributos 
			String nome;
			String marca;
			int custo;
			int venda;
		
		//Construtor
		Produto(String nome, String marca){ 
			this.nome = nome;
			this.marca = marca;
			
		}
		//String para o nome e a marca
		String produto () {
		return
			"nome " + this.nome +"\n"+
			"marca " + this.marca +"\n";
		}
			}
		
		//Class de conta 
			public static class Conta {
			int numero;
			int saldo = 0;
			
		//Parametros	
			Conta(int numero, int saldo){
				this.numero = numero;
				this.saldo = saldo;
		
		//Metodo da conta
			}
			void vendido (double valor) {
				this.saldo += valor;
			}
			void recebido (double valor) {
				this.saldo -= valor;
			}
			}
}