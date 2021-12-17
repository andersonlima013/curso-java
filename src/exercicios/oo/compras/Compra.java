package exercicios.oo.compras;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	Item item; // A classe compra tem um Item, que cria uma conex�o com a classe Item 
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarCompra(String nome, int quantidade, double preco) {
		adicionarItem(new Item(nome, quantidade, preco)); 
	}
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this; // Essa atribui��o manda para a instancia de Compra na classe Item, o valor dessa compra que est� sendo feita no momento
							// fazendo com que a cada item adicionado, possamos ter uma conex�o com compra.
	}
	
	double somaTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += (item.preco * item.quantidade);
		}
		
		return total;
	}
}
