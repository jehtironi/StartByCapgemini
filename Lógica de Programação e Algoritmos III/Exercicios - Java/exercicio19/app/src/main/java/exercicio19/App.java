/*
 * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome 
 * e se ela é homem ou mulher. No final informe total de homens e de mulheres;
 */
package exercicio19;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        int i, contF = 0, contM = 0;
        String nome, sexo;

        System.out.println("Informe o nome e o sexo de 56 pessoas: ");
        //Solicitando a idade das pessoas e verificando se são maiores de idade ou não
        for (i = 0; i < 5; i++) {
            System.out.print(i + ". Nome: ");
            nome = sc.nextLine();
            System.out.print(i + ". Sexo (F: Feminino e M: Masculino): ");
            sexo = sc.nextLine();

            //Verificando se é homem ou mulher
            if ("F".equals(sexo)) {
                System.out.println(nome + " é mulher.");
                contF++; //Se for mulher incrementa 1
            } else {
                System.out.println(nome + " é homem.");
                contM++; //Se for homem incrementa 1
            }
        }

        //Retorna ao usuario quantos homens e mulheres tinham
        System.out.println("No programa tinha: ");
        System.out.println(contF + " mulheres.");
        System.out.println(contM + " homens.");
    }
}
