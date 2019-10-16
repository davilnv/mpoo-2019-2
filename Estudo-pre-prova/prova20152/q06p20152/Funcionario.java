package q06p20152;

public class Funcionario implements Caixa, Gerente, SuperFuncionario{

	@Override
	public void darDesconto(Produto produto, double desconto) {}

	@Override
	public void realizarVenda(Produto produto) {}

}
