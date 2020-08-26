package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, tabuada, resultado;

        System.out.print("Digite a tabuada desejada: ");
        tabuada = entrada.nextInt();

        cont = 0;
        while ( cont <= 10 ) {
            resultado = cont * tabuada;
            System.out.println(tabuada + " x " + cont + " = " + resultado);
            cont++;
        }

        entrada.close();
    }
}