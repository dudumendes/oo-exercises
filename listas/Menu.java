package listas;

public class Menu {
	public String titulo;
	public ItemDeMenu[] itens;
	public int totalDeItens;
	
	
	public Menu(String titulo, int quantidadeDeItens) {
		this.titulo = titulo;
		this.itens = new ItemDeMenu[quantidadeDeItens];
	}
	
	public void adicionarItem() {
		
	}
	
}
