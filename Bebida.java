package entidades;

public class Bebida extends Produto{
	
	protected Bebida(String nome, String tamanho, double preco,  String tipo) {
		super(nome, tamanho, preco);
	}
	
	protected String tipo;
	
	public String getNome() {
		return nome;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
