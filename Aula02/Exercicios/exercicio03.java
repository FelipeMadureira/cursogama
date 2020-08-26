package Exercicios;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2;
        
        System.out.print("Preencha o primeiro número: ");
        num1 = entrada.nextDouble();
        System.out.print("Preencha o segundo número: ");
        num2 = entrada.nextDouble();

        if (num1 == num2) {
            System.out.print("Os dois números são iguais (" + num1 + ")");
        } else if (num1 > num2){ 
            System.out.print("O primeiro número (" + num1 + ") é maior que o segundo (" + num2 + ")");
        } else {
            System.out.print("O segundo número (" + num2 + ") é maior que o primeiro (" + num1 + ")");
        }

        entrada.close();
    }
}