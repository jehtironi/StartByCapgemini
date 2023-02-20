/*
 * Escreva um algoritmo que leia três valores inteiros e verifique se eles podem 
 * ser os lados de um triângulo. Se forem, informar qual o tipo de triângulo que 
 * eles formam: equilátero, isóscele ou escaleno. Propriedade: o comprimento de 
 * cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois 
 * lados. 
 *   a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
 *   b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
 *   c. Triângulo equilátero é também isóscele;
 *   d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
 */
package exercicio32;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    //Função que verifica o tipo de triangulo
    public static String verificarTipoTriangulo(int lado1, int lado2, int lado3) {

        if ((lado1 == lado2) && (lado2 == lado3)) {
            return "Equilatero";
        } else {
            if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        }
    }

    //Função que verifica se é um triangulo ou não
    public static boolean verificarIntegridadeTriangulo(int lado1, int lado2, int lado3) {

        if ((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3) || (lado3 > lado2 + lado1) || (lado1 == lado2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        //Declarando as variaveis
        Scanner sc = new Scanner(System.in);
        int lado1, lado2, lado3;

        //Solicita os lados para o usuario
        System.out.print("Digite o valor do lado 1: ");
        lado1 = sc.nextInt();
        System.out.print("Digite o valor do lado 2: ");
        lado2 = sc.nextInt();
        System.out.print("Digite o valor do lado 3: ");
        lado3 = sc.nextInt();

        //Apos verificar a integridade do triangulo se for true chama a função para verificar o tipo de triangulo
        if (verificarIntegridadeTriangulo(lado1, lado2, lado3) == true) {
            System.out.println(verificarTipoTriangulo(lado1, lado2, lado3));
        } else { //Caso contrario retorna a seguinte mensagem ao usuario
            System.out.println("Não é triangulo.");
        }
    }
}
