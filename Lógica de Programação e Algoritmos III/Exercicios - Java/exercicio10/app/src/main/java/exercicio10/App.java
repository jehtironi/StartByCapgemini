/*
 * A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem 
 * juros. Faça um algoritmo que receba um valor de uma compra e mostre o valor das 
 * prestações;

 */
package exercicio10;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner sc = new Scanner(System.in);
        double valor, valorParcelas = 0;

        //Solicitando informações ao usuario
        System.out.print("Digite o valor gasto: ");
        valor = sc.nextDouble();

        //Calculando o valor das parcelas
        valorParcelas = (valor / 5);

        //Retornando as informações ao usuario
        System.out.println("O valor das 5 parcelas é: " + valorParcelas);

    }
}
