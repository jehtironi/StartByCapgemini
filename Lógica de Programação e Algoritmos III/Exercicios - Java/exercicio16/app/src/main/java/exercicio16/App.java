/*
 * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno 
 * durante o semestre. Calcular a sua média (aritmética), informar o nome e sua 
 * menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 
 * 5.1 a 6.9);
 */
package exercicio16;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando as variaveis
        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, media = 0;

        //Solicitando informações ao usuario
        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();

        System.out.print("Digite a nota 1: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        nota2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        nota3 = sc.nextDouble();

        //Calculando a media
        media = ((nota1 + nota2 + nota3) / 3);

        //Verificando se o aluno foi aprovado, reprovado ou se esta em recuperação
        if (media >= 7) {
            System.out.print("Aluno(a) " + nome + " aprovado com media " + media + ".");
        } else if (media <= 5) {
            System.out.print("Aluno " + nome + " reprovado com media " + media + ".");
        } else {
            System.out.print("Aluno " + nome + " em recuperação com media " + media + ".");
        }

    }
}
