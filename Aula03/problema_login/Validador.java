package problema_login;

public class Validador {
	public static boolean validarUsuario(Usuario usuario) {
		// maneira 1 - Não sei java
		/*
		for (int i=0; i<BaseDados.getUsuarios().size(); i++)
			if (usuario.getLogin().equalsIgnoreCase(BaseDados.usuarios.get(i).getLogin()) 
				&& 
				usuario.getSenha().equalsIgnoreCase(BaseDados.usuarios.get(i).getSenha())
				)
				return true;
		return false;
		*/
		
		// maneira 2 - Vou passar em MPOO
		/*
		for (Usuario user : BaseDados.usuarios)
			if (usuario.getLogin().equalsIgnoreCase(user.getLogin())
				&&
				usuario.getSenha().equalsIgnoreCase(user.getSenha())
				)
				return true;
		return false;
		*/
		
		if (BaseDados.isUsuario(usuario))
			return true;
		return false;
	}
}
