/*
 * Faça um algoritmo que receba o número do mês e mostre o mês correspondente. 
 * Valide mês inválido;
 */
package exercicio29;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando as variaveis utilizadas
        Scanner sc = new Scanner(System.in);
        int mes, num = 1;

        while (num == 1) {
            //Solicitando o mês ao usuario
            System.out.print("Digite o mês (Ex: 1): ");
            mes = sc.nextInt();
            
            //Conforme o mês digitado pelo usuario retorna a mensagem correspondente ao mês
            switch (mes) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
                default:
                    System.out.println("Não existe mês correspondente");
            }

            System.out.print("Deseja continuar no programa? (1 - Sim): ");
            num = sc.nextInt();
        }
    }
}
