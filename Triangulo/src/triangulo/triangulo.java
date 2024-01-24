package triangulo;

import java.lang.Math;

public class triangulo {
private int base;
private int altura;


public triangulo(int base, int altura) {
	this.base = base;
	this.altura = altura;
}

public int getBase() {
	return base;
}

public void setBase(int base) {
	this.base = base;
}

public int getAltura() {
	return altura;
}

public void setAltura(int altura) {
	this.altura = altura;
}

public double getPerimetro(int base, int altura) {
	double perimetro = 2*(getLado(base,altura))+base;
	return perimetro;
	
}

public double getLado(int base, int altura) {
	double lado = Math.pow(Math.pow((base/2), 2)+Math. pow((altura/2), 2),0.5);
	return lado;
}

public double getArea(int base, int altura) {
var a = (base + altura)/2;
	return a;	
}

}