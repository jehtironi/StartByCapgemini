/*
 * Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
 */
package exercicio1;

//Importa biblioteca para utilizar o Scanner
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declaração de variaveis
        int num1, num2;
        int soma = 0;
        Scanner sc = new Scanner(System.in);

        //Solicitando ao usuario os números
        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        //Calculando a soma
        soma = num1 + num2;

        //Retornando o valor da soma para o usuario
        System.out.println("A soma dos dois números é: " + soma);

    }
}
