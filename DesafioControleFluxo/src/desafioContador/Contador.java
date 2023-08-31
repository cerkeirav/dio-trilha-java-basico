package desafioContador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int primeiroNumero;
		int segundoNumero;
		
		while (true) {
			System.out.println("INSIRA O PRIMEIRO NUMERO: ");
			try {
				primeiroNumero = sc.nextInt();
				System.out.println("INSIRA O SEGUNDO NUMERO: ");
				segundoNumero = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("INSERIR APENAS NUMEROS");
			}
		}
		
		try {
			validarNumeros(primeiroNumero, segundoNumero);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O PRIMEIRO VALOR DEVE SER MENOR QUE O SEGUNDO.");
		}
		sc.close();
			
	}
	static void validarNumeros(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
		if(numeroUm > numeroDois) {
			throw new ParametrosInvalidosException();
		}else {
			int terceiroNumero = numeroDois - numeroUm;
			for(int i = 1; i <= terceiroNumero; i++) {
				System.out.println("Imprimindo o numero " + i);
			}
		}
	}

}
