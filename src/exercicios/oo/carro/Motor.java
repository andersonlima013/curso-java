package exercicios.oo.carro;

public class Motor {

	final Carro carro; // constante
	boolean ligado = false;
	double fatorDeInjecao = 1.0;
	
	
	Motor(Carro carro){
		this.carro = carro;
	}

	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorDeInjecao * 3000);
		}
	}
}
