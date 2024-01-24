package fincas;

public class Casa {
	 String nombreCasa;
	 int tamanioCasa;
	 int plantasCasa;
	 int habitacionesCasa;
	public String getNombreCasa() {
		return nombreCasa;
	}
	public void setNombreCasa(String nombreCasa) {
		this.nombreCasa = nombreCasa;
	}
	public int getTamanioCasa() {
		return tamanioCasa;
	}
	public void setTamanioCasa(int tamanioCasa) {
		this.tamanioCasa = tamanioCasa;
	}
	public int getPlantasCasa() {
		return plantasCasa;
	}
	public void setPlantasCasa(int plantasCasa) {
		this.plantasCasa = plantasCasa;
	}
	public int getHabitacionesCasa() {
		return habitacionesCasa;
	}
	public void setHabitacionesCasa(int habitacionesCasa) {
		this.habitacionesCasa = habitacionesCasa;
	}
	public Casa(String nombreCasa, int tamanioCasa, int plantasCasa, int habitacionesCasa) {
		this.nombreCasa = nombreCasa;
		this.tamanioCasa = tamanioCasa;
		this.plantasCasa = plantasCasa;
		this.habitacionesCasa = habitacionesCasa;
	}

	
}
