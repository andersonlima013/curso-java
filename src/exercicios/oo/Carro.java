package exercicios.oo;

public class Carro {

	Motor motor = new Motor();
	
	
	void acelerar() {
		if(motor.fatorDeInjecao < 2.8) {
			motor.fatorDeInjecao += 0.2;
		}
	}
	
	void frear() {
		if(motor.fatorDeInjecao > 0.4) {
			motor.fatorDeInjecao -= 0.2;
		}
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
