package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public abstract class Tela extends JFrame{
	JLabel labelNome;
	JLabel labelSenha;
	
	JTextField fieldNome;
	JTextField fieldSenha;
	
	JButton buttonOK;
	
	public Tela(String titulo, String nomeOKButton, int largura, int altura) {
		labelNome = new JLabel("Nome");
		labelSenha = new JLabel("Senha");
		
		fieldNome = new JTextField(10);
		fieldSenha = new JTextField(10);
		buttonOK = new JButton(nomeOKButton);
		
		setSize(largura, altura);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		add(labelNome);
		add(fieldNome);
		add(labelSenha);
		add(fieldSenha);
		
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public JTextField getFieldSenha() {
		return fieldSenha;
	}

	public JButton getButtonOK() {
		return buttonOK;
	}
	
}
