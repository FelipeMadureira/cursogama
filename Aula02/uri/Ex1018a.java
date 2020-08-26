package uri;
import java.util.Scanner;

public class Ex1018a {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
        */
        Scanner entrada = new Scanner(System.in);
        int valorEntrada, q100, q50, q20, q10, q5, q2, q1;
        double vlInt, temp;

        valorEntrada = entrada.nextInt();

        vlInt = valorEntrada / 100;
        q100 = (int) vlInt;
        temp = valorEntrada - (q100 * 100);

        vlInt = temp / 50;
        q50 = (int) vlInt;
        temp = temp - (q50 * 50);

        vlInt = temp / 20;
        q20 = (int) vlInt;
        temp = temp - (q20 * 20);

        vlInt = temp / 10;
        q10 = (int) vlInt;
        temp = temp - (q10 * 10);

        vlInt = temp / 5;
        q5 = (int) vlInt;
        temp = temp - (q5 * 5);

        vlInt = temp / 2;
        q2 = (int) vlInt;
        temp = temp - (q2 * 2);

        q1 = (int)temp;

        System.out.print(valorEntrada + "\n" + q100 + " nota(s) de R$ 100,00\n" + q50 + " nota(s) de R$ 50,00\n" + q20 + " nota(s) de R$ 20,00\n" + q10 + " nota(s) de R$ 10,00\n" + q5 + " nota(s) de R$ 5,00\n" + q2 + " nota(s) de R$ 2,00\n" + q1 + " nota(s) de R$ 1,00\n");
        
        entrada.close();
    }
}