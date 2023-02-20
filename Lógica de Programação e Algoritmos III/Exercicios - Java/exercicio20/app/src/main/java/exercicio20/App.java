/*
 * A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
 * um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
 * desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
 * sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
 * Informar total de carros com ano até 2000 e total geral;
 */

package exercicio20;

//Importa o método Scanner para ser utilizado
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        //Declaração de variaveis
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        float porcentagemDesconto = 0.0f;
        int fim = 1;
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        //Inicializando o Scanner
        Scanner leitor = new Scanner(System.in);

        //Enquanto fim == 1 irá permanecer no laço de repetição
        while (fim == 1) {
            //Solicita ao usuario o ano de fabricação do carro
            System.out.print("Digite o ano de fabricação do carro: ");
            anoFabricacao = leitor.nextInt();
            
            System.out.println("");

            //Solicita ao usuario o valor do carro
            System.out.print("Digite o valor do carro: ");
            valorCarro = leitor.nextInt();
            
            //Verifica o ano de fabricação do carro para setar um valor de desconto
            if (anoFabricacao <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            
            System.out.println("");
            
            totalCarros++; //Incrementa + 1 carro
            valorDesconto = valorCarro * porcentagemDesconto; //Calcula o valor do desconto
            valorPagar = valorCarro - valorDesconto; //Calcula o valor total que será pago

            //Retorna as informações ao usuario
            System.out.println("O valor do desconto foi de: R$ " + valorDesconto);
            System.out.println("O valor que deve ser pago é de: R$ " + valorPagar);
            
            System.out.println("");

            //Solicita ao usuario se ele deseja continuar calculando os valores dos carros
            System.out.print("Deseja repetir? Digite 1 se sim.");
            fim = leitor.nextInt();
        }
        
        System.out.println("\n\n");
        
        //Retorna as informações ao usuario
        System.out.println("Total de carros semi novos:  " + totalCarrosSemiNovos);
        System.out.println("Total de carros:  " + totalCarros);

    }
}
