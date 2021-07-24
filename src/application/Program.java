package application;

import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Empregado emp = new Empregado();
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		System.out.print("Bruto salario: ");
		emp.brutoSalario = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println();
		System.out.println("Empregado: " + emp);
		System.out.println();
		System.out.print("Qual porcentagem para aumentar o salárioy? ");
		double porcentagem = sc.nextDouble();
		emp.aumentarSalario(porcentagem);
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
		}

}
