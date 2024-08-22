package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.ContaComercial;
import entidade.ContaPoupanca;
import entidade.enums.Cores;


public class Principal {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
  
		List<ContaComercial> lista1 = new ArrayList<>();
		List<ContaPoupanca> lista2 = new ArrayList<>();
		
		 System.out.println("Qual tipo de conta voce deseja?\n"+"1.Comercial\n"+"2.Poupança");
		 int escolha = scn.nextInt();
		  
		 if(escolha == 1) {
			 
		 
			 
          int i = 0;
			 
			 while(i <3) {
			 
			 System.out.println("Digite seu nome:");
				String nome1 = scn.next();

				System.out.println("Digite o numero da conta:");
				int numero1 = scn.nextInt();

				System.out.println("Digite o saldo da conta:");
				double saldo1 = scn.nextDouble();

				System.out.println("Digite o limite da conta:");
				double limite1 = scn.nextDouble();
				
				ContaComercial cc = new ContaComercial(nome1, numero1, saldo1, Cores.BLACK, limite1);
				
	
				lista1.add(cc);
			 
				System.out.println(lista1);
				
				i++;	
			 }
		 }
		 if(escolha == 2) {
			 
              
            int i = 0;
	 
			 while(i <3) {
			 
			 
			 System.out.println("Digite seu nome:");
				String nome = scn.next();

				System.out.println("Digite o numero da conta:");
				int numero = scn.nextInt();

				System.out.println("Digite o saldo da conta:");
				double saldo = scn.nextDouble();
 
				 
				 lista2.add(new ContaPoupanca(nome,numero,saldo, Cores.BLACK));
				 
				 System.out.println(lista2);
				 
				 
				 i++;
			 }
			 
		 }
					   
		 else {
		 
			 
			 System.out.println("Você não escolheu uma das opções fornecidas");
		 
		 }
		 
		 
			System.out.println(lista1);
			System.out.println(lista2);
	
	
		 }
}
