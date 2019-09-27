package problema_colheita;

import java.util.Date;

public class Verificadora {
	public static boolean verificarTipoFruta(Fruta fruta) {
		if (fruta.isClimaterica())
			return true;
		return false;
	}
	
	public static boolean verificarDataColheita(Fruta fruta) {
		Date dataAtual = new Date(System.currentTimeMillis());  
	    long diferencaMilliSeconds = dataAtual.getTime() - fruta.getDataFormatada().getTime();   
	    long dias = diferencaMilliSeconds/1000/60/60/24;
		if (dias > 3) {
			return true;
		}
		return false;
	}
}
