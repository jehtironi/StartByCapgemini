/*
 * Dados três valores A, B e C, em que A e B são números reais e C é um caractere, 
 * pede-se para imprimir o resultado da operação de A por B se C for um símbolo de 
 * operador aritmético; caso contrário deve ser impressa uma mensagem de operador 
 * não definido. Tratar erro de divisão por zero;
 */
package exercicio31;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        double numA, numB;
        int num = 1;
        String operadorC;

        while (num == 1) {
            //Solicitando ao usuario as informações necessarias
            System.out.print("Digite um número A: ");
            numA = sc.nextDouble();

            System.out.print("Digite um número B: ");
            numB = sc.nextDouble();

            System.out.print("Digite um operador: ");
            operadorC = sc.next();

            //Verifica e realiza a operação conforme o operador digitado pelo usuario
            //E ja retorna o resultado para o usuario
            switch (operadorC) {
                case "-":
                    System.out.println("O resultado da operação é: " + (numA - numB));
                    break;
                case "+":
                    System.out.println("O resultado da operação é: " + (numA + numB));
                    break;
                case "/":
                    System.out.println("O resultado da operação é: " + (numA / numB));
                    break;
                case "*":
                    System.out.println("O resultado da operação é: " + (numA * numB));
                    break;
                case "%":
                    System.out.println("O resultado da operação é: " + (numA % numB));
                    break;
                default: //Caso o usuario tenha digitado um valor não definido retorna a seguinte mensagem
                    System.out.println("operador não definido ");
            }
            
            //Solicita ao usuario se ele deseja realizar uma nova operação
            System.out.print("Deseja fazer outra operação? (1. Sim): ");
            num = sc.nextInt();
        }
    }
}
