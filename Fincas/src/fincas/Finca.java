package fincas;

public class Finca {
	private String nombreFinca;
	private Casa casa;
	private Parcela parcela;
	public String getNombreFinca() {
		return nombreFinca;
	}
	public void setNombreFinca(String nombreFinca) {
		this.nombreFinca = nombreFinca;
	}

	public Casa getCasa() {
		return casa;
	}
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	public Parcela getParcela() {
		return parcela;
	}
	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}
	public Finca(String nombreFinca, Casa casa, Parcela parcela) {
		this.nombreFinca = nombreFinca;
		this.casa = casa;
		this.parcela = parcela;
	}

	
}
