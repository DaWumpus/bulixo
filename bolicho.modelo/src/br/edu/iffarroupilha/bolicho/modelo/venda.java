package br.edu.iffarroupilha.bolicho.modelo;

import java.util.Date;

public class venda {
	private int idVenda;
	private cliente cliente;
	
	private Date data;
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public cliente getcliente() {
		return cliente;
	}
	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
