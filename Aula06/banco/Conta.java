package banco;

public abstract class Conta {
	private String nome;
	private double saldo;
		
	public Conta(String nome) {
		this.nome = nome;
		this.saldo = 0.0;
	}
	
	public Conta(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}
	
	public boolean sacar(double valor) {
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", saldo=" + saldo + "]";
	}
}
