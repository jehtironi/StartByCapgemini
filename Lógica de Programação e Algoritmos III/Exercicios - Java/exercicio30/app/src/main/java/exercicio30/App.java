/*
 * Escreva um algoritmo que leia três valores inteiros distintos e os escreva em 
 * ordem crescente;
 */
package exercicio30;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[3];
        int i, j, aux;

        //Solicitando os numeros ao usuario
        for (i = 0; i < 3; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        //Ordenando o vetor
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (numeros[j] > numeros[i]) { //Se o numeros[j] for maior que numeros[i]
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        //Imprimindo o vetor ordenado
        for (i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }

    }
}
