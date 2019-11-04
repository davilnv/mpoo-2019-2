package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public static boolean addProduto(Produto produto) {
		for (Produto p : produtos) {
			if (p.getNome().equalsIgnoreCase(produto.getNome())) {
				return false;
			}
		}
		return produtos.add(produto);
	}
	
	public static String exibirProduto() {
		return "";
	}
	
	public static boolean verificarValidade(Produto produto) {
		return true;
	}
	
	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
	
}
