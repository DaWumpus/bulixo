package br.edu.iffarroupilha.bolicho.modelo;

public class itemvenda {

	public int getIdItemVenda() {
		return idItemVenda;
	}
	public void setIdItemVenda(int idItemVenda) {
		this.idItemVenda = idItemVenda;
	}
	public venda getVenda() {
		return venda;
	}
	public void setVenda(venda venda) {
		this.venda = venda;
	}
	public produto getProduto() {
		return produto;
	}
	public void setProduto(produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPrecounitario() {
		return precounitario;
	}
	public void setPrecounitario(double precounitario) {
		this.precounitario = precounitario;
	}
	private int idItemVenda;
	private venda venda;
	private produto produto;
	private int quantidade;
	private double precounitario;
	

}
