/*
 * Faça um algoritmo que leia dois números e identifique se são iguais ou 
 * diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são 
 * iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem 
 * que são diferentes;
 */
package exercicio25;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        //Solicitando informações ao usuario
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.println("");

        //Verificando se os números são iguais
        if (num1 == num2) { //Se forem igueias retorna a seguinte mensagem
            System.out.println("Os números são iguais.");
        } else {
            if (num1 > num2) { //Se o número 1 for maior retorna ao usuario que os número 1 é o maior
                System.out.println("Os números são diferentes e o número " + num1 + " é maior que o " + num2 + ".");
            } else { //Caso contrário retorna que o número 2 é maior
                System.out.println("Os números são diferentes e o número " + num2 + " é maior que o " + num1 + ".");
            }
        }

    }
}
