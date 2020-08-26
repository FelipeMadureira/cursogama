package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(final String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salarioMin, consumoKW, valorKW, valorConta, valorDesc;

        // entrada de dados
        System.out.print("Preencha o valor do salário mínimo: ");
        salarioMin = entrada.nextDouble();
        System.out.print("Preencha o consumo de KW: ");
        consumoKW = entrada.nextDouble();
        
        // Processamentos
        // calcular o valor do quilowatt (custa 1/500 avos do salariominimo)
        valorKW = salarioMin / 500;

        // Valor em real da conta
        valorConta = consumoKW * valorKW;

        // Valor com Desconto de 15%
        valorDesc = valorConta * 0.85;

        // saidas, valor quilowatt, valor em reais da residencia e valor com desconto 15%
        System.out.printf("\nO valor do KW é: R$ %.2f " , valorKW);
        System.out.printf("\nO valor da conta da residência é: R$ %.2f " , valorConta);
        System.out.printf("\nO valor da conta com 15%% de desconto é: R$ %.2f " , valorDesc);
        
        entrada.close();
    }
}