package triangulo;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import triangulo.triangulos;

public class main {
	public static void main(String[] args) {
		triangulos triangulos= new triangulos();
		
				
				boolean salir= false;
				while(!salir) {String option = 
				JOptionPane.showInputDialog(" "
					+ "1. Añadir triangulo \n "
					+ "2. Calcular e imprimir el triángulo con el área más grande.  \n "
					+ "3. Calcular e imprimir el triángulo con el perímetro más pequeño.  \n "
					+ "4. Imprimir el área y el perímetro de un triángulo en concreto. \n "
					+ "5. Imprimir la altura, la base, el área y el perímetro de todos los triángulos. \n "
					+ "6. Salir");
				int option2 = Integer.parseInt(option);
				switch (option2)
		      	{
		         case 1:
		        	 triangulos.addTriangulos(masTriangulo());
		                 break;
		         case 2:
		     			 triangulos.areaMasGrande();		
		                 break;
		         case 3:
		        	 triangulos.perimetroMasPequeno();
	                 break;
		         case 4:
	     			 System.out.println("Opcion en mantenimiento");		
	                 break;
		         case 5:
	     			 System.out.println("Opcion en mantenimiento");		
	                 break;
		         case 6:
		        	 System.out.println("Saliendo chipi chipi chapa chapa dubi dubi daba daba");
	     			 salir =true;	
	                 break;
	             default:
	            	 System.out.println("Opcion no valida");
	                 break;
		     	}}
	}
	public static triangulo masTriangulo() {
		String option = 
				JOptionPane.showInputDialog("Escribe la base");
		int base = Integer.parseInt(option);
		
		option = 
				JOptionPane.showInputDialog("Escribe la altura");
		int altura = Integer.parseInt(option);
		
		triangulo t1 = new triangulo(base , altura);
		
		JOptionPane.showMessageDialog(null, "El perimetro es:  "+ t1.getPerimetro(base, altura) + "\n El area es: "+t1.getArea(base, altura));

		return t1;
	}
}
