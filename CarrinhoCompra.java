package entidades;

import java.util.ArrayList;

import entidades.Produto;


public class CarrinhoCompra {
	
	private String itensPedido;
	ArrayList<Produto>produto; 
	
	ArrayList<Produto> prod = new ArrayList<>();
	
	
	public CarrinhoCompra(String itensPedido, Produto produto) {
				
	}

	public String getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(String itensPedido) {
		this.itensPedido = itensPedido;
	}

	public ArrayList<Produto> getProduto() {
		return produto;
	}
}
