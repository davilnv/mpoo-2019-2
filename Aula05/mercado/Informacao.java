package mercado;

public class Informacao {
	private static double salarioMinimo = 1000.0;

	public static double getSalarioMinimo() {
		return salarioMinimo;
	}

	public static void setSalarioMinimo(double salarioMinimo) {
		Informacao.salarioMinimo = salarioMinimo;
	}
}
