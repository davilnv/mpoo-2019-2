package aula05;

public class App {
	public static void main(String[] args) {
		A objA = new A(); //Avo
		B objB = new B(1, 2); //Pai
		B objB2 = new B(1, 2, 3);
		C objC = new C(1, 2, 3); //Tio
		D objD = new D(1, 2, 3, 4); //Filho
		
		System.out.println(objB instanceof A);
		System.out.println(objB.getAtrA());
		// Mas por que não consegue ver atr2A? Porque não tem get definido!
		System.out.println(objD.getAtrA());
		// Idem para objD. Não herda getAtr2A, por não estar definido!
	}
}
