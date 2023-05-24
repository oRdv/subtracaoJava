package br.senai.jandira.sp;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Bem-vindo(a) a nossa calculadora.");
		System.out.print("Insira o primeiro número: ");
		double numero1 = teclado.nextDouble();
		
		System.out.print("Insira o segundo número: ");
		double numero2 = teclado.nextDouble();
		
		double result;
		result = numero1 - numero2;
		
		System.out.println("O resultado é " + result);
		

	}

}
