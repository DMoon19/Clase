import java.util.Scanner;
public class NotaPOO {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nombres
		//ID
		//Direccion
		//Nota
		//
		  String nd[][]=new String [5][2];
		  int id[]=new int[5];
		  int nota[]=new int[5];
		  int opcion=0;
		  
		do {
			System.out.println(" MENU DE OPCIONES ");
            System.out.println(" 1. Ingresar datos Estudiante #1"); //ID, NOMBRE, DIRECCION	
            System.out.println(" 2. Ingresar nota Estudiante #2"); //NOTA
            System.out.println(" 3. Ingresar id Estudiante y mostrar su nota #3");
            System.out.println(" 4. ingresar id y cambiar direccion #4");
            System.out.println(" 0. Salir #0");
            System.out.println(" ----->Ingrese una opcion: ");
            opcion = sc.nextInt();         
	            switch (opcion){
	                case 1:
	                
	                	for (int i=0 ; i<5 ; i++) {
	   	            	 
	                		 
	             	       for (int j=0 ; j<2 ; j++) {
	             	    	
	             	    	   
	             	    	  System.out.println(i+","+j+"Ingrese Nombre del Estudiante");
	             	    		nd[i][j]= sc.next();  
	             	    		  j++;
		                	     System.out.println(i+","+j+"Ingrese direccion del Estudiante");
		                	     nd[i][j]= sc.next();   
		           
		                	     
	             	       }  
	             	      System.out.println("Ingrese id del Estudiante");
             	    	  id[i]= sc.nextInt(); 
	             	    }
	                	
	                	break;
	                case 2:
	                	
	                	
	                	
	                	for (int i=0 ; i<5 ; i++) {
	   	            	 
	                		System.out.println("Ingrese nota del Estudiante");
	                		nota[i]= sc.nextInt(); 
	                	}
	                	break;
	                case 3:
	                	
	                	
	                	
	                	for (int i=0 ; i<5 ; i++) {
	                	System.out.println("Ingrese id del Estudiante");
	                	id[i]= sc.nextInt(); 
	                	 for (int j=0 ; j<2 ; j++) {
	                
	                		
	                	 }
	            		 System.out.println(nota[i]);
	                   }
	                	break;
	                case 4:
	                	
	                	
	                	for (int i=0 ; i<5 ; i++) {
		                	System.out.println("Ingrese id del Estudiante");
		                	id[i]= sc.nextInt(); 
		                	 for (int j=2 ; j<2 ; j++) {
		                		 System.out.println("Cambiar direccion del Estudiante");
		                		 nd[i][j]= sc.next();  
		                	 }
		                   }
	                	break;
	    }
	    
	    
		
	}  while(opcion != 0);

		
		
}
}
