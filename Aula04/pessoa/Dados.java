package pessoa;

import java.util.ArrayList;

public class Dados {
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public static boolean addPessoa(Pessoa pessoa) {
		return pessoas.add(pessoa);
	}
	
	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		Dados.pessoas = pessoas;
	}
	
}
