package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int par, impar, cont, num;
        double resto;
        final int QTDENUM= 10; // Quantidade de numeros
        
        par = 0;
        impar = 0;
        cont = 1;
        while ( cont <= QTDENUM ) {
            System.out.printf("Digite um número (%d / %d): " , cont , QTDENUM);
            num = entrada.nextInt();

            resto = num % 2;
            if (resto == 0){
                par ++;
            } else {
                impar ++;
            }

            cont++;
        }

        System.out.println("O total de par(es) é: " + par + "\nO total de impar(es) é: " + impar );

        entrada.close();
    }
}