package lojaebook;

import java.util.Date;


public class Ebook {
	private String idEbook;
	private String titulo;
	private String genero;
	private String nomeAutor;
	private String descricao;
	private Date anoDePublicacao;
	private String idioma;
	private double preco;
	private Editora editora;

	public Ebook() {
		super();
	}
	
	public Ebook(String id, String t, String g, String n, String de, Date da, String i, double p, Editora e) {
		this.idEbook = id;
		this.titulo = t;
		this.genero = g; 
		this.nomeAutor = n;
		this.descricao = de;
		this.anoDePublicacao = da;
		this.idioma = i;
		this.preco = p;
		this.editora = e;
	}
	
	public Ebook(String idEbookNovo, String titulo2, String nomeAutor2, String genero2, String descricao2,
			String idioma2, double preco2, Date anoPublicacao, Editora editora2) {
		
	}

	@Override
	public String toString() {
		return "Ebook: " + this.titulo + 
				"\nAutor: " + this.genero +
				"\nCategoria: " + this.nomeAutor + 
				"\nSinopse: " + this.descricao +
				"\nIdioma: " + this.idioma + 
				"\nPreco: " + this.preco +
				"\nAno de publicacao: " + this.anoDePublicacao + 
				"\nEditora: " + this.editora.nome; 
	}

	public String getIdEbook() {
		return idEbook;
	}

	public void setIdEbook(String idEbook) {
		this.idEbook = idEbook;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Date anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
}
