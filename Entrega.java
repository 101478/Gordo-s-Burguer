package entidades;

import java.util.Date;

public class Entrega {
	
	private Date data;
	private double valorTotal;
	private Pedido numeroPedido;
	private Endereco endereco;
	
	public Entrega(Date data, double valorTotal, Pedido numeroPedido, Endereco endereco) {
		this.data = data;
		this.valorTotal =  valorTotal;
		this.numeroPedido = numeroPedido;
		this.endereco = endereco;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public Pedido getNumeroPedido() {
		return numeroPedido;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
