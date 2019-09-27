package banco;

public class Corrente extends Conta{

	public Corrente(String nome, double saldo) {
		super(nome, saldo);
	}

	@Override
	public String toString() {
		return "---- Conta Corrente ----\nNome: " + getNome() + "\nSaldo: R$ " + getSaldo();
	}
}
