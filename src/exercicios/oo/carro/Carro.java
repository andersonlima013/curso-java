package exercicios.oo.carro;

public class Carro {

	
	// FAZENDO UMA RELAÇÃO BIDIRECIONAL, ONDE O CARRO TEM UM MOTOR E O MOTOR TEM UM CARRO.
	final Motor motor; // constante
	Carro(){
		this.motor = new Motor(this);
	}
	
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
