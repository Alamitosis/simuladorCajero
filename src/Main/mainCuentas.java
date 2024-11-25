package Main;

import java.util.Scanner;
import cuentas.Cuentas;
import implementCuentas.Implementacion;

public class mainCuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idCliente;
		long numCuenta;
		String nombreCliente;
		double monto;
		
		Implementacion imp = new Implementacion();
		Scanner lectura= new Scanner(System.in);
		int menu=0,indice=0;
		
		do {
			System.out.println("BIENVENIDO AL MENU BANCOMER");
			System.out.println("Porfavor ingrese segun el numeral la operacion que desea realizar");
			System.out.println("[1] DAR DE ALTA TU CUENTA BBVA");
			System.out.println("[2] CONSULTAR TU SALDO");
			System.out.println("[3] DEPOSITO EN EFECTIVO");
			System.out.println("[4] RETIRO EN EFECTIVO");
			System.out.println("[5] SALIR");
			
			lectura= new Scanner(System.in);
			menu=lectura.nextInt();
			
			switch(menu) {
			case 1:
				try {
					System.out.println("Porfavor, ingrese el numero de cuenta que desea");
					lectura= new Scanner(System.in);
					numCuenta= lectura.nextLong();
					
					System.out.println("Porfavor, ingrese su nombre");
					lectura= new Scanner(System.in);
					nombreCliente= lectura.nextLine();
					
					System.out.println("Porfavor, ingrese el monto con el que desea aperturar su cuenta");
					lectura= new Scanner(System.in);
					String input= lectura.nextLine();
					if(input.isEmpty()) {
						monto=0L;
					}
					else {
						try {
						monto=Long.parseLong(input);
						}catch (Exception e) {
							System.out.println("El monto debe ser un numero, se le asignará 0");
							monto=0;
						}
					}
					
					Cuentas cuenta= new Cuentas(1,numCuenta,nombreCliente,monto);
					System.out.println(imp.alta(cuenta));
					
					System.out.println(imp.mostrar());
					
				}catch(Exception e) {
					System.out.println("Error al registrar la cuenta");
				}
				break;
			case 2:
				try {
					System.out.println("Ahora ingrese su numero de cuenta");
					lectura= new Scanner(System.in);
					numCuenta= lectura.nextLong();
					
					double dineroPropio= imp.consultaSaldo(imp.buscar(numCuenta));
					System.out.print("Tu monto total es de: $");
					System.out.println(dineroPropio);
				} catch(Exception e) {
					System.out.println("Error al realizar operacion");
				}
				break;
			case 3:
				try {
				System.out.println("Ahora ingrese su numero de cuenta");
				lectura= new Scanner(System.in);
				numCuenta= lectura.nextLong();
				
				System.out.println("Ahora ingrese el monto que desea depositar");
				lectura= new Scanner(System.in);
				double montoDeposito= lectura.nextDouble();
				
				imp.deposito(imp.buscar(numCuenta), montoDeposito);
				
				double dineroPropio= imp.consultaSaldo(imp.buscar(numCuenta));
				System.out.print("Tu monto total es de: $");
				System.out.println(dineroPropio);
	
				} catch(Exception e) {
					System.out.println("Error al realizar el deposito");
				}

				break;
			case 4:
				try {
				System.out.println("Ahora ingrese su numero de cuenta");
				lectura= new Scanner(System.in);
				numCuenta= lectura.nextLong();
				
				System.out.println("Ahora ingrese el monto que desea retirar");
				lectura= new Scanner(System.in);
				double montoRetiro= lectura.nextDouble();
				
				imp.retiro(imp.buscar(numCuenta), montoRetiro);
				
				double dineroPropio= imp.consultaSaldo(imp.buscar(numCuenta));
				System.out.print("Tu monto total es de: $");
				System.out.println(dineroPropio);
	
				} catch(Exception e) {
					System.out.println("Error al realizar el retiro");
					System.out.println("Tonto");

				}

				break;
			case 5:
				break;
			}
			
		}while(menu < 5);
		
	}

}
