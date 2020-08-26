package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, soma;
        
        num = 1;
        soma = 0;
        while ( num != 0 ) {
            System.out.print("Digite um número: ");
            num = entrada.nextInt();
            soma += num;                    
        }

        System.out.println("A soma dos valores é " + soma);

        entrada.close();
    }
}