package lojaebook;

import java.util.Date;

public class Cartao {
	private Carrinho carrinho;
	private String formaDePagamento;
	private String numeroCartao;
	private String nomeCartao;
	private Date validadeCartao;
	private int cvv;
	private boolean validaCartao = false;
	
	public Cartao(Carrinho c, String f, String nu, String no, Date v, int cv, boolean valid) { // Construtor classe Cartao
		carrinho = c;
		formaDePagamento = f;
		numeroCartao = nu;
		nomeCartao = no;
		validadeCartao = v;
		cvv = cv;
		validaCartao = valid;
	}

	// Gets e Sets
	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeCartao() {
		return nomeCartao;
	}

	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}

	public Date getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(Date validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	public void validaCartao() { // Verifica se o numero do cartao é valido
		String numString;
		int Soma =0;
		if(numeroCartao.length() <= 15) {
			for(int i = 0; i < numeroCartao.length(); i++) {
				numString = (numeroCartao.substring(i, i+1));
				if (i % 2 == 0) {
					Soma += (Integer.parseInt(numString)*1);
				}
				else {
					if((Integer.parseInt(numString)*2)>9) {
						Soma += ((Integer.parseInt(numString)*2)-9);
					}
					else {
						Soma += ((Integer.parseInt(numString)*2));
					}
				}
			}
		}
		if(numeroCartao.length() >= 16) {
			for(int i = 0; i < numeroCartao.length(); i++) {
				numString = (numeroCartao.substring(i, i+1));
				if (i % 2 == 0) {
					Soma += (Integer.parseInt(numString)*1);
					if((Integer.parseInt(numString)*2)>9) {
						Soma += ((Integer.parseInt(numString)*2)-9);
					}
					else {
						Soma += ((Integer.parseInt(numString)*2));
					}
				}
				else {
					Soma += (Integer.parseInt(numString)*1);
				}
			}
		}
		if (Soma % 10 == 0) {
			validaCartao = true;
		}
		else {
			validaCartao = false;
		}
	}

	public boolean isValidaCartao() {
		return validaCartao;
	}

	public void setValidaCartao(boolean validaCartao) {
		this.validaCartao = validaCartao;
	}
}
