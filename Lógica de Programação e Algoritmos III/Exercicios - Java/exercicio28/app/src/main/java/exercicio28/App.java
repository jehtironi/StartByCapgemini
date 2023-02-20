/*
 * Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 
 * funcionários de acordo com os seguintes critérios:
 *   a. 50% para aqueles que ganham menos do que três salários mínimos;
 *   b. 20% para aqueles que ganham entre três até dez salários mínimos;
 *   c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
 *   d. 10% para os demais funcionários.
 * Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule 
 * o seu novo salário  * reajustado. Escrever o nome do funcionário, o reajuste e 
 * seu novo salário. Calcule quanto à empresavai aumentar sua folha de pagamento;
 */
package exercicio28;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        int numF = 0;
        double aumento, salarioMinimo, valorSalario, valorSalarioAumento, valorTotal = 0, valorTotalAumento = 0;
        String nome;

        //Solicitando ao usuario o valor do salario minimo
        System.out.print("Informe o valor do salario minimo: R$ ");
        salarioMinimo = sc.nextDouble();

        //Enquanto o numero de funcionarios for menor que os da empresa permanece no laço
        while (numF <= 4) {
            //Solicitando o nome do usuario
            System.out.print("Digite o seu nome: ");
            nome = sc.next();

            //Solicitando o salario da pessoa
            System.out.print("Digite o valor do salario do individuo: R$ ");
            valorSalario = sc.nextDouble();
            valorTotal = valorTotal + valorSalario;

            if (valorSalario < (3 * salarioMinimo)) { //Se o salario for menos do que três salários mínimos o aumento vai ser de 50%
                aumento = valorSalario * 0.5;
            } else if (valorSalario >= (3 * salarioMinimo) && valorSalario < (10 * salarioMinimo)) { //Se o salario for entre três até dez salários mínimos o aumento vai ser de 50%
                aumento = valorSalario * 0.2;
            } else if (valorSalario >= (10 * salarioMinimo) && valorSalario < (20 * salarioMinimo)) { //Se o salario for acima de dez até vinte salários mínimos o aumento vai ser de 50%
                aumento = valorSalario * 0.15;
            } else { //Para os outros salarios o aumento vai ser de 50%
                aumento = valorSalario * 0.10;
            }

            valorSalarioAumento = valorSalario + aumento; //Calculando o salario final do funcionario
            valorTotalAumento = valorTotalAumento + aumento; //Calculando quanto a empresa vai gastar a mais com o aumento dos salarios
            numF++;

            //Retornando o valor do aumento e do novo salario ao usuario
            System.out.println("O funcionario " + nome + " tera um aumento de R$ " + aumento + " ficando com um salario de R$ " + valorSalarioAumento);
        }

        //Retorna a quantidade gasta com o total do aumento do salario dos funcionarios
        System.out.println("A empresa tera um aumento de R$ " + valorTotalAumento + " na folha de pagamento. ");

    }
}
