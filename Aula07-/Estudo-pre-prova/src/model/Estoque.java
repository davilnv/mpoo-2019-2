package model;

import java.util.ArrayList;

public class Estoque {
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public static boolean addProduto(Produto produto) {
		return produtos.add(produto);
	}
	
	public static Produto buscarProduto(String nome) {
		for (Produto p : produtos) {
			if (p.getNome().equalsIgnoreCase(nome)) {
				return p;
			}
		}
		return null;
	}
	
	public static Produto buscarProduto(String nome, String codigo) {
		for (Produto p : produtos) {
			if (p.getCodigo().equalsIgnoreCase(codigo)) {
				return p;
			}
		}
		return null;
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
}
