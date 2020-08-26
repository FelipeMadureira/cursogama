package exemplos;

import java.util.Scanner;

/*
    Como realizar entrada de dados
*/

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;

        System.out.print("Digite um valor inteiro: ");
        valor = entrada.nextInt();

        System.out.println("Você digitou " + valor );

        entrada.close();

    }
}