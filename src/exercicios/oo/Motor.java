package exercicios.oo;

public class Motor {

	boolean ligado = false;
	double fatorDeInjecao = 1.0;
	

	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorDeInjecao * 3000);
		}
	}
}
