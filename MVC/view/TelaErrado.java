package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaErrado {
	static JFrame jframe = new JFrame("Titulo");
	static JButton botao = new JButton("Sair");
	
	public static void main(String[] args) {
		
		jframe.setSize(200, 200);
		jframe.setLocationRelativeTo(null);
		//jframe.setResizable(false); // Impede que redimensione a tela
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new FlowLayout()); //FlowLayout default do JPanel
		jframe.add(botao);
		jframe.setVisible(true);
	}
}
