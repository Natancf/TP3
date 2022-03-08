package lojaebook;

public class Leitor extends Pessoa{
	private Estante estante;
	private Carrinho carrinho;
	private long cpf;
	
	public Leitor() {
		super();
	}
	
	public Leitor(String i, String n, String em, String s, Estante es, Carrinho ca, long cp) {
		id = i;
		nome = n;
		email = em;
		senha = s;
		estante = es;
		carrinho = ca;
		cpf = cp;
	}

	public Leitor(String i, String n, String em, String s, long cp, Telefone telefone) {
		id = i;
		nome = n;
		email = em;
		senha = s;
		cpf = cp;
	}

	public Estante getEstante() {
		return estante;
	}
	public void setEstante(Estante estante) {
		this.estante = estante;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	
}
