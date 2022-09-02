
import Banco.Cliente;
import java.util.Scanner;
public class Main {

  static Scanner sc=new Scanner(System.in);
	static Cliente cl=new Cliente();
	public static void main(String[] args) {

	
	byte opcion;
		do{
            System.out.println("---------------------");
            System.out.println(" --MENU DE OPCIONES--");
            System.out.println(" 1. Registrar Cliente");
            System.out.println(" 2. Consultar Saldo");
            System.out.println(" 3. Retirar");
            System.out.println(" 0. Salir");
            System.out.println("---------------------");
            System.out.println(" Ingrese una opcion: ");
            opcion = sc.nextByte();
            switch (opcion){
            case 1:
            	cl.registrarUsuario();
            	break;
            case 2:
          cl.consultarSaldo();
          break;
            case 3:
            	cl.retirar();
            }
		
		}while (opcion!=0);
	}
}