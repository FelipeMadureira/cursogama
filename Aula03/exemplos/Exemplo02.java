package exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        int cont;
        double nota, soma, media;
        final int QTDENOTAS = 4; // Quantidade de notas

        soma = 0; // Acumulador de notas digitadas
        cont = 1;
        while ( cont <= QTDENOTAS ) {
            System.out.printf("Digite a nota (%d / %d): " , cont , QTDENOTAS);
            nota = entrada.nextDouble();
            soma = soma + nota;

            cont++;
        }

        media = soma / QTDENOTAS;

        System.out.printf("A média das notas é: %.2f" , media);

        entrada.close();
    }
}