package exercicios.oo.carro;

public class Dirigir {

	public static void main(String[] args) {
		
		Carro c1 = new Carro(); // Aqui é feita a instancia da classe carro, que por sua vez também chama um método de instancia para a classe
								// motor, fazendo uma conexão bidirecional chamando apenas esse instancia de carro.
		System.out.println(c1.estaLigado());
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		// FALTOU ENCAPSULAMENTO AQUI!!
		//c1.motor.fatorDeInjecao = -50;
		
		System.out.println(c1.motor.giros());
		
		// DEVIDO A RELAÇÃO BIDIRECIONAL, COISAS ASSIM SÃO POSSÍVEIS
		System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.carro.motor.giros());
		
		
	}
}
