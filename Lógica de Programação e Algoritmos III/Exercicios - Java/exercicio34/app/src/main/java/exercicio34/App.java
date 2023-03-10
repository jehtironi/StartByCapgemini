/*
 * Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma 
 * das seguintes categorias: 
 *   a. Infantil A = 5 - 7 anos;
 *   b. Infantil B = 8 - 10 anos;
 *   c. Juvenil A = 11- 13 anos;
 *   d. Juvenil B = 14 - 17 anos;
 *   e. Sênior = 18 - 25 anos.
 * Apresentar mensagem “idade fora da faixa etária” quando for outro ano não 
 * contemplado;
 */
package exercicio34;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando as variaveis
        Scanner sc = new Scanner(System.in);
        int num = 1, idade;

        while (num == 1) {
            //Solicitando informações ao usuario
            System.out.print("Digite a idade do usuario: ");
            idade = sc.nextInt();

            //Verifica em qual faixa o nadaor se encontra conforme a sua idade
            if (idade >= 5 && idade <= 7) {
                System.out.println("Infantil A");
            } else {
                if (idade >= 8 && idade <= 10) {
                    System.out.println("Infantil B");
                } else {
                    if (idade >= 11 && idade <= 13) {
                        System.out.println("Juvenil A");
                    } else {
                        if (idade >= 14 && idade <= 17) {
                            System.out.println("Juvenil B");
                        } else {
                            if (idade >= 18 && idade <= 25) {
                                System.out.println("Sênior");
                            } else {
                                System.out.println("Idade fora da faixa etária");
                            }
                        }
                    }
                }
            }

            //Solicitando informações ao usuario
            System.out.print("Deseja verificar outro nadador? (1 - Sim): ");
            num = sc.nextInt();
        }
    }
}
