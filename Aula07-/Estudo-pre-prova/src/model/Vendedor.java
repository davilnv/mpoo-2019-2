package model;

import java.util.ArrayList;

public class Vendedor extends Usuario{
	private final int CODIGOACESSO = 1;
	
	public void realizarVenda(ArrayList<Produto> produtosVendidos) {
		System.out.println("Venda realizada!");
	}

	public int getCodigoAcesso() {
		return CODIGOACESSO;
	}
}
