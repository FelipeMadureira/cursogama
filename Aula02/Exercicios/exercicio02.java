package Exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.print("Preencha a primeira nota (peso 40%): ");
        nota1 = entrada.nextDouble();
        System.out.print("Preencha a segunda nota (peso 60%): ");
        nota2 = entrada.nextDouble();

        media = ((nota1 * 4) + (nota2 * 6)) / 10;

        if (media >= 6) {
            System.out.printf("Aluno aprovado! Com média %.2f\n" , media);
        } else { 
            System.out.printf("Aluno reprovado! Com média %.2f\n" , media);
        }

        entrada.close();
    }
}