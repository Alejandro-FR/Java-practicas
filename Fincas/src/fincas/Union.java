package fincas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Union {
	ArrayList <Finca> arrayFincas;

	public Union() {
		arrayFincas = new ArrayList <Finca>();
	}
	public void addFinca(Finca t) {
		arrayFincas.add(t);
	}
	
	public void MostrarE(String i) {
		for(Finca a:arrayFincas) {	
			if(a.getNombreFinca().equals(i)) {
			JOptionPane.showMessageDialog(null, 
			"Nombre finca: " + a.getNombreFinca()+" \n "
			+ "Tamaño de finca:"+(a.getCasa().getTamanioCasa()+a.getParcela().getTamanioParcela()+" \n "
			+ "Nombre casa:"+a.getCasa().getNombreCasa()+" \n "
			+ "Habitaciones"+a.getCasa().getHabitacionesCasa()+" \n "
			+ "Tipo parcela:"+a.getParcela().getTipoParcela()+" \n "));
			}else {JOptionPane.showMessageDialog(null, "No hay una finca con ese nombre");}
			}
	}
	public void MostrarT() {
		for(Finca a:arrayFincas) {	
			JOptionPane.showMessageDialog(null, 
			"Nombre finca: " + a.getNombreFinca()+" \n "
			+ "Tamaño de finca:"+(a.getCasa().getTamanioCasa()+a.getParcela().getTamanioParcela()+" \n "
			+ "Nombre casa:"+a.getCasa().getNombreCasa()+" \n "
			+ "Habitaciones"+a.getCasa().getHabitacionesCasa()+" \n "
			+ "Tipo parcela:"+a.getParcela().getTipoParcela()+" \n "));
		}
		
	}
}
