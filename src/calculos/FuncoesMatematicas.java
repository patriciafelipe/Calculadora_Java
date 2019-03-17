package calculos;

public class FuncoesMatematicas {

	public double soma(double valor1, double valor2) {
		double i = valor1 + valor2;
		return i;
	}
	public double menos(double valora, double valorb) {
		double b = valora - valorb;
		return b;
	}
	public double mul(double valorX, double valorY) {
		double u = valorX * valorY;
		return u;
	}
	public double barra(double valorV, double valorT) {
		double q = valorV / valorT;
		return q;
	}
	public double porc(double valorS, double valorD) {
		double r = valorD/100;
		return r*valorS;
	}
	public double frac(double l) {
		double totfrac = 1 / l;
		return totfrac;
	}
	
	
}