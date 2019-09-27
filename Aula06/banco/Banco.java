package banco;

public class Banco {
	public static void main(String[] args) {
		Poupanca poupanca = new Poupanca("José", 200);
		System.out.println(poupanca.toString());
		Corrente corrente = new Corrente("Maria", 100);
		System.out.println(corrente.toString());
		transferencia(poupanca, corrente, 100);
		System.out.println(poupanca.toString());
		System.out.println(corrente.toString());
	}
	//Polimorfismo de Objeto: Tratar uma classe escpecializada com uma classe generalizada
	public static boolean transferencia(Conta origem, Conta destino, double valor) {
		if (origem != null && destino != null) {
			if (origem instanceof Corrente)
				valor += 0.5;
			if (origem.sacar(valor)) {
				valor -= 0.5;
				
				if (destino instanceof Poupanca) {
					if (((Poupanca) destino).getDV()== 1)
						valor += 0.10;
				}
				
				destino.depositar(valor);
				//System.out.println("Sucesso!");
				return true;
			}
		}
		//System.out.println("Insucesso!");	
		return false;
	}
}
