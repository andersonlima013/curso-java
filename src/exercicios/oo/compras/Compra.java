package exercicios.oo.compras;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	Item item;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarCompra(String nome, int quantidade, double preco) {
		itens.add(new Item(nome, quantidade, preco)); 

	}
}
