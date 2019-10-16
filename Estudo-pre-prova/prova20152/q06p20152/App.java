package q06p20152;

public class App {
	public static void main(String[] args) {
		Caixa caixa = new Funcionario();
		Gerente gerente = new Funcionario();
		SuperFuncionario sf = new Funcionario();
		Produto p = new Produto();
		
		//a)
		System.out.println(caixa instanceof Funcionario); // true
		// R - Todos comparados com funcionario retornarão true
		// pois estão sendo instanciados a partir da classe 
		// Funcionario que implementa todas as 3 interfaces;
		
		//b)
		// caixa.darDesconto(p, 0.1);
		// R - Não, pois caixa mesmo sendo instanciado a partir da classe Funcionario 
		// que implementa as 3 interfaces, o tipo do objeto, afirma que ele é do tipo caixa
		// que não tem acesso ao método darDesconto(); para que tenha acesso, a referência ao tipo
		// deveria ser SuperFuncionario;
		
		System.out.println(caixa instanceof SuperFuncionario); // true
		//c)
		// R - Para que caixa não seja do tipo SuperFucionario, deve-se remover a implementação
		// de SuperFuncionario na declaração da classe Funcionario;
	}
}
