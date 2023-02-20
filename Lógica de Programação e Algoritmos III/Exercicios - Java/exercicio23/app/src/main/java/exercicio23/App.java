/*
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este número
 * sege maior que 80, menor que 25 ou igual a 40;
 */
package exercicio23;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Declarando Variaveis
        Scanner sc = new Scanner(System.in);
        int num, n = 1;

        while (n == 1) {
            //Solicitando informações ao usuario
            System.out.print("Digite um número inteiro: ");
            num = sc.nextInt();

            //Verificando Em qual condição o número se encontra
            if (num == 40) {
                System.out.println("Número igual a 40.");
            } else if (num > 80) {
                System.out.println("Número maior que 80.");
            } else if (num < 25) {
                System.out.println("Número menor que 25.");
            } else {
                System.out.println("Número está entre 25 e 80, não sendo o 40.");
            }

            //Solicitando ao usuario se ele deseja continuar, se ele digitar 1 sim e qualquer outro número sai do laço de repetição.
            System.out.print("Deseja continuar testando os números? (1. Sim): ");
            n = sc.nextInt();
        }

    }
}
