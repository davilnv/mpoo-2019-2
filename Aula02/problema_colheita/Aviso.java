package problema_colheita;

public class Aviso {
	public static String emitirAviso(Fruta fruta) {
		if (Verificadora.verificarTipoFruta(fruta)) {
			if (Verificadora.verificarDataColheita(fruta)) {
				return "A fruta precisa ser vendida";
			}
		}
		return null;
		//return "A fruta precisa ser vendida";
	}
}
