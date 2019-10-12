package model;

import java.util.ArrayList;

public class BaseDados {
	static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public static boolean isUsuario(Usuario usuario) {
		for (Usuario user : usuarios) {
			if (user.getLogin().equalsIgnoreCase(usuario.getLogin())
					&& user.getSenha().equals(usuario.getSenha()))
				return true;
		}
		return false;
	}

	public static boolean addUsuario(Usuario usuario) {
		return usuarios.add(usuario);
	}

}
