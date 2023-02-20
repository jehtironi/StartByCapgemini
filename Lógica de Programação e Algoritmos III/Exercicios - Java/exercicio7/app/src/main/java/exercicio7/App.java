/*
 * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus 
 * Fahrenheit. Afórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em 
 * Fahrenheit e C a temperatura emCelsius; 
 */
package exercicio7;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando as variaveis
        double tempC, tempF;
        tempF = 0;
        Scanner sc = new Scanner(System.in);

        //Solicitando a temperatura em graus Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        tempC = sc.nextDouble();

        //Realizando a conversão de Celsius para graus Fahrenheit
        tempF = ((9 * tempC + 160) / 5);

        //Retornando o valor ao usuario
        System.out.println("A temperatura em graus Fahrenheit é: " + tempF);
    }
}
