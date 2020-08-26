package Exercicios;

import java.util.Scanner;
/* Verificar de 3 medidas forma um triângulo.
Sendo um triângulo, identificar se é um triângulo equilátero, isósceles ou escaleno
*/
public class exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c;
        
        System.out.print("Digite o primeiro parâmetro: ");
        a = entrada.nextDouble();

        System.out.print("Digite o segundo parâmetro: ");
        b = entrada.nextDouble();

        System.out.print("Digite o terceiro parâmetro: ");
        c = entrada.nextDouble();

        if ( (a > b + c) || (b > a + c) || (c > a + b) ){
            // se um lado for maior que a soma dos outros dois não forma um triângulo
            System.out.print("Os parâmetros passado não formam um triângulo! a=" + a + " b=" + b + " c=" + c);
        } else {
            if ((a == b) && (a == c)) {
                // Todos os lados iguais temos um triângulo equilátero
                System.out.print("Você tem um triângulo equilátero, todos os lados tem o mesmo comprimento de " + a);
            } else {
                if ((a == b) || (b == c) || (a == c)){
                    // Caso dois lados sejam iguais, temos um triângulo isósceles
                    System.out.print("Você tem um triângulo isósceles, com dois lados iguais e um diferente a=" + a + " b=" + b + " c=" + c);
                } else { 
                    if (a <= 2000) {
                        // Triângulo escaleno
                        System.out.print("Você tem um triângulo escaleno, com os lados a=" + a + " b=" + b + " c=" + c);
                    }
                }
            }
        }
        entrada.close();
    }
}