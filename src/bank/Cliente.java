package bank;

import java.util.Random;
import java.util.Scanner;






public class Cliente {
	
	Scanner sc = new Scanner(System.in);
	
	 Random numero = new Random();
	
	public String nome;
	public String endereço;
	public String cpf;
	public String profissão;
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
		System.out.println("-- Selecione uma opção:--");
		System.out.println("");
		System.out.println("1-- Depósito--");
		System.out.println("");
		System.out.println("2-- Saque--");
		System.out.println("");
		System.out.println("3-- Extrato--");
		System.out.println("");
		System.out.println("4-- Investimentos--");
		System.out.println("");
		System.out.println("5-- ENCERRAR SISTEMA--");
		System.out.println("");
		System.out.println("--Opção--");
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
                    System.out.println("Opção inválida");
        }
    }
	

	public void DadosBancarios( ) {
		System.out.println("-- Dados Bancários -- ");
		System.out.println("-- Nome --" + this.nome);
		System.out.println("-- Endereço -- "+ this.endereço);
		System.out.println("-- CPF: -- "+ this.cpf);
		System.out.println("-- Profissão -- "+ this.profissão);
		System.out.println("-- Renda -- "+ this.renda);
		System.out.println("-- Saldo -- "+ this.saldo);
	}
	
	public void Deposito(double valor)  {
		saldo += valor;
		depositos++;
		System.out.println("-- Realize seu depósito --  ");
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
		System.out.println("-- A quantidade de depósitos foi --  "+ depositos);
			
	}
	
	public void Investimentos(int opcao) {
	
		System.out.println("--Painel de Investimentos--");
		System.out.println("");
		System.out.println("1 -- POUPANÇA 1% (DISPONIVEL)");
		System.out.println("");
		System.out.println("2 --AÇÕES (INDISPONIVEL");
		System.out.println("");
		System.out.println("-- Informe a opção desejada -- ");
		opcao = sc.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("Quanto deseja passar para poupança?");
			valor1 = sc.nextDouble();
			Transfere(valor);
			valor1 = (valor1 + (valor1 * 0.01));
			System.out.println("-- Saldo atual --" + saldo);
			System.out.println("");
			System.out.println("-- Saldo poupança --" + valor1);
			iniciar();
			
			break;
			
		
		case 2: 
			System.out.println("Indisponível");
			break;
			
		}
	}
	
	
	

		
	}





