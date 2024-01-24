package fincas;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Union finca= new Union();
		
		
		boolean salir= false;
		while(!salir) {String option = 
		JOptionPane.showInputDialog(" "
			+ "1. Crear nueva finca\n "
			+ "2. Mostrar datos de una finca segun su nombre.  \n "
			+ "3. Mostrar todas las fincas.  \n "
			+ "4. Salir");
		int option2 = Integer.parseInt(option);
		
		switch (option2)
      	{
         case 1:
        	 finca.addFinca(masFinca());
                 break;
         case 2:
        	String nom = 
     		JOptionPane.showInputDialog("Escribe El nombre de la finca a buscar");
        	 finca.MostrarE(nom);		
                 break;
         case 3:
        	 finca.MostrarT();
             break;
         case 4:
        	 System.out.println("Saliendo....");
 			 salir =true;	
             break;
         default:
        	 System.out.println("Opcion no valida");
             break;
     	}}
}
	public static Finca masFinca() {
		String option = 
		JOptionPane.showInputDialog("Escribe el nombre de la finca");
		String nombreFinca = option;

		option = 
		JOptionPane.showInputDialog("Escribe el nombre de la casa");
		String nombreCasa = option;
		
		option = 
		JOptionPane.showInputDialog("Escribe el tamaño de la casa");
		int tamanioCasa = Integer.parseInt(option);
		
		option = 
		JOptionPane.showInputDialog("Escribe las plantas que tiene la casa");
		int plantasCasa = Integer.parseInt(option);
				
		option = 
		JOptionPane.showInputDialog("Escribe las habitaciones que tiene la casa");
		int habitacionesCasa = Integer.parseInt(option);
		
		option = 
		JOptionPane.showInputDialog("Escribe el tamaño de la parcela");
		int tamanioParcela = Integer.parseInt(option);
				
		option = 
		JOptionPane.showInputDialog("Escribe el tipo de parcela");
		String tipoParcela = option;

		Casa t1 = new Casa(nombreCasa , tamanioCasa,plantasCasa,habitacionesCasa);
		Parcela t2 = new Parcela(tipoParcela , tamanioParcela);
		Finca t3 = new Finca(nombreFinca ,t1,t2);

		
		
		return t3;
	}

}
