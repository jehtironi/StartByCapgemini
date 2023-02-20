/*
 * Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o 
 * usuário digite um número que não esteja neste intervalo, exibir a seguinte 
 * mensagem: número inválido;
 */
package exercicio26;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        int num, aux = 1;

        while (aux == 1) {
            //Solicitando um número ao usuario
            System.out.print("Digite um número entre 1 e 5: ");
            num = sc.nextInt();

            //Se o número digitado não se encontra na faixa desejada permanecera no laço até o usuario digitar um número valido
            while (num < 1 || num > 5) {
                System.out.println("");
                System.out.print("Número invalido. Digite um número entre 1 e 5: ");
                num = sc.nextInt();
            }

            System.out.println("");
            //Se o número se encontra na faixa desejada irá escrever ele por extenso
            switch (num) {
                case 1:
                    System.out.println("Um");
                    break;
                case 2:
                    System.out.println("Dois");
                    break;
                case 3:
                    System.out.println("Três");
                    break;
                case 4:
                    System.out.println("Quatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;

            }

            //Solicita ao usuario se ele deseja continuar com a operação
            System.out.print("Deseja testar outro número? (1.Sim): ");
            aux = sc.nextInt();

        }
    }
}
