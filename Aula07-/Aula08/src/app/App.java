package app;

import javax.swing.JFrame;

import controller.Controle;
import view.Tela;

public class App {
	public static void main(String[] args) {
		Tela tela1 = new Tela("JFrame1", "A", "B", "Abrir", 200, 200);
		tela1.setVisible(true);
		tela1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tela tela2 = new Tela("JFrame2", "C", "D", "Voltar", 300, 300);
		tela2.setVisible(false);
//		tela1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		Controle controle = new Controle();
		controle.getTelas().add(tela1);
		controle.getTelas().add(tela2);
		controle.control();
	}
}
