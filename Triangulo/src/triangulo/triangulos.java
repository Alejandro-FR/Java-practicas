package triangulo;
import triangulo.triangulo;
import triangulo.main;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class triangulos {
	ArrayList <triangulo> arrayTriangulos;

	public triangulos() {
		arrayTriangulos = new ArrayList <triangulo>();
	}
	public void addTriangulos(triangulo t) {
		arrayTriangulos.add(t);
	}
	public void areaMasGrande() {
		double c=0;
		for(triangulo a:arrayTriangulos) {	
			double b = a.getArea(a.getBase(),a.getAltura());
		if (b>c) {
			c =b;}
		}
		JOptionPane.showMessageDialog(null, "El area más grande es: " + c);
	}
	
	public void perimetroMasPequeno() {
		double c=50000;
		for(triangulo a:arrayTriangulos) {	
			double b = a.getPerimetro(a.getBase(),a.getAltura());
		if (b<c) {
			c =b;}
		}
		JOptionPane.showMessageDialog(null, "El perimetro más pequeño es: " + c);
	}
}
