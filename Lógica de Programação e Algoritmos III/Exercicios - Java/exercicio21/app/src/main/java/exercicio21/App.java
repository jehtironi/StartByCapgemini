/*
 * Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e 
 * saúde) e informe se está apta ou não para cumprir o serviço militar obrigatório.
 * Informe os totais;
 */
package exercicio21;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner sc = new Scanner(System.in);
        int n = 1, contA = 0, contNA = 0, idade, saude;
        String nome, sexo;

        //Laço de repetição 
        while (n == 1) {

            //Solicitando informações ao usuario
            System.out.print("Digite o nome da pessoa: ");
            nome = sc.next();

            System.out.print("Digite a idade da pessoa: ");
            idade = sc.nextInt();

            System.out.print("Digite o sexo da pessoa (F: Feminino e M: Masculino): ");
            sexo = sc.next();

            System.out.print("Digite a saude da pessoa (1: Boa e 2: Ruim): ");
            saude = sc.nextInt();

            //Verificando se as condições são aceitas
            if (idade >= 18 && idade <= 35 && saude == 1 && sexo.equals("M")) {
                System.out.print(nome + " esta apto para cumprir o serviço militar obrigatorio.");
                contA++;
            } else {
                System.out.print(nome + " não esta apto para cumprir o serviço militar obrigatorio.");
                contNA++;
            }

            System.out.println("");
            System.out.println("");

            //Solicitando ao usuario se deseja continuar
            System.out.print("Deseja verificar outra pessoa? (1. Sim e 2. Não): ");
            n = sc.nextInt();

            System.out.println("");
        }

        //Retornando informações ao usuario
        System.out.println("Quantidade de pessoas aptas ao serviço militar obrigatorio: " + contA);
        System.out.println("Quantidade de pessoas não aptas ao serviço militar obrigatorio: " + contNA);

    }
}
