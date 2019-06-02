package entidades;


public class Lanche extends Produto {
	
	protected Lanche(String nome, String tamanho, double preco, String ingredientes) {
		super(nome, tamanho, preco);
	}
	
	protected String ingredientes;
	
	public String getNome() {
		return nome;
	}

	public String getTamanho() {
		return tamanho;
	}
	
	public double getPreco() {
		return preco;
	}

	public String getIngredientes() {
		return ingredientes;
	}
	
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
		

}
