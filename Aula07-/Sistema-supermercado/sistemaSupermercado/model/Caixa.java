package model;

public class Caixa extends Funcionario {

	private int matricula;

	public Caixa(String nome, int matricula) {
		super(nome);
		this.setMatricula(matricula);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void realizarVenda(Produto produto) {
		
	}
}
