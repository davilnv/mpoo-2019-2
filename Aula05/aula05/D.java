package aula05;

public class D extends B{
	private int atrD;

	public D(int atrA, int atrB, int atrD) {
		super(atrA, atrB);
		this.setAtrD(atrD);
	}

	public D(int atrA, int atr2a, int atrB, int atrD) {
		super(atrA, atr2a, atrB);
		this.setAtrD(atrD);
	}

	public int getAtrD() {
		return atrD;
	}

	public void setAtrD(int atrD) {
		this.atrD = atrD;
	}
	
}
