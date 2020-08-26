package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numPositivo;
        Double num, soma, porcPositivo, media;
        final int QTDENUM= 4; // Quantidade de numeros

        soma = 0.0;
        numPositivo = 0;
        for (int i = 1; i <= QTDENUM; i++) {
            System.out.printf("Digite um número (%d / %d): " , i , QTDENUM);
            num = entrada.nextDouble();
            soma = soma + num;

            if (num >= 0){
                numPositivo++;
            }

        }
        media = soma / QTDENUM;
        porcPositivo = ((double)numPositivo / QTDENUM) * 100 ;

        System.out.printf("Soma dos valores: %.2f" , soma);
        System.out.print("\nQuantidade de números positivo: " + numPositivo);
        System.out.printf("\nMedia dos valores: %.2f" , media);
        System.out.printf("\nPorcentagem de números positivos: %.2f %%" , porcPositivo);

        entrada.close();
    }
}