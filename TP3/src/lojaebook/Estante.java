package lojaebook;

public class Estante {
	private Carrinho carrinho;
	private String categoria;
	
	public Estante(Carrinho car, String cat) {
		carrinho = car;
		categoria = cat;
	}
	
	public void itensComprados() {
		carrinho.comprar();
	}

	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
