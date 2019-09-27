package problema_login;

import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		BaseDados.addUsuario(new Usuario("jack", "1234"));
		BaseDados.addUsuario(new Usuario("maria", "mariaIluminada"));
		BaseDados.addUsuario(new Usuario("davi", "Davi"));
		
//		System.out.println(BaseDados.getUsuarios().get(0).getLogin());
//		System.out.println(BaseDados.getUsuarios().get(0).getSenha());
		
		Usuario usuario = new Usuario("jack", "1234");
		
		if (Validador.validarUsuario(usuario))
			JOptionPane.showMessageDialog(null, "Bem vindo!");
		else
			JOptionPane.showMessageDialog(null, "Login/senha errado!");
		
		BaseDados.addUsuario(new Usuario("papai", "1234"));
		BaseDados.addUsuario(new Usuario("mamae", "1234"));
		BaseDados.addUsuario(new Usuario("titia", "1234"));
		
		Usuario usuario3 = new Usuario("titia", "");
		System.out.println(BaseDados.buscarUsuario(usuario3));
		System.out.println(BaseDados.buscarUsuario(usuario3).get(0));
		System.out.println(BaseDados.buscarUsuario(usuario3).get(1));
		
		for (String conteudo : BaseDados.buscarUsuario(usuario3)) {
			System.out.println(conteudo);
		}
		// BaseDados.getUsuarios().set(index, element);
		// BaseDados.getUsuarios().remove(index);
		
		
		// Parse
		String a = "1";
		String b = "2";
		int c;
		c = Integer.parseInt(a) + Integer.parseInt(b);
		System.out.println(c);
		
		// pesquisar sobre - (int), (float), (double)...
		// Questionamento: 
		// - Ilustrar a remocação por indece e objeto
		// - Ilustrar o update
	}
}
