/*
 * Faça um algoritmo que receba o preço de custo e o preço de venda de 40 
 * produtos. Mostre como resultadose houve lucro, prejuízo ou empate para cada 
 * produto. Informe o valor de custo de cada produto, o valor de venda de cada 
 * produto, a média de preço de custo e do preço de venda;
 */
package exercicio22;

//Importa o método Scanner para ser utilizado
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //Inicializa o Scanner
        Scanner leitor = new Scanner(System.in);

        //Declaração de variaveis
        String nomeProduto;
        int i;
        float precoCusto, precoVenda, totalCusto = 0, totalVenda = 0;

        for (i = 0; i < 3; i++) {
            //Solicita ao usuario o nome do produto
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.nextLine();

            //Solicita ao usuario o preço de custo do produto
            System.out.println("Digite o preço de custo: ");
            precoCusto = leitor.nextFloat();

            //Solicita ao usuario o preço de venda do produto
            System.out.println("Digite o preço de venda: ");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto; //Calcula o custo total dos produtos
            totalVenda = totalVenda + precoVenda; //Calcula o valor total da venda dos produtos

            if (precoCusto == precoVenda) { //Verifica se o preço de custo e de venda são iguais
                System.out.println("Houve empate entre o preço de custo e o de venda.");
            } else if (precoCusto > precoVenda) { //Verifica se o preço de custo é maior que o preço de venda
                System.out.println("Houve um prejuizo.");
            } else { //Verifica se o preço de venda é maior que o de custo
                System.out.println("Houve um lucro.");
            }

            //Retorna as informações ao usuario
            System.out.println(nomeProduto + ", preço do produto = R$ " + precoCusto + ", preço de venda = R$ " + precoVenda);

        }

        //Calcula e retorna ao usuario as medias do preço de custo e de venda
        System.out.println("A média do preço de custo é de: " + (totalCusto / i));
        System.out.println("A média do preço de venda é de: " + (totalVenda / i));
    }
}
