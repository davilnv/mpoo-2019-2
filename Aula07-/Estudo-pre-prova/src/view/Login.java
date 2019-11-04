package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends TelaGenerica{
	
	JButton confirmarButton, voltarButton;
	JTextField loginField, senhaField;
	JLabel loginLabel, senhaLabel;
	
	public Login() {
		super("Login");
		
		confirmarButton = new JButton("Confirmar");
		confirmarButton.setBounds(150, 290, 200, 20);
		voltarButton = new JButton("Voltar");
		voltarButton.setBounds(150, 330, 200, 20);
		
		loginField = new JTextField();
		loginField.setBounds(200, 150, 150, 20);
		senhaField = new JTextField();
		senhaField.setBounds(200, 200, 150, 20);

		loginLabel = new JLabel("Login: ");
		loginLabel.setBounds(150, 150, 150, 20);
		senhaLabel = new JLabel("Senha: ");
		senhaLabel.setBounds(150, 200, 150, 20);
				
		add(confirmarButton);
		add(voltarButton);
		
		add(loginField);
		add(senhaField);
		
		add(loginLabel);
		add(senhaLabel);
		
	}
	
	public JButton getConfirmarButton() {
		return confirmarButton;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}
	
}
