/*
 * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor
 * de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com 
 * um percentual informado pelo usuário;
 */
package exercicio11;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner sc = new Scanner(System.in);
        double precoCusto, percentual, precoVenda = 0;

        //Solicitando informações ao usuario
        System.out.print("Digite o preço de custo do produto: ");
        precoCusto = sc.nextDouble();

        System.out.print("Digite o valor do percentual de aumento do produto: ");
        percentual = sc.nextDouble();

        //Calculando o preço final do produto
        precoVenda = precoCusto * (1 + (percentual / 100));

        //Retornando os resultados ao usuario
        System.out.println("O valor final do produto é: " + precoVenda);
    }
}
