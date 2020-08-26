package Exercicios;

import java.util.Scanner;
// Calcular desconto do INSS
public class exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, desconto;
        
        System.out.print("Digite o salário: ");
        salario = entrada.nextDouble();

        if (salario <= 600) {
            System.out.print("Salário isento de desconto!");
        } else {
            if (salario <= 1200) {
                desconto = salario * 0.20;
                System.out.printf("Desconto de 20%%, sendo R$%.2f\n" , desconto);
            } else { 
                if (salario <= 2000) {
                    desconto = salario * 0.25;
                    System.out.printf("Desconto de 25%%, sendo R$%.2f\n" , desconto);
                } else {
                    desconto = salario * 0.30;
                    System.out.printf("Desconto de 30%%, sendo R$%.2f\n" , desconto);
                }
            }
        }

        entrada.close();
    }
}