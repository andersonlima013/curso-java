package exercicios.oo.carro;

public class Motor {

	final Carro carro; // constante
	boolean ligado = false;
	double fatorDeInjecao = 1.0;
	
	// Esse construtor � chamado no momento em que instanciamos um carro. Por isso l� na classe Carro.java temos a l�gica de:
	// motor = new Motor(this) // no caso esse this aqui se refere a classe Carro.java que est� "se passando" como argumento para ser instanciada
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
