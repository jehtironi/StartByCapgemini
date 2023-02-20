/*
 * A escola “APRENDER” faz o pagamento de seus professores por hora/aula. 
 * Faça um algoritmo que calcule e exiba o salário de um professor. Sabe-se que o 
 * valor da hora/aula segue a tabela abaixo: 
 *   a. Professor Nível 1 R$12,00 por hora/aula;
 *   b. Professor Nível 2 R$17,00 por hora/aula;
 *   c. Professor Nível 3 R$25,00 por hora/aula.
 */
package exercicio33;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        int nivelProfessor, num = 1;
        double horas = 0d;

        while (num == 1) {
            //Solicitando ao usuario as informações
            System.out.print("Informe o nível do professor: ");
            nivelProfessor = sc.nextInt();

            System.out.print("Informe a quantidade de hora/aula: ");
            horas = sc.nextDouble();

            //Verificando o nivel do professor e calculando o valor do salario conforme cada nivel
            //Retorna as informações ao usuario
            switch (nivelProfessor) {
                case 1:
                    System.out.println("O salario do professor é: R$ " + (12 * horas));
                    break;
                case 2:
                    System.out.println("O salario do professor é: R$ " + (17 * horas));
                    break;
                case 3:
                    System.out.println("O salario do professor é: R$ " + (25 * horas));
                    break;
                default:
                    System.out.println("Nível do professor invalido.");
            }

            System.out.print("Deseja verificar o salario de outro professor? (1. Sim): ");
            num = sc.nextInt();

        }
    }
}
