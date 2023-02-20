/*
 * Escreva um algoritmo que leia dois valores inteiro distintos e informe 
 * qual é o maior;
 */
package exercicio14;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        int maior = 0;
        int menor = 0;

        //Solicitando informações ao usuario
        System.out.print("Digite um número inteiro: ");
        num1 = sc.nextInt();

        System.out.print("Digite um segundo número inteiro: ");
        num2 = sc.nextInt();

        //Verificando qual número é maior
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }

        //Retornando informações ao usuario
        System.out.println("O número " + maior + " é maior que o número " + menor + ".");
    }
}
