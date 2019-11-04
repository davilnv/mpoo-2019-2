package model;

import java.util.ArrayList;

public class BaseUsuarios {
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static boolean adicionarUser(Usuario usuario) {
		for (Usuario user : usuarios) {
			if (user.getLogin().equalsIgnoreCase(usuario.getLogin())
					|| user.getCpf().equals(usuario.getCpf())) {
				return false;
			}
		}
		return usuarios.add(usuario);
	}
	
	public static boolean verificarUsuario(String login, String senha) {
		for (Usuario user : usuarios) {
			if (user.getLogin().equalsIgnoreCase(login)
					&& user.getSenha().equals(senha))
				return true;
		}
		return false;
	}
	
	public static int pegarAcessoUsuario(String login, String senha) {
		for (Usuario user : usuarios) {
			if (user.getLogin().equalsIgnoreCase(login)
					&& user.getSenha().equals(senha)) {
				if (user instanceof Vendedor)
					return ((Vendedor) user).getCodigoAcesso();
				else if (user instanceof Gerente)
					return ((Gerente) user).getCodigoAcesso();
			}
		}
		return 0;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
}
