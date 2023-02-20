/*
 * Escreva um algoritmo que leia o nome de um aluno e as notas das três provas 
 * que ele obteve no semestre. No finalinformar o nome do aluno e a sua média 
 * (aritmética);
 */
package exercicio5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando as variaveis
        String nome;
        double nota1, nota2, nota3, media;
        media = 0;
        Scanner sc = new Scanner(System.in);

        //Solicitando o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();

        //Solicitando a nota 1 do aluno
        System.out.print("Digite a nota 1 do aluno: ");
        nota1 = sc.nextDouble();

        //Solicitando a nota 2 do aluno
        System.out.print("Digite a nota 2 do aluno: ");
        nota2 = sc.nextDouble();

        //Solicitando a nota 3 do aluno
        System.out.print("Digite a nota 3 do aluno: ");
        nota3 = sc.nextDouble();

        //Calculando a media do aluno
        media = ((nota1 + nota2 + nota3) / 3);

        //Retornando o valor ao usuario
        System.out.println("O nome do aluno é: " + nome);
        System.out.println("A media do aluno é: " + media);
    }
}
