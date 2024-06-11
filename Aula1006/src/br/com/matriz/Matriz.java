package br.com.matriz;
import java.util.Scanner;


public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int tam = entrada.nextInt();
		
		char matriz[][] = new char[tam][tam];
		
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				matriz[i][j] = '0';
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		
			
		}
		
		Scanner entrada2 = new Scanner(System.in);
		
		int tam2 = entrada.nextInt();
		
		char matriz2[][] = new char[tam][tam];
		
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam - i; j++) {
				matriz[i][j] = '0';
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		
			
		}
		
		Scanner entrada3 = new Scanner(System.in);
		
		int tam3 = entrada.nextInt();
		
		char matriz3[][] = new char[tam][tam];
		
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < i + 1; j++) {
				matriz[i][j] = '0';
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		
			
		}
		
		Scanner entrada4 = new Scanner(System.in);
		
		int tam4 = entrada.nextInt();
		
		char matriz4[][] = new char[tam][tam];
		
		for(int i = 0; i < tam ; i++) {
			for(int j = 0; j < tam; j++) {
				if(tam - j - 1 > i) {
					matriz[i][j] = ' ';
					System.out.print(matriz[i][j]);	
				}
				else {
					matriz[i][j] = '0';
					System.out.print(matriz[i][j]);
				}
				
			}
			System.out.println();
		
			
		}

	}

}
