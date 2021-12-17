package exercicios.oo.carro;

public class Carro {

	
	// FAZENDO UMA RELA��O BIDIRECIONAL, ONDE O CARRO TEM UM MOTOR E O MOTOR TEM UM CARRO.
	final Motor motor; // constante
	
	// Quando instanciamos o carro, passamos para o construtor uma instancia��o de motor, garantindo que a classe Carro instanciada l� em Dirigir
	// tenha acesso e conex�o a classe motor.
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
