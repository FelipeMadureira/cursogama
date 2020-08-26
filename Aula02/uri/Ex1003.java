package uri;
import java.util.Scanner;

public class Ex1003 {
    public static void main(String[] args) {
        /*
        Ler dois valores e mostrar resultado da SOMA
        */
        Scanner entrada = new Scanner(System.in);
        int a, b, soma;

        a = entrada.nextInt();
        b = entrada.nextInt();

        soma = a + b;

        System.out.print("SOMA = " + soma + "\n");

        entrada.close();
    }
}