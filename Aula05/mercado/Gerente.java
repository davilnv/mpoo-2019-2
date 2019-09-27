package mercado;

public class Gerente extends Usuario{
	private int horasTrabalhadas;
	private double precoHora;

	public Gerente(String nome, String cpf, Endereco endereco, double precoHora) {
		super(nome, cpf, endereco);
		this.setPrecoHora(precoHora);
	}
	
	public void addHorasTrabalhadas(int quantidade) {
		horasTrabalhadas += quantidade;
	}
	
	public void zerarHoras() {
		horasTrabalhadas = 0;
	}
	
	public void darDesconto() {
		System.out.println("Desonto");
	}

	@Override
	public void calcularSalario() {
		this.setSalario(horasTrabalhadas*precoHora);
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}
}
