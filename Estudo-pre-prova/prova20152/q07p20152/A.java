package q07p20152;

public class A {
	int atrA;
	
	public static void main(String[] args) {
//			obj1 = new A(); // Erro, objeto instanciado errado, não foi passado a referência para o tipo do objeto
//		System.out.println(obj1.atrA());
//		System.out.println(obj2.obj1.atrA); // O main não tem acesso ao objt2
	}
	
	public class B {
		A obj1;
		B obj2 = new B();
//		static A obj1; // ERRO static 
//		public static void main(String[] args) {
//			B obj2 = new B();
//			System.out.println(obj1.atrA);
//			System.out.println(obj2.obj1.);
//		}
		
	}
}

//public class C{int	atrC;} // Erro, não pode ser criado classe fora do corpo da classe do arquivo
