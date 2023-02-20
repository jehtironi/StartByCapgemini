/*
 * Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e 
 * o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
 * vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu 
 * nome, o salário fixo e salário no final do mês;

 */
package exercicio4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando as variaveis
        String nome;
        double salario, valorVendas, salarioFinal;
        salarioFinal = 0;
        Scanner sc = new Scanner(System.in);

        //Solicitando ao usuario o seu nome
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();

        //Solicitando ao usuario o seu salario
        System.out.print("Digite o seu salario: ");
        salario = sc.nextDouble();

        //Solicitando ao usuario o total de vendas em dinheiro
        System.out.print("Digite o total de vendas em dinheiro: ");
        valorVendas = sc.nextDouble();

        //Calculando o consumo medio de gasolina
        salarioFinal = salario + (valorVendas * 0.15);

        //Retornando o valor ao usuario
        System.out.println("O seu nome é: " + nome);
        System.out.println("O salario base é: " + salario);
        System.out.println("O salario final é: " + salarioFinal);
    }
}
