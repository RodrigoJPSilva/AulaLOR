package MédiaAltura;

import java.util.Scanner;

public class Média {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc  = new Scanner(System.in);
			String Nome1, Nome2;
			double Alt1, Alt2,  Media;
			
			//Dados primeira pessoa
			System.out.println("Dados da primeira pessoa: ");
			
			System.out.print("Nome: ");
			Nome1 = sc.nextLine();
			System.out.print("Altura: ");
			Alt1 = sc.nextDouble();
			
			sc.nextLine();
		
			//Dados segunda pessoa
			System.out.println("Dados da segunda pessoa: ");
			System.out.print("Nome: ");
			Nome2 = sc.nextLine();
			System.out.print("Altura: ");
			Alt2 = sc.nextDouble();
			Media = (Alt1+Alt2) / 2;
			System.out.println("A altura média de "+ Nome1 + "e " + Nome2 + "são" + Media);
			sc.close();

		}

	}
