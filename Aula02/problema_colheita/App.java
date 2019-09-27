package problema_colheita;

import java.text.ParseException;

public class App {
	public static void main(String[] args) throws ParseException {
		//Verificadora verificadora = new Verificadora();
		Fruta fruta = new Fruta("Goiaba", "15/08/2019");
		//System.out.println(verificadora.verificarDataColheita(fruta));
		System.out.println(Verificadora.verificarDataColheita(fruta)); // Um método Static não precisa da criação de um objeto
		System.out.println(Aviso.emitirAviso(fruta));
		//Fruta fruta1 = new Fruta("Banana", 5);
		//Fruta fruta2 = new Fruta("Coco", 5);
	}
}
