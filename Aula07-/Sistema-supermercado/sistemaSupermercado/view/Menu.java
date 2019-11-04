package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends JFrame{
	
	JButton cadastrarButton, prazoValidadeButton, sairButton;
	
	public Menu() {
		super("Menu");
		setSize(350, 50);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		cadastrarButton = new JButton("Cadastrar");
		prazoValidadeButton = new JButton("PrazoValidade");
		sairButton = new JButton("Sair");
		
		add(cadastrarButton);
		add(prazoValidadeButton);
		add(sairButton);
		
		setVisible(true);
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getPrazoValidadeButton() {
		return prazoValidadeButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
}
