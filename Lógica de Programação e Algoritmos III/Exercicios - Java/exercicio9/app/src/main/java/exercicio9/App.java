/*
 * Faça um algoritmo que receba um valor que foi depositado e exiba o valor com 
 * rendimento após um mês.Considere fixo o juro da poupança em 0,07% a. m;
 */
package exercicio9;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Declaração de variaveis
        Scanner sc = new Scanner(System.in);
        double valorDepositado;
        double valorFinal = 0;

        //Solicitando ao usuario os valores
        System.out.print("Insira o valor depositado: ");
        valorDepositado = sc.nextDouble();

        //Calculando o valor final
        valorFinal = valorDepositado * 1.0007;
        //Retornando ao usuario os valores
        System.out.println("O valor após 1 mês é: " + valorFinal);

    }
}
