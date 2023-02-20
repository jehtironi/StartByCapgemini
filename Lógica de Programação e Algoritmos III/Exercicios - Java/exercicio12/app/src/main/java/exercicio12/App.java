/*
 * O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o 
 * percentual do distribuidor e dos impostos aplicados (primeiro os impostos são 
 * aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre 
 * o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
 * 45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o 
 * custo ao consumidor do mesmo;
 */
package exercicio12;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        double custoFabrica, custoConsumidor = 0;

        //Solicitando informações ao usuario
        System.out.print("Digite o valor de fabrica do carro: ");
        custoFabrica = sc.nextDouble();

        //Calculando o valor final
        custoConsumidor = (custoFabrica * 1.45) * 1.28;

        //Retornando informações ao usuario
        System.out.println("O valor final do carro é: " + custoConsumidor);

    }
}
