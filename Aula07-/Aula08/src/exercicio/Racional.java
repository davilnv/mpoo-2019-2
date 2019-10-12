package exercicio;

public interface Racional {
	public void falar();
	public void andar();
	
	public default void pensar() {
		System.out.println("Eu penso");
	}
}
