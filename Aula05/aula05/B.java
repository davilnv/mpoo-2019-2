package aula05;

public class B extends A{
	private int atrB;
	
	//Se houver 1 default - nãp há obrigatoriedade do super();
	// se não houver default e existir um nao-default deve-se haver uso de super
	
	// erro de semantica: havendo construtores na superclasse, a subclasse prevê todos os construtores definidos na superclasse.
	// sintaxe: apesar de existir vários não-default só precisa definir pelo menos um;

	public B(int atrA, int atrB) {
		super(atrA);
		this.atrB = atrB;
	}
	
	public B(int atrA, int atr2A, int atrB) {
		super(atrA, atr2A);
		this.atrB = atrB;
	}

	public int getAtrB() {
		return atrB;
	}

	public void setAtrB(int atrB) {
		this.atrB = atrB;
	}
	
}
