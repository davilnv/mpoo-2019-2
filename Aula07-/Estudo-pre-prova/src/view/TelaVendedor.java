package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaVendedor extends TelaGenerica{
	
	JButton adicionarButton, realizarVendaButton, voltarButton;
	JRadioButton nomeRadioButton, codigoRadioButton;
	JTextField nomeField, codigoField;
	JLabel nomeLabel, codigoLabel;
	
	public TelaVendedor() {
		super("Vendedor");
		
		adicionarButton = new JButton("Adicionar");
		adicionarButton.setBounds(150, 270, 200, 20);
		realizarVendaButton = new JButton("Realizar venda");
		realizarVendaButton.setBounds(150, 300, 200, 20);
		voltarButton = new JButton("Voltar");
		voltarButton.setBounds(150, 330, 200, 20);

		nomeRadioButton = new JRadioButton("Nome", true);
		nomeRadioButton.setBounds(150, 150, 100, 20);
		codigoRadioButton = new JRadioButton("Código");
		codigoRadioButton.setBounds(250, 150, 100, 20);
		
		nomeField = new JTextField();
		nomeField.setBounds(200, 210, 150, 20);
		codigoField = new JTextField();
		codigoField.setBounds(200, 210, 150, 20);
		
		nomeLabel = new JLabel("Nome: ");
		nomeLabel.setBounds(150, 210, 60,20);
		codigoLabel = new JLabel("Código: ");
		codigoLabel.setVisible(false);
		codigoLabel.setBounds(140, 210, 80,20);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(nomeRadioButton);
		grupo.add(codigoRadioButton);
		
		add(nomeRadioButton);
		add(codigoRadioButton);
		
		add(nomeField);
		add(codigoField);
		
		add(nomeLabel);
		add(codigoLabel);
		
		add(adicionarButton);
		add(realizarVendaButton);
		add(voltarButton);
	}

	public JButton getAdicionarButton() {
		return adicionarButton;
	}

	public JButton getRealizarVendaButton() {
		return realizarVendaButton;
	}

	public JButton getVoltarButton() {
		return voltarButton;
	}

	public JRadioButton getNomeRadioButton() {
		return nomeRadioButton;
	}

	public JRadioButton getCodigoRadioButton() {
		return codigoRadioButton;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCodigoField() {
		return codigoField;
	}

	public JLabel getNomeLabel() {
		return nomeLabel;
	}

	public JLabel getCodigoLabel() {
		return codigoLabel;
	}
	
}
