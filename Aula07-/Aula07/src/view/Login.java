package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{

	private JLabel lblLogin, lblSenha;
	private JTextField tfLogin;
	private JPasswordField tfSenha;
	private JButton btnComfirmar, btnSair;

	public Login(String titulo, int largura, int altura) {
		super(titulo);
		setSize(largura, altura);
		setBackground(Color.BLUE);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		tfLogin = new JTextField(10);
		tfSenha = new JPasswordField(10);

		lblLogin = new JLabel("Login");
		lblSenha = new JLabel("Senha");

		btnComfirmar = new JButton("Entrar");
		btnSair = new JButton("Sair");

		add(lblLogin);
		add(tfLogin);
		add(lblSenha);
		add(tfSenha);
		add(btnComfirmar);
		add(btnSair);

		setVisible(true);
	}

	public JTextField getTfLogin() {
		return tfLogin;
	}

	public JPasswordField getTfSenha() {
		return tfSenha;
	}

	public JButton getBtnComfirmar() {
		return btnComfirmar;
	}

	public JButton getBtnSair() {
		return btnSair;
	}

}
