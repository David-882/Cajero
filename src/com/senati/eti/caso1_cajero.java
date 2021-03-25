package com.senati.eti;

import java.util.Scanner;

public class caso1_cajero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		String contraseña;
		int saldo_inicial = 200000;
		int deposito, retiro;
		int intentos = 0;
		int continuar = 0;
		boolean salir = false;
		int saldo_actual;
		
		do { 
			System.out.print("Digite su contraseña: ");
			contraseña = sc.next();
			
			if(contraseña.equals("Maxtaku882")) {
				while(!salir) { 
					
					System.out.println("");
					
					System.out.println("BIENVENIDO A SU CAJERO");
					System.out.println("Digite una opcion: ");
					System.out.println("1. Depositar..........: ");
					System.out.println("2. Retirar............: ");
					System.out.println("3. Consultar saldo....: ");
					System.out.println("4. Salir..............: ");
					
					System.out.print("Digite una opcion: ");
					opcion = sc.nextInt();
					
					switch(opcion) {
					case 1:
						System.out.println("");
						System.out.print("Digite la cantidad que desea depositar: ");
						deposito = sc.nextInt();
						
						saldo_actual = saldo_inicial + deposito;
						System.out.println("Su saldo actual es: " + saldo_actual);
						System.out.println("Depositaste: " + deposito);
						saldo_inicial = saldo_actual;
						break;
					case 2:
						System.out.println("");
						System.out.print("Digite la cantidad que desea retirar: ");
						retiro = sc.nextInt();
						
						if(retiro > saldo_inicial) {
							System.out.println("Saldo insuficiente");
						}else {
							saldo_actual = saldo_inicial - retiro;
							saldo_inicial = saldo_actual;
						}
						System.out.println("Retiraste: " + retiro);
						System.out.println("Su saldo actual: " + saldo_inicial);
						System.out.println("");
						break;
					case 3:
						System.out.println("");
						System.out.println("Su saldo actual es: " + saldo_inicial);
						System.out.println("");
						break;
					case 4:
						salir = true;
						continuar = 1;
						System.out.println("");
						System.out.println("Gracias por usar nuestro cajero");
						break;
					default:
						System.out.println("");
						System.out.println("Opcion no disponible");
						break;
					}
					
				}
			}
			
			else {
				System.out.println("");
				System.out.println("===========================");
				System.out.println("La contraseña es incorrecta");
				System.out.println("===========================");
				System.out.println("");
				intentos ++;
			}
			
			if (intentos == 1) {
				System.out.println("Le quedan 2 intentos");
			}
			if(intentos == 2){
				System.out.println("Le queda 1 intento");
			}
			if(intentos == 3){
				System.out.println("La tarjeta ha sido bloqueada");
				break;
			}
			
		}while(continuar == 0);

	}

}
