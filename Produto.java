package entidades;

public class Produto {
	
	protected String nome;
	protected String tamanho;
	protected double preco;
	
	public Produto(String nome, String tamanho, double preco) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getIngredientes() {
		return getIngredientes();
	}
	
	public String getTipo() {
		return getTipo();
	}
	
}
