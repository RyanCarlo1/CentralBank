package bank;

import java.util.Random;
import java.util.Scanner;






public class Cliente {
	
	Scanner sc = new Scanner(System.in);
	
	 Random numero = new Random();
	
	public String nome;
	public String endere�o;
	public String cpf;
	public String profiss�o;
	public int renda;
	public int idPessoal;
	public int idAgencia;
	public double saldo;
	public int saques;
	public int depositos;
	public int opcao;
	public double valor;
	public double valor1;
	public double saldoPoupanca;
	
	
	
	public void iniciar(){
		
        int opcao;

        do{
            Menu();
            opcao = sc.nextInt();
            escolheOpcao(opcao);
        }while(opcao!=4);
    }
	
public void Menu() {
		System.out.println("");
		System.out.println("-- Selecione uma op��o:--");
		System.out.println("");
		System.out.println("1-- Dep�sito--");
		System.out.println("");
		System.out.println("2-- Saque--");
		System.out.println("");
		System.out.println("3-- Extrato--");
		System.out.println("");
		System.out.println("4-- Investimentos--");
		System.out.println("");
		System.out.println("5-- ENCERRAR SISTEMA--");
		System.out.println("");
		System.out.println("--Op��o--");
		System.out.println("");
	}
	
	public void escolheOpcao(int opcao){
        double valor;
        
        switch( opcao ){
            case 1:                
                    System.out.println("Quanto deseja depositar? ");
                    valor = sc.nextDouble();
                    Deposito(valor);
                    break;
            case 2: 
                    System.out.println("Quanto deseja sacar? ");
                    valor = sc.nextDouble();
                    Saque(valor);
                    break;
            case 3:
                    Extrato();
                    break;
                    
            case 4:
            		Investimentos(opcao);
            		break;
                    
            case 5: 
                    System.out.println("Sistema encerrado.");
                    break;
                    
            default:
                    System.out.println("Op��o inv�lida");
        }
    }
	

	public void DadosBancarios( ) {
		System.out.println("-- Dados Banc�rios -- ");
		System.out.println("-- Nome --" + this.nome);
		System.out.println("-- Endere�o -- "+ this.endere�o);
		System.out.println("-- CPF: -- "+ this.cpf);
		System.out.println("-- Profiss�o -- "+ this.profiss�o);
		System.out.println("-- Renda -- "+ this.renda);
		System.out.println("-- Saldo -- "+ this.saldo);
	}
	
	public void Deposito(double valor)  {
		saldo += valor;
		depositos++;
		System.out.println("-- Realize seu dep�sito --  ");
		System.out.println("");
		System.out.println("Saldo atual: " + saldo);	
	}
	
	public void Transfere (double valor) {
		saldo = saldo -= valor1;
		saldoPoupanca = valor1;	
	}
	
	public void Saque (double valor) {
		
		System.out.println("--- Realize seu saque ---");
		
		if (saldo >= valor) {
			saldo -= valor;
			saques++;
			System.out.println("Novo saldo: " + saldo);
		}
	}
	
	public void Extrato() {
		
		System.out.println("-- Saldo Atual: --    "+ this.saldo);
		System.out.println("-- A quantidade de saques foi: --    " + saques);
		System.out.println("-- A quantidade de dep�sitos foi --  "+ depositos);
			
	}
	
	public void Investimentos(int opcao) {
	
		System.out.println("--Painel de Investimentos--");
		System.out.println("");
		System.out.println("1 -- POUPAN�A 1% (DISPONIVEL)");
		System.out.println("");
		System.out.println("2 --A��ES (INDISPONIVEL");
		System.out.println("");
		System.out.println("-- Informe a op��o desejada -- ");
		opcao = sc.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Quanto deseja passar para poupan�a?");
			valor1 = sc.nextDouble();
			Transfere(valor);
			valor1 = (valor1 + (valor1 * 0.01));
			System.out.println("-- Saldo atual --" + saldo);
			System.out.println("");
			System.out.println("-- Saldo poupan�a --" + valor1);
			iniciar();
			
			break;
			
		
		case 2: 
			System.out.println("Indispon�vel");
			break;
			
		}
	}
	
	
	

		
	}





