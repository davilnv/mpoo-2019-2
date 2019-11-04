package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Cadastro extends TelaGenerica{

	JRadioButton vendedorRadioButton, gerenteRadioButton;
	JButton voltarButton, cadastrarButton;
	JTextField loginField, cpfField, senhaField, confirmarSenhaField;
	JLabel loginLabel, cpfLabel ,senhaLabel, confirmarSenhaLabel;
	
	public Cadastro() {
		super("Cadastro");
		
		vendedorRadioButton = new JRadioButton("Vendedor");
		vendedorRadioButton.setBounds(150, 80, 100, 20);
		gerenteRadioButton = new JRadioButton("Gerente");
		gerenteRadioButton.setBounds(250, 80, 100, 20);
		
		
		voltarButton = new JButton("Voltar");
		voltarButton.setBounds(150, 350, 200, 20);
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setBounds(150, 320, 200, 20);
		
		loginField = new JTextField();
		loginField.setBounds(200, 120, 150, 20);
		cpfField = new JTextField();
		cpfField.setBounds(200, 170, 150, 20);
		senhaField = new JTextField();
		senhaField.setBounds(200, 220, 150, 20);
		confirmarSenhaField = new JTextField();
		confirmarSenhaField.setBounds(200, 270, 150, 20);
		
		loginLabel = new JLabel("Login: ");
		loginLabel.setBounds(145, 120, 50, 20);
		cpfLabel = new JLabel("CPF: ");
		cpfLabel.setBounds(150, 170, 50, 20);
		senhaLabel = new JLabel("Senha: ");
		senhaLabel.setBounds(140, 220, 60, 20);
		confirmarSenhaLabel = new JLabel("Confirmar senha: ");
		confirmarSenhaLabel.setBounds(70, 270, 150, 20);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(vendedorRadioButton);
		grupo.add(gerenteRadioButton);
		
		add(vendedorRadioButton);
		add(gerenteRadioButton);
		
		add(loginLabel);
		add(cpfLabel);
		add(senhaLabel);
		add(confirmarSenhaLabel);
		
		add(loginField);
		add(cpfField);
		add(senhaField);
		add(confirmarSenhaField);
		
		add(cadastrarButton);
		add(voltarButton);
	}
	
	public JRadioButton getVendedorRadioButton() {
		return vendedorRadioButton;
	}

	public JRadioButton getGerenteRadioButton() {
		return gerenteRadioButton;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JTextField getLoginField() {
		return loginField;
	}
	
	public JTextField getCpfField() {
		return cpfField;
	}

	public JTextField getSenhaField() {
		return senhaField;
	}

	public JTextField getConfirmarSenhaField() {
		return confirmarSenhaField;
	}
	
}
