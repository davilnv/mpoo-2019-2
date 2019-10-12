package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela extends JFrame{
	
	private JLabel testeJLabel;
	
	public Janela() {
		setSize(200, 200);
		setLocationRelativeTo(null);
		testeJLabel = new JLabel("Entrou seu trouxa!");
		
		add(testeJLabel);
	}
}
