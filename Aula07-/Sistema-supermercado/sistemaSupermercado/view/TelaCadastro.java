package view;

import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame{
	
	JButton addButton, sairButton;
	JRadioButton perecivelButton, naoPerecivelButton;
	JLabel nomeLabel, precoLabel, validadeLabel;
	JTextField nomeField, precoField, validadeField;
	
	public TelaCadastro() {
		super("Cadastro");
		setSize(195, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		nomeLabel = new JLabel("Nome: ");
		precoLabel = new JLabel("Preço: ");
		validadeLabel = new JLabel("Validade: ");
		
		nomeField = new JTextField(10);
		precoField = new JTextField(10);
		
		JFormattedTextField valField = new JFormattedTextField(
				new SimpleDateFormat("yyyy.MM.dd"));
		valField.setValue(new Date());
		validadeField = new JTextField(valField.getText(),8);
		
		perecivelButton = new JRadioButton("Perecível", true);
		naoPerecivelButton = new JRadioButton("Não Perecível");
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(perecivelButton);
		grupo.add(naoPerecivelButton);
		
		addButton = new JButton("Add");
		sairButton = new JButton("Sair");
		
		add(nomeLabel);
		add(nomeField);
		add(precoLabel);
		add(precoField);
		add(validadeLabel);
		add(validadeField);
		add(perecivelButton);
		add(naoPerecivelButton);
		add(addButton);
		add(sairButton);
		
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public JRadioButton getPerecivelButton() {
		return perecivelButton;
	}

	public JRadioButton getNaoPerecivelButton() {
		return naoPerecivelButton;
	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getPrecoField() {
		return precoField;
	}

	public JTextField getValidadeField() {
		return validadeField;
	}
	
}
