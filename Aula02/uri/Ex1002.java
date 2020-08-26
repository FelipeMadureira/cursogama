package uri;

import java.util.Scanner;

public class Ex1002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, area;
        final double n = 3.14159; // valor de PI

        raio = entrada.nextDouble();

        area = n * raio * raio;

        System.out.printf("A=%.4f\n" , area );

        entrada.close();
    }
}