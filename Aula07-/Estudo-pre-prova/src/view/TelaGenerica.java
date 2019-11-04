package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public abstract class TelaGenerica extends JFrame{

	public TelaGenerica(String titulo) {
		super(titulo);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setLayout(null);
	}
}
