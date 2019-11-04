package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.Estoque;
import model.Produto;
import model.Vendedor;
import view.Login;
import view.Mensagem;
import view.TelaVendedor;

public class ControleVendedor implements ActionListener{
	TelaVendedor vendedor;
	Login login;
	Vendedor vendedorUsuario = new Vendedor();
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public ControleVendedor(TelaVendedor vendedor, Login login) {
		this.vendedor = vendedor;
		this.login = login;
		
		vendedor.getVoltarButton().addActionListener(this);
		vendedor.getAdicionarButton().addActionListener(this);
		vendedor.getRealizarVendaButton().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == vendedor.getVoltarButton()) {
			vendedor.setVisible(false);
			login.setVisible(true);
		}
		
		if (vendedor.getNomeRadioButton().isSelected()) {
			vendedor.getNomeLabel().setVisible(true);
			vendedor.getNomeField().setVisible(true);
			vendedor.getCodigoLabel().setVisible(false);
			vendedor.getCodigoField().setVisible(false);
		}
		
		if (vendedor.getCodigoRadioButton().isSelected()) {
			vendedor.getCodigoLabel().setVisible(true);
			vendedor.getCodigoField().setVisible(true);
			vendedor.getNomeLabel().setVisible(false);
			vendedor.getNomeField().setVisible(false);
		}
		
		if(e.getSource() == vendedor.getAdicionarButton()) {
			if(vendedor.getNomeRadioButton().isSelected()) {
				Produto produto = Estoque.buscarProduto(vendedor.getNomeField().getText());
				if (produto != null) {
					produtos.add(produto);
					Mensagem.exibirMensagem("Produto adicionado a lista.");
				} else
					Mensagem.exibirMensagem("Produto não disponivel!");
			} else if(vendedor.getCodigoRadioButton().isSelected()) {
				Produto produto = Estoque.buscarProduto("", vendedor.getCodigoField().getText());
				if (produto != null) {
					produtos.add(produto);
					Mensagem.exibirMensagem("Produto adicionado a lista.");
				} else
					Mensagem.exibirMensagem("Produto não disponivel!");
			}
		}
		
		if (e.getSource() == vendedor.getRealizarVendaButton()) {
			if (produtos.size() != 0) {
				vendedorUsuario.realizarVenda(produtos);
				Mensagem.exibirMensagem("Venda realizada com sucesso!");
			} else
				Mensagem.exibirMensagem("Nenhum produto foi adicionado a lista");
		}
	}

}
