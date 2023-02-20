/*
 * Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de
 * forma que a variávelApasse a possuir ovalor da variável B e a variável B passe a
 * possuir o valor da variável A.Apresentar osvalores trocados;    
 */
package exercicio6;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando as variaveis
        int num1, num2, aux;
        Scanner sc = new Scanner(System.in);

        //Solicitando o numero A
        System.out.print("Digite o número A: ");
        num1 = sc.nextInt();

        //Solicitando o numero B
        System.out.print("Digite o número B: ");
        num2 = sc.nextInt();

        //Realizando a troca dos valores
        aux = num1;
        num1 = num2;
        num2 = aux;

        //Retornando o valor ao usuario
        System.out.println("O valor de A é: " + num1);
        System.out.println("O valor de B é: " + num2);
    }
}
