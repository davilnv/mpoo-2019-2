package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame{
	JButton botao;
	public Tela() {
		super("Titulo");
		setSize(200, 200);
		setLocationRelativeTo(null);
		//jframe.setResizable(false); // Impede que redimensione a tela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout()); //FlowLayout default do JPanel
		
		botao = new JButton("Sair");
		add(botao);
		setVisible(true);
	}
}
