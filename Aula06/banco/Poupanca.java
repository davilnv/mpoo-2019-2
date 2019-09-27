package banco;

public class Poupanca extends Conta{
	private final int DV = 1;

	public Poupanca(String nome, double saldo) {
		super(nome, saldo);
	}
	
	public int getDV() {
		return DV;
	}
	
	@Override
	public String toString() {
		return "---- Conta Poupanca ----\nNome: " + getNome() + "\nSaldo: R$ " + getSaldo() + "\nDigito Verificador: " + DV;
	}
}
