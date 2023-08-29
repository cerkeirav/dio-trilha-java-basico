package contaBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Integer numero;
		String agencia;
		String nomeCliente;
		double saldo = 1200.00;
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Por favor digite o seu nome: ");
		nomeCliente = sc.next();

		while (!nomeCliente.matches("^[a-zA-Z]+$")) {
		    System.out.println("Favor inserir apenas letras: ");
		    nomeCliente = sc.next();
		}
		
		sc.nextLine();
		
		System.out.println("Agora insira o número da sua agência: ");
		agencia = sc.next();
		while (!agencia.matches("^\\d+$") || agencia.length() > 4) {
		    System.out.println("Favor inserir um número válido de agência: ");
		    agencia = sc.next();
		}
		
		sc.nextLine();
		
		while (true) {
		    System.out.println("Agora insira o número da sua conta: ");
		    try {
		        numero = sc.nextInt();
		        break; 
		    } catch (InputMismatchException e) {
		        sc.nextLine();
		        System.out.println("Insira apenas números válidos.");
		    }
		}
		
	System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
		
	sc.close();
		

	}

}
