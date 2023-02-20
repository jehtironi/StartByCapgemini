/*
 * Escreva um algoritmo para determinar o consumo médio de um automovel sendo
 * fornecida a distância total percorrida pelo automóvel e o total de 
 * combustível gasto.
 */
package exercicio3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando as variaveis
        double consumoMedio, distancia, totalGasolina;
        consumoMedio = 0;
        Scanner sc = new Scanner(System.in);

        //Solicitando ao usuario a distancia percorrida
        System.out.print("Digite a distancia percorrida: ");
        distancia = sc.nextDouble();

        //Solicitando ao usuario o total de combustivel gasto
        System.out.print("Digite o total de combustivel gasto: ");
        totalGasolina = sc.nextDouble();

        //Calculando o consumo medio de gasolina
        consumoMedio = distancia / totalGasolina;

        //Retornando o valor da soma para o usuario
        System.out.println("O consumo médio é: " + consumoMedio);
    }
}
