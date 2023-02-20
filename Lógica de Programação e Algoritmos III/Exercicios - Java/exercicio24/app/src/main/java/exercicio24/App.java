/*
 * Faça um algoritmo que receba “N” números e mostre positivo, negativo ou 
 * zero para cada número;
 */
package exercicio24;

//Importa o método Scanner para ser utilizado
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Inicializando o scanner
        Scanner sc = new Scanner(System.in);

        //Declarando as variaveis
        int n = 1;
        int numero;

        //Permanece no laço de repetição enquanto n for igual a 1
        while (n == 1) {

            //Solicita ao usuario um número
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();

            if (numero == 0) { //Verifica se o número é zero
                System.out.println("O número é zero.");
            } else if (numero > 0) { //Verifica se o número é maior que zero
                System.out.println("O número é positivo.");
            } else { //Verifica se o número é menor que zero
                System.out.println("O número é negativo.");
            }

            System.out.println(" ");

            //Solicita ao usuario se ele deseja continuar executando o programa
            System.out.print("Deseja continuar? ");
            n = sc.nextInt();

        }
    }
}
