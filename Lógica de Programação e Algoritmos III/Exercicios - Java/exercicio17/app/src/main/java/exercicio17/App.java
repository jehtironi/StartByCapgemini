/*
 * Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo
 * entre 10 (inclusive) e 150 (inclusive);
 */
package exercicio17;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        int cont = 0, i, num;

        System.out.println("Informe 80 números inteiros: ");
        //Solicitando e verificando quais números estão entre 10 e 150
        for (i = 0; i < 5; i++) {
            System.out.print("Número " + i + ": ");
            num = sc.nextInt();

            if (num >= 10 && num <= 150) {
                cont++;
            }
        }
        
        //Retornando ao usuario a quantidade de números que estavam entre 10 e 150
        System.out.println(cont + " números estão entre a faixa de 10 a 150.");
    }
}
