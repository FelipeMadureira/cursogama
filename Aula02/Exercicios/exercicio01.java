package Exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        double metade;
        
        System.out.print("Preencha um número: ");
        num = entrada.nextInt();

        if (num > 20){
            metade = num / 2.0;
            System.out.printf("A metade do número é %.2f\n" , metade);
        }

        entrada.close();
    }
}