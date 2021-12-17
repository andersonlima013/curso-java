package exercicios.oo.carro;

public class Motor {

	final Carro carro; // constante
	boolean ligado = false;
	double fatorDeInjecao = 1.0;
	
	// Aqui chamamos o método de construção do motor, passando como argumento um Carro. Por isso lá na classe Carro temos a lógica de:
	// motor = new Motor(this) // no caso esse this aqui se refere a classe Carro que está "se passando" como argumento para ser instanciada
	// aqui na classe motor.
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
