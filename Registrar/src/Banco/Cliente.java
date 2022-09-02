package Banco;
import java.util.Scanner;
public class Cliente {
	static Scanner sc =new Scanner(System.in);	
	public int cc, saldoInicial;
	public int saldoFinal=0;
	public String nombre, direccion1, direccion2, num, email;
	
	public void registrarUsuario(){
			  System.out.println("Ingrese su nombre:");
			  nombre=sc.next();  
			
			  System.out.println("Ingrese su cc:");
			  cc= sc.nextInt(); 
		
			  System.out.println("Ingrese su direccion(Calle/Av):");
			  direccion1= sc.next(); 

			  System.out.println("Ingrese su direccion(Num):");
			  num= sc.next(); 

			  System.out.println("Ingrese su direccion(#):");
			  direccion2= sc.next(); 
	
			  System.out.println("Ingrese su email:");
			  email= sc.next(); 
			
			  System.out.println("Ingrese su dinero:");
			  saldoInicial= sc.nextInt();  
		 
	}
	public void consultarSaldo(){
		  System.out.println("Su saldo es de: "+saldoInicial);
		  System.out.println("Nombre: "+nombre+"    CC: "+cc+
		  "\nDireccion: "+direccion1+" "+num+" #"+direccion2+"\nEmail: "+email);
		
	}
	public void retirar(){
		System.out.println("Cuanto dinero desea retirar?");
		saldoFinal=sc.nextInt();
	
		
		if(saldoFinal<=saldoInicial) {		
			saldoFinal=saldoInicial-saldoFinal;
			System.out.println("Su balance es de: "+saldoFinal);
			saldoInicial=saldoFinal;
			
		}
		else if(saldoFinal>saldoInicial) {		
			System.out.println("Usted no tiene saldo disponible");
		
		}		
	}
}