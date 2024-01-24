package fincas;

public class Parcela {
	private String tipoParcela;
	private int tamanioParcela;
	public String getTipoParcela() {
		return tipoParcela;
	}
	public void setTipoParcela(String tipoParcela) {
		this.tipoParcela = tipoParcela;
	}
	public int getTamanioParcela() {
		return tamanioParcela;
	}
	public void setTamanioParcela(int tamanioParcela) {
		this.tamanioParcela = tamanioParcela;
	}
	public Parcela(String tipoParcela, int tamanioParcela) {
		this.tipoParcela = tipoParcela;
		this.tamanioParcela = tamanioParcela;
	}
}
