package entidades;

import entidades.CarrinhoCompra;

public class Pedido {
	
	private int numeroPedido;
	double valorTotal;
	private CarrinhoCompra itensPedido;
	
	public Pedido(int numeroPedido, double valorTotal, CarrinhoCompra itensPedido) {
		this.numeroPedido = numeroPedido;
		this.valorTotal = valorTotal;
		this.itensPedido = itensPedido;
	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public CarrinhoCompra getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(CarrinhoCompra itensPedido) {
		this.itensPedido = itensPedido;
	}
}
