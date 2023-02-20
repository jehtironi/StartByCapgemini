/*
 * Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
 * dos dois números lidos;

 */
package exercicio2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declaração de variaveis
        double num1, num2;
        double soma = 0;
        double subtracao = 0;
        double multiplicacao = 0;
        double divisao = 0;
        Scanner sc = new Scanner(System.in);

        //Solicitando ao usuario os números
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        //Calculando a soma
        soma = num1 + num2;

        //Calculando a subtração
        subtracao = num1 - num2;

        //Calculando a divisao
        divisao = num1 / num2;

        //Calculando a multiplicação
        multiplicacao = num1 * num2;

        //Retornando o valor das operações para o usuario
        System.out.println("A soma dos dois números é: " + soma);
        System.out.println("A subtração dos dois números é: " + subtracao);
        System.out.println("A divisão dos dois números é: " + divisao);
        System.out.println("A multiplicação dos dois números é: " + multiplicacao);
    }
}
