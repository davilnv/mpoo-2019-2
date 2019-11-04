package model;

public class Produto {
	private String nome;
	private double preco;
	private String validade;
	private boolean perecivel;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public boolean isPerecivel() {
		return perecivel;
	}
	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", validade=" + validade + ", perecivel=" + perecivel
				+ "]";
	}

}
