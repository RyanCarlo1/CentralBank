package bank;
import bank.Cliente;

import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Cliente cliente= new Cliente();	
		Scanner sc = new Scanner(System.in);
		Random numero = new Random();
		
		int idPessoal = 1 + numero.nextInt(999);
		 int idAgencia = 1 + numero.nextInt(999);
		
		System.out.println("-- Dados Banc�rios --  ");
		System.out.println("-- Nome --");
		cliente.nome = sc.nextLine();
		System.out.println("-- Endere�o -- ");
		cliente.endere�o = sc.next();
		System.out.println("-- CPF -- ");
		cliente.cpf = sc.next();
		System.out.println(" -- Profiss�o -- ");
		cliente.profiss�o = sc.next();
		System.out.println(" -- Renda -- ");
		cliente.renda = sc.nextInt();
		System.out.println("-- Saldo -- ");
		cliente.saldo = sc.nextInt();
		System.out.println("Seu ID �: "+ idPessoal);
		System.out.println("O ID da sua ag�ncia �: "+ idAgencia);
	
		cliente.DadosBancarios();
		System.out.println("");
		cliente.iniciar();
		
		sc.close();
	}

	}


