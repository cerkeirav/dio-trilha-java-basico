package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String candidatos [] = {"FELIPE","MARCIA","LUCAS","CLAUDIA","MARIANA"};
		for (String candidato : candidatos) {
			entrarEmContato(candidato);
		}
		
		
//		analisarCandidato(1900.0);
//		analisarCandidato(2200.0);
//		analisarCandidato(2000.0);
//		selecaoCandidatos();
//		imprimirSelecionados();
		
	}
	
	static void entrarEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("CONTATO REALIZADO COM SUCESSO.");
			}
		} while (continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATOS COM O " + candidato + " NA " + tentativasRealizadas + "° TENTATIVAS(S)");
		else
			System.out.println("NAO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " NUMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas);
	}
	
	static boolean atender(){
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados() {
		String candidatos [] = {"FELIPE","MARCIA","LUCAS","CLAUDIA","MARIANA"};
		
		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de número " + (indice+1) + " é o " + candidatos[indice]);
			
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE","MARCIA","LUCAS","CLAUDIA","MARIANA","JOSE","KELLEN","MARIA", "MARCOS", "ANDERSOSN", "BARBARA"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido){
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
