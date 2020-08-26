package Exercicios;

import java.util.Scanner;
/* Linha de crédito onde valor maximo da prestação não pode ultrapassar 30% do salario
*/
public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao, perc;
        
        System.out.print("Preencha o salário bruto: ");
        salario = entrada.nextDouble();
        System.out.print("Preencha o valor da prestação: ");
        prestacao = entrada.nextDouble();

        perc = (prestacao / salario) * 100;
        
        if (perc > 30) {
            System.out.print("Emprestimo recusado. O valor da prestação superou 30% permitido (" + perc + "%)");
        } else {
            System.out.print("Emprestimo liberado. O valor da prestação não superou 30% (" + perc + "%)");
        }

        entrada.close();
    }
}