package exercicios;

import java.util.Scanner;

/*
    Entrada do salario e calcular aumento de 25%
*/

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        // entrada com valor do salario
        System.out.print("Digite o valor do Salário: ");
        salario = entrada.nextDouble();

        // calcular o aumento para novo salario
        novoSalario = salario + (salario * 0.25);

        // saida com novo salario
        System.out.print("O novo salário é: ");
        System.out.printf("%.2f ", novoSalario);

        entrada.close();
    }
}