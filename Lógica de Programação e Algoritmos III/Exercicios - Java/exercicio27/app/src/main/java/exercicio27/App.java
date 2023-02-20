/*
 * A concessionária de veículos “CARANGO” está vendendo os seus veículos com 
 * desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o valor a 
 * ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo 
 * de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com 
 * valor do veículo zero encerra entrada de dados. Informe total de desconto e 
 * total pago pelos clientes;
 */
package exercicio27;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declaração de variaveis
        Scanner sc = new Scanner(System.in);
        double valorInicial, valorFinal, valorDesconto = 0.0;
        int opcao;

        //Solicitando ao usuario o valor do veiculo
        System.out.print("Qual o valor do veiculo?: ");
        valorInicial = sc.nextDouble();

        //Se o valor do veiculo for diferente que zero 
        if (valorInicial != 0.0) {
            //Solicita ao usuario qual o tipo de combustivel do veiculo
            System.out.println("Qual o tipo de combustivel do veiculo?: ");
            System.out.println("1. Álcool;");
            System.out.println("2. Gasolina");
            System.out.println("3. Diesel");
            System.out.print("Digite aqui a sua opção: ");
            opcao = sc.nextInt();

            //Caso não for uma das opções validas ira permanecer no laço até o usuario digitar uma opção valida
            while (opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.println("Opção inválida. Qual o tipo de combustivel do veiculo?: ");
                System.out.println("1. Álcool;");
                System.out.println("2. Gasolina");
                System.out.println("3. Diesel");
                System.out.print("Digite aqui a sua opção: ");
                opcao = sc.nextInt();
            }

            //ira calcular o desconto conforme o tipo de combustivel
            switch (opcao) {
                case 1: //Se opção for igual a 1 é Álcool
                    valorDesconto = valorInicial * 0.25;
                    break;
                case 2: //Se opção for igual a 2 é Gasolina
                    valorDesconto = valorInicial * 0.21;
                    break;
                case 3: //Se opção for igual a 3 é Diesel
                    valorDesconto = valorInicial * 0.14;
                    break;
            }

            //Calcula o valor final do veiculo
            valorFinal = valorInicial - valorDesconto;
            //Retorna informações ao usuario
            System.out.println("O valor do desconto foi de R$ " + valorDesconto);
            System.out.println("O valor final pago pelo cliente foi de R$ " + valorFinal);
        } else { //Caso o valor do veiculo for igual a R$ 0, retorna a seguinte mensagem ao usuario
            System.out.println("Veiculo com valor igual a R$ 0");
        }

    }
}
