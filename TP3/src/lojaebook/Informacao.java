package lojaebook;

import java.util.Calendar;
import java.util.Date;

public class Informacao {
	private Leitor[] leitor = new Leitor[50];
	private int qtdLeitores = 0;
	private Editora[] editora = new Editora[50];
	private int qtdEditoras = 0;
	private static Ebook[] ebook = new Ebook[50];
	private int qtdEbooks = 0;
	private Carrinho[] carrinho = new Carrinho[50];
	private int qtdCarrinho = 0;
	private Estante[] estante = new Estante[50];
	private int qtdEstantes = 0;
	private Telefone[] telefone = new Telefone[50];
	private int qtdTelefones = 0;
	
	public void fillWithSomeData() { // Dados aleatorios para abastecer o programa
		for(int i = 0; i < 5; i++) {
			Date d = Calendar.getInstance().getTime();
			leitor[i] = new Leitor("idLeitor"+i ,"Leitor"+i, "leitor"+1+"@email.com", "senhaLeitor"+1, (i+1)*112233445, telefone[i]);
			editora[i] = new Editora("idEditora"+i ,"Editora"+i, "Editora"+1+"@email.com", "senhaEditora"+1, (i+1)*1111111111111l, telefone[i]);
			ebook[i] = new Ebook("idEbook"+i, "Titulo"+i, "genero"+i, "NomeAutor"+i, "Descricao"+i, d, "idioma"+i, i*(1.23), editora[i]);
			telefone[i] = new Telefone((i+1)*100, (i+1)*1000000);
		}
		
		qtdLeitores = 5;
		qtdEditoras = 5;
		qtdEbooks = 5;
		qtdTelefones = 5;
	}
	
	// Gets e Sets
	public Leitor[] getLeitor() {
		return leitor;
	}
	
	public void setLeitor(Leitor[] leitor) {
		this.leitor = leitor;
	}
	
	public void inserirEditarLeitor(Leitor l, int pos) {
		this.leitor[pos] = l;
		if(pos == qtdLeitores) qtdLeitores++;
	}
	
	public int getQtdLeitores() {
		return qtdLeitores;
	}
	public void setQtdLeitores(int qtdLeitores) {
		this.qtdLeitores = qtdLeitores;
	}

	public Editora[] getEditora() {
		return editora;
	}

	public void setEditora(Editora[] editora) {
		this.editora = editora;
	}
	
	public void inserirEditarEditora(Editora ed, int pos) {
		this.editora[pos] = ed;
		if(pos == qtdEditoras) qtdEditoras++;
	}

	public int getQtdEditoras() {
		return qtdEditoras;
	}

	public void setQtdEditoras(int qtdEditoras) {
		this.qtdEditoras = qtdEditoras;
	}

	public static Ebook[] getEbook() {
		return ebook;
	}

	public void setEbook(Ebook[] ebook) {
		Informacao.ebook = ebook;
	}
	
	public void inserirEditarEbook(Ebook eb, int pos) {
		Informacao.ebook[pos] = eb;
		if(pos == qtdEbooks) qtdEbooks++;
	}

	public int getQtdEbooks() {
		return qtdEbooks;
	}

	public void setQtdEbooks(int qtdEbooks) {
		this.qtdEbooks = qtdEbooks;
	}
	
	public Telefone[] getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}
	public int getQtdTelefones() {
		return qtdTelefones;
	}
	public void setQtdTelefones(int qtdTelefones) {
		this.qtdTelefones = qtdTelefones;
	}

	public Carrinho[] getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho[] carrinho) {
		this.carrinho = carrinho;
	}

	public int getQtdCarrinho() {
		return qtdCarrinho;
	}

	public void setQtdCarrinho(int qtdCarrinho) {
		this.qtdCarrinho = qtdCarrinho;
	}

	public Estante[] getEstante() {
		return estante;
	}

	public void setEstante(Estante[] estante) {
		this.estante = estante;
	}

	public int getQtdEstantes() {
		return qtdEstantes;
	}

	public void setQtdEstantes(int qtdEstantes) {
		this.qtdEstantes = qtdEstantes;
	}
	
}
