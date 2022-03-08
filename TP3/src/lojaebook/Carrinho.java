package lojaebook;

import java.util.Scanner;

public class Carrinho {
	private Ebook[] ebookselecionado = new Ebook[50];
	private double precoTotal;
	private int quantidadeEbook = 0;
	private Cartao cartao;
	private Ebook[] verifica;
	
	public Carrinho(Ebook eb, double p, int q, Cartao c) {
		this.ebookselecionado[0] = eb;
		this.precoTotal = p;
		this.quantidadeEbook = q;
		cartao = c;
	}
	

	public Ebook[] getEbook() {
		return this.ebookselecionado;
	}
	
	public void setArrayEbooksSelecionados(Ebook[] e) {
		this.ebookselecionado = e;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	
	public int getQuantidadeEbook() {
		return quantidadeEbook;
	}

	public void setQuantidadeEbook(int quantidadeEbook) {
		this.quantidadeEbook = quantidadeEbook;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public Ebook[] comprar() {
		if (cartao.isValidaCartao() == true) {
			Scanner ler = new Scanner(System.in);
			System.out.println("R$" + getPrecoTotal());
			System.out.println("1. Finalizar Pedido 2.Cancelar Pedido");
			int escolha = ler.nextInt();
			switch (escolha) {
				case 1:
					System.out.println("Compra finalizada");
					verifica = ebookselecionado;
				case 2:
					System.out.println("Compra cancelada");
					break;
			}
		}
		else {
			System.out.println("Cadastre um cartao");
		}
		return verifica;
	}

}
