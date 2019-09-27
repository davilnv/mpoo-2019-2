package problema_login;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	
	public static boolean addUsuario(Usuario usuario) {
		if (isUsuario(usuario))
			return false;
		return usuarios.add(usuario);
	}
	
	public static boolean isUsuario(Usuario usuario) {
		for (Usuario user : BaseDados.usuarios)
			if (usuario.getLogin().equalsIgnoreCase(user.getLogin())
				&&
				usuario.getSenha().equals(user.getSenha())
				)
				return true;
		return false;
	}
	
	public static String buscarUsuario(String login) {
		for (Usuario user : BaseDados.usuarios)
			if (login.equalsIgnoreCase(user.getLogin()))
				return user.getSenha();
		return null;
	}
	
//	public static void buscarUsuario(Usuario usuario) {
//		for (Usuario user : BaseDados.usuarios)
//			if (usuario.getLogin().equalsIgnoreCase(user.getLogin()))
//				System.out.println(user.toString());
//	}
	public static ArrayList<String> buscarUsuario(Usuario usuario) {
		ArrayList<String> dados = new ArrayList<String>();
		for (Usuario user : BaseDados.usuarios)
			if (usuario.getLogin().equalsIgnoreCase(user.getLogin())) {
				dados.add(user.getLogin());
				dados.add(user.getSenha());
				// Questionamento : Por que nçao usar usuario para acessar os dados?
				//R - Porque não se tem a garantia que os dados são os da base;
			}
		return dados;
	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(ArrayList<Usuario> usuarios) {
		BaseDados.usuarios = usuarios;
	}
	
	
	
	// Como fazer para saber qual o tipo de erro ocasionado e como tratar? - 2VA
	// R - Exception
	// Correção quando estudar o uso do Exception - obs. Pesquisar spbre
	
	// Toda base de dados precisa etr métodos: 
	// Crud, Create, Reatrive, Update, delete
	
	// 1) Quais os Colections para lista?
	// 2) Quais as diferenças entre esses?
	
	// Vector<E>
	// LinkedList<E>
	// List
	// Enum<Enum<E>>
	
	// Queue <T>
	// Interator<E>
}
