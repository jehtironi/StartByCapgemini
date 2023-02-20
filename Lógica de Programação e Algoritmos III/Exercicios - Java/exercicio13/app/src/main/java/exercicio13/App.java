/*
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este 
 * número seja maior que 10;
 */
package exercicio13;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando as variaveis
        Scanner sc = new Scanner(System.in);
        int num;

        //Solicitando um numero ao usuario
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        //Verificando se o numero é maior que 10
        if (num > 10) {
            System.out.println("O número é maior que 10.");
        } else {
            System.out.println("O número é menor que 10.");
        }

    }
}
