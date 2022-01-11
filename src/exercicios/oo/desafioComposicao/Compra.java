package exercicios.oo.desafioComposicao;

import java.util.ArrayList;
import java.util.List;

public class Compra{
	
	
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto produto, int quantidade) {
		this.itens.add(new Item(produto, quantidade));
	}
	
	
}