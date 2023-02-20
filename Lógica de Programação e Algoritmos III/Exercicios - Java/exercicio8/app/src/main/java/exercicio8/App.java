/*
 * Elabore um algoritmo que efetue a apresentação do valor da conversão em real 
 * (R$) de um valorlido em dólar (US$). O algoritmo deverá solicitar o valor da 
 * cotação do dólar e também aquantidade de dólares disponíveis com ousuário;
 */
package exercicio8;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando as variaveis
        double valorDolar, dolar, valorReal;
        valorReal = 0;
        Scanner sc = new Scanner(System.in);

        //Solicitando o valor de dolares para o usuario
        System.out.print("Digite a quantia em dolar para realizar a conversão: ");
        valorDolar = sc.nextDouble();

        //Solicitando o valor da cotação do dolar hoje
        System.out.print("Digite o valor do dolar hoje: ");
        dolar = sc.nextDouble();

        //Realizando a conversão de dolar para reais
        valorReal = (valorDolar * dolar);

        //Retornando o valor ao usuario
        System.out.println("O valor em reais é: " + valorReal);
    }
}
