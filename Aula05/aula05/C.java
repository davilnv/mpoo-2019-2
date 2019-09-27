package aula05;

public class C extends A{
	private int atrC;

	public C(int atrC) {
		super();
		this.setAtrC(atrC);
	}

	public C(int atrA, int atrC) {
		super(atrA);
		this.setAtrC(atrC);
	}

	public C(int atrA, int atr2a, int atrC) {
		super(atrA, atr2a);
		this.setAtrC(atrC);
	}

	public int getAtrC() {
		return atrC;
	}

	public void setAtrC(int atrC) {
		this.atrC = atrC;
	}

}
