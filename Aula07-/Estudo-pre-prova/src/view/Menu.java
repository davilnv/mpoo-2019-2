package view;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Menu extends TelaGenerica{
	
	JButton loginButton, cadastrarButton, sairButton;
	
	public Menu() {
		super("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginButton = new JButton("Login");
		cadastrarButton = new JButton("Cadastrar");
		sairButton = new JButton("Sair");
		
		loginButton.setBounds(150, 160, 200, 20);
		add(loginButton);
		cadastrarButton.setBounds(150, 210, 200, 20);
		add(cadastrarButton);
		sairButton.setBounds(150, 260, 200, 20);
		add(sairButton);
		
		setVisible(true);
	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
}
