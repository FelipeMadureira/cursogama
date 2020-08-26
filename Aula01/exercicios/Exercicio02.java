package exercicios;

import java.util.Scanner;

/*
    Ler duas notas e calcular a media
*/

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2;

        System.out.print("Digite a primeira nota: ");
        n1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = entrada.nextDouble();

        System.out.println("A média é: " + ((n1 + n2) / 2 ));

        entrada.close();
    }
}