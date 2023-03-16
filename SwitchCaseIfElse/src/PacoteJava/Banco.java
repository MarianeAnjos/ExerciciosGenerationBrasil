package PacoteJava;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float dinheiro = 1000,saque,valor,deposito;
        int operacao;

        Scanner leia = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("Saldo");
        System.out.println("Saque");
        System.out.println("Depósito");

        operacao = leia.nextInt();

        switch(operacao) {

        case 1:
            System.out.printf("O seu saldo é de R$ %.2f",dinheiro);
            break;
        case 2: 
            System.out.println("Digite o valor a ser retirado");
            saque = leia.nextFloat();
            if(saque>dinheiro) {
                System.out.println("Saldo insulficiente!");
            }else {
                valor = dinheiro-saque;
                System.out.printf("Seu saldo agora é %.2f",valor);
            }
            break;
        case 3:
            System.out.println("Digite o valor a ser depositado: ");
            deposito = leia.nextFloat();
            valor = deposito+dinheiro;
            System.out.println("Digite o valor a ser depositado: ");
            System.out.printf("Seu saldo agora é %.2f", valor);
            break;
            default:
                System.out.println("Operação inválida!");
        }
	}

}
