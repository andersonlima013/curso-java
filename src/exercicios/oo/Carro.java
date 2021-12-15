package exercicios.oo;

public class Carro {

	Motor motor = new Motor();
	
	
	void acelerar() {
		motor.fatorDeInjecao += 0.2;
	}
	
	void frear() {
		motor.fatorDeInjecao -= 0.2;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
