/*
 * Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. 
 * Sabe-se que o cálculo da conta de luz segue a tabela abaixo: 
 * Tipo de Cliente Valor do KW/h
 *   a. (Residência) 0,60;
 *   b. (Comércio) 0,48;
 *   c. (Indústria) 1,29.
 */
package exercicio35;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        //Declarando variaveis
        Scanner sc = new Scanner(System.in);
        int num = 1, tipoCliente;
        double kwHora;
        
        while(num == 1){
            //Solicitando ao usuario informções
            System.out.println("Informe o tipo de cliente:");
            System.out.println("1 - Residência;");
            System.out.println("2 - Comércio;");
            System.out.println("3 - Indústria;");
            System.out.print("Digite a sua opção: ");
            tipoCliente = sc.nextInt();
            
            System.out.print("Digite KW/h: ");
            kwHora = sc.nextDouble();
            
            //Verifica o tipo de cliente e calcula o valor da conta de luz daquele tipo de cliente
            switch (tipoCliente) {
                case 1:
                    System.out.println("O valor da conta de luz é: R$ " + (kwHora * 0.60));
                    break;
                case 2:
                    System.out.println("O valor da conta de luz é: R$ " + (kwHora * 0.48));
                    break;
                case 3:
                    System.out.println("O valor da conta de luz é: R$ " + (kwHora * 1.29));
                    break;
                default: //Se for um tipo invalido, retorna a seguinte mensagem
                    System.out.println("Tipo de cliente invalido. ");
            }
            
            //Solicita ao usuario se ele deseja continuar com as operações
            System.out.print("Deseja calcular o valor de outra conta de luz? (1. Sim): ");
            num = sc.nextInt();
        }
    }
}
