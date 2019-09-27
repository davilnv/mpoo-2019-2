package aula05;

public class A {
	private int atrA;
	private int atr2A;
	
	//Se ouver a necessidade da existencia de um construtor "default" deve-se declara-lo;
	//Para quando ouver pelo menos um não-default;
	
	public A() {}

	public A(int atrA) {
		this.atrA = atrA;
	}
	
	public A(int atrA, int atr2a) {
		super();
		this.atrA = atrA;
		this.setAtr2A(atr2a);
	}
	
	private void metodo() {
		System.out.println("Método de A");
	}
	// Como fazer para não permitir que um classe vejam método?
	// - Sobrescrita de método;
	//Como fazer para obrigar uma subclasse definir método?
	// - Definir método abstrato;
	
	public void metodo2() {
		System.out.println("Método de A");
	}
	
//	public abstract void metodo3() {
//		System.out.println("Método de A");
//	}
	
	public int getAtrA() {
		return atrA;
	}

	public void setAtrA(int atrA) {
		this.atrA = atrA;
	}

	public int getAtr2A() {
		return atr2A;
	}

	public void setAtr2A(int atr2a) {
		atr2A = atr2a;
	}
}
