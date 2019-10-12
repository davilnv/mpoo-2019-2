package view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Tela extends JFrame {
	
	JRadioButton radio1, radio2;
	ButtonGroup group;
	JButton botao;
	
	
	public Tela(String titulo, String nomeRadio1, String nomeRadio2, String nomeBotao, int lar, int alt) {
		setSize(lar, alt);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		radio1 = new JRadioButton(nomeRadio1);
		radio2 = new JRadioButton(nomeRadio2);
		group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		
		botao = new JButton(nomeBotao);
		
		add(radio1);
		add(radio2);
		add(botao);
		
	}

	public JRadioButton getRadio1() {
		return radio1;
	}

	public JRadioButton getRadio2() {
		return radio2;
	}

	public JButton getBotao() {
		return botao;
	}
	
	
}
