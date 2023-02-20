/* 
 * Faça um algoritmo que receba um número e diga se este 
 * número está no intervalo entre 100 e 200;
 */
package exercicio15;

//Importa biblioteca para utilizar o Scanner
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declaração de variaveis
        int numero;

        //Iniciando o Scanner
        Scanner sc = new Scanner(System.in);

        //Solicita ao usuario um numero
        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();

        //Verifica se esse número está entra 100 e 200
        if (numero >= 100 && numero <= 200) {
            System.out.println("Número está no intervalo de 100 a 200."); //Se sim, retorna ao usuario que o número está no intervalo
        } else {
            System.out.println("Número não está no intervalo de 100 a 200."); //Se não, retorna ao usuario que o número não está no intervalo
        }
    }

}
