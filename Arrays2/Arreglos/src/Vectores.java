
public class Vectores {

	   public static void main(String[] args) {
	        
		   int mayor=23;
           int menor=23;
	       int arreglo1[] = {23, 56, 7, 78, 45, 1, 35, 17, 69, 83};
	         
	        for (int i=0 ; i<arreglo1.length ; i++) {
	      
	        	 if(mayor<arreglo1[i]){
	               	 mayor=arreglo1[i];
	                }
	        	 else if(menor>arreglo1[i]){
	             	 menor=arreglo1[i];
	              }
	        }       
             System.out.println("El mayor es {"+mayor+"}y el menor es {"+menor+"}");
	        }
	   }

