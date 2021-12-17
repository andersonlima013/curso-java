package exercicios.oo.compras;

public class Pedido {

	public static void main(String[] args) {
		
		Compra compra = new Compra();
		
		compra.adicionarCompra("Notebook", 1, 6792.00);
		compra.adicionarCompra("Suporte para notebook", 1, 170.29);
		compra.adicionarCompra("Teclado sem fio", 1, 650.54);
		compra.adicionarCompra("Mouse sem fio", 1, 370.89);
		
		
		
		for(Item item: compra.itens) {
			System.out.print(item.quantidade + " ");
			System.out.print(item.nome + " R$");
			System.out.println(item.preco);
		}
		
		System.out.println("A soma de todos os itens é: " + compra.somaTotal());
	}
}
