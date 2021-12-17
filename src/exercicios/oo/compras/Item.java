package exercicios.oo.compras;

public class Item {
	
	String nome;
	int quantidade;
	double preco;
	
	Compra compra; // Esse � o atributo compra na classe Item, que garante a conex�o com a classe compra.
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
