import java.util.Scanner;
public class Vectores2 {

	static Scanner xd = new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
		int SumaNum[]=new int [4];
		int Suma=0;
		int Arreglo[][]=new int [4][3];
		 
		
	//Ciclo de Input	
	for (int i=0 ; i<4 ; i++) {
	
	
	   for (int j=0 ; j<3 ; j++) {
		   
	 System.out.println("("+i+","+j+") Ingrese un número: ");
	  Arreglo[i][j]= xd.nextInt();
	  SumaNum[i]=SumaNum[i]+Arreglo[i][j];
				
				   
				   System.out.print("");
	    }
			
		
	}
	int n=1;
	//Ciclo Suma
	
	for(int i=0;i<4;i++) {
		System.out.println("Suma fila "+n+":"+SumaNum[i]);
		n+=1;
	}
		   
		  
	}

}
