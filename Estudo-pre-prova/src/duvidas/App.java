package duvidas;

public class App {
	public static void main(String[] args) {
		A a = new A();
		a.atrA = 1;
		A.B b = a.new B(); // Forma correta para poder instanciar B
		
		
		
		Carro car = new Carro();
		//Exemplo de Classe Inter Anônima
		Carro carro = new Carro() {
			@Override
			public void mostrarVelocidade() {
				System.out.println(250);
			}
		};
		
		car.mostrarVelocidade();
		carro.mostrarVelocidade();
	}
}
