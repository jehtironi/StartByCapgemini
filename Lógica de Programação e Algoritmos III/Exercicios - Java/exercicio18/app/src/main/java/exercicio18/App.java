/*
 * Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem 
 * informando “maior de idade” e “menor de idade” para cada pessoa. Considere 
 * a idade a partir de 18 anos como maior de idade;
 */
package exercicio18;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        int i, idade;

        System.out.println("Informe a idade de 75 pessoas: ");
        //Solicitando a idade das pessoas e verificando se são maiores de idade ou não
        for (i = 0; i < 5; i++) {
            System.out.print("Pessoa " + i + ": ");
            idade = sc.nextInt();

            if (idade >= 18) {
                System.out.println("Maior de idade.");
            } else {
                System.out.println("Menor de idade");
            }
        }

    }
}
