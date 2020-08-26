package uri;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        /*
        Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
        */
        Scanner entrada = new Scanner(System.in);
        double vlUnit1, vlUnit2, vlPagar;
        int codP1, numP1, codP2, numP2;

        codP1 = entrada.nextInt();
        numP1 = entrada.nextInt();
        vlUnit1 = entrada.nextDouble();

        codP2 = entrada.nextInt();
        numP2 = entrada.nextInt();
        vlUnit2 = entrada.nextDouble();

        vlPagar = (numP1 * vlUnit1) + (numP2 * vlUnit2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , vlPagar );
        
        entrada.close();
    }
}