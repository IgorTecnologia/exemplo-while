package com.igor.cursojava.aula04;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		int num, somaPar =0, contImpar =0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = leia.nextInt();
		
		while(num != 0 ) {
			
			if(num % 2 == 0) {
				somaPar += num;
			}else {
				contImpar ++;
			}
			
			System.out.println("\nEntre com um número: ");
			num = leia.nextInt();
			
		}
		
		System.out.println("\nSomatório dos números pares: " + somaPar);
		System.out.println("\nQuantidade de números ímpares: " + contImpar);

	}

}
