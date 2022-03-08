package lojaebook;


public class Editora extends Pessoa{
	private long cnpj;
	
	public Editora(long c, Ebook e) {
		cnpj = c;
	}
	
	public Editora(String i, String n, String e, Telefone t, String s, long c) {
		id = i;
		nome = n;
		email = e;
		numeroTelefone = t;
		senha = s;
		cnpj = c;
	}
	
	public Editora(String i, String n, String e, String s, long c, Telefone t) {
		id = i;
		nome = n;
		email = e;
		senha = s;
		cnpj = c;
		numeroTelefone = t;
	}

	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

}
