package application;

import java.util.Locale;
import java.util.Scanner;
import entities.IngFamilia;
import entities.Ingresso;
import entities.MeiaEntrada;

public class Main {
	
	public static void main (String[] args) {
		
	Locale.setDefault(Locale.US);
	
	Scanner entrada = new Scanner(System.in);
	
	
	Ingresso ingressoGeral = new Ingresso(null, 35.0, false, false); 

	int opcaoModalidadeIngresso;
	do {
	System.out.println("***COMPRA DE INGRESSOS - CINEMA***");
	System.out.println("Valor do ingresso:" + "R$"+ ingressoGeral.getvalorIngresso());
	System.out.println();
	System.out.println();
	String modalidadeIngresso = """
			Escolha o seu ingresso:
			1. Ingresso individual
			2. Ingresso Meia-Entrada
			3. Ingresso Família
			0. Fechar a  aplicação. 
			
			OBS: Este menu irá ser reiniciado caso a opção não seja encontrada. 
			""";
	        	
	System.out.println(modalidadeIngresso);
	
	opcaoModalidadeIngresso = entrada.nextInt();
	entrada.nextLine(); 
	
	}
	
	while (opcaoModalidadeIngresso > 3); 	
	
	if (opcaoModalidadeIngresso == 1) {
		
		Ingresso ingressoIndividual = new Ingresso(null, 0, false, false);
		
		System.out.println("Entre com o nome do filme:");
		String nomeFilme = entrada.nextLine();
		ingressoIndividual.setNomeFilme(nomeFilme);
		System.out.println("Entre com L para LEGENDADO | D para DUBLADO:");
		char opcaoaudioFilme = entrada.next().charAt(0);
		
		if (opcaoaudioFilme == 'L'||opcaoaudioFilme == 'l' ) {
			
			ingressoIndividual.setLegendado(true);
			
		} else if (opcaoaudioFilme == 'D'||opcaoaudioFilme == 'd'){
			
			ingressoIndividual.setDublado(true);
			
		}
		//chamando metodo para adquirir 35 ao valor do ingresso individual
		ingressoIndividual.calculoIngressoTotal();
		System.out.println("Compra:");
		System.out.println(ingressoIndividual);
	    System.out.println("Obrigada pela compra. Agradecemos a preferência!");	
		
	} else if (opcaoModalidadeIngresso == 2) {
		
		Ingresso ingressoMeiaEntrada = new MeiaEntrada(null, 0, false, false);
		
		System.out.println("Entre com o nome do filme:");
		String nomeFilme = entrada.nextLine();
		ingressoMeiaEntrada.setNomeFilme(nomeFilme);
		System.out.println("Entre com L para LEGENDADO | D para DUBLADO:");
		char opcaoaudioFilme = entrada.next().charAt(0);
		
		if (opcaoaudioFilme == 'L'||opcaoaudioFilme == 'l' ) {
			
			    ingressoMeiaEntrada.setLegendado(true);
			
		} else if (opcaoaudioFilme == 'D'||opcaoaudioFilme == 'd')  {
			    ingressoMeiaEntrada.setDublado(true);
			
		}
		//atribuindo 35 reais ao ingresso - valor geral
	    ingressoMeiaEntrada.getvalorIngresso();
		System.out.println("Compra:");
		ingressoMeiaEntrada.calculoIngressoTotal(); //chamada do metodo poliformico para calculo da meia entrada
		System.out.println(ingressoMeiaEntrada); //imprimindo objeto já com o calculo sendo realizado
	    System.out.println("Obrigada pela compra. Agradecemos a preferência!");		
		
	} else if (opcaoModalidadeIngresso == 3 ) {
		

	Ingresso ingressoFamilia = new IngFamilia(null, 35.0, false, false, 0);
		
	System.out.println("Entre com o nome do filme:");
	String nomeFilme = entrada.nextLine();
	ingressoFamilia.setNomeFilme(nomeFilme);
	System.out.println("Entre com L para LEGENDADO | D para DUBLADO:");
	char opcaoaudioFilme = entrada.next().charAt(0);
	
	if (opcaoaudioFilme == 'L'||opcaoaudioFilme == 'l' ) {
		
		ingressoFamilia.setLegendado(true);
		
	} else if (opcaoaudioFilme == 'D'||opcaoaudioFilme == 'd')  {
		ingressoFamilia.setDublado(true);
		
	}
	 // falta: inserir a verificação de entrada do usuário
	 System.out.println("Informe quantas pessoas compõe a família: (Desconto de 5%: + de 3 membros familiares!)");
	 int qntPessoas = entrada.nextInt(); 
	 ((IngFamilia) ingressoFamilia).setNumeroPessoas(qntPessoas);
	 
	 System.out.println("Compra:");
	 ingressoFamilia.calculoIngressoTotal();
	 System.out.println(ingressoFamilia);
	 System.out.println("Obrigada pela compra. Agradecemos a preferência!");		
		
	} else {
		
		 System.out.println("Aplicação encerrada!");
	}
	
	entrada.close();
	
  }
	
}
