package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import view.Tela;

public class Controle implements ActionListener {
	ArrayList<Tela> telas = new ArrayList<Tela>();
	
	public void control() {
		for (Tela tela : telas)
			tela.getBotao().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == telas.get(0).getBotao()) {
			telas.get(0).setVisible(false);
			telas.get(1).setVisible(true);
		}
		
		if (e.getSource() == telas.get(1).getBotao()) {
			telas.get(1).setVisible(false);
			telas.get(0).setVisible(true);
		}
	}

	public ArrayList<Tela> getTelas() {
		return telas;
	}
}
