package exercicio;

public class App {
	public static void main(String[] args) {
		SerHumano humano = new SerHumano();
		
		System.out.println(humano instanceof Animal);
		System.out.println(humano instanceof Racional);
		System.out.println(humano instanceof Irracional);
	}
}
