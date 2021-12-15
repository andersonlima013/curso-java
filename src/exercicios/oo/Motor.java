package exercicios.oo;

public class Motor {
	
	double fatorDeInjecao = 1.0;
	
	int giros() {
		return (int) Math.round(fatorDeInjecao * 3000);
	}
	
}
