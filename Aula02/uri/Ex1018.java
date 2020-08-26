package uri;
import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
        */
        Scanner entrada = new Scanner(System.in);
        int valorEntrada, q100, q50, q20, q10, q2, q1;
        double vlInt, temp;
        final double nt100 = 100.00; 
        final double nt50 = 50.00; 
        final double nt20 = 20.00; 
        final double nt10 = 10.00; 
        final double nt2 = 2.00;
        
        valorEntrada = entrada.nextInt();

        vlInt = valorEntrada / nt100;
        q100 = (int) vlInt;
        temp = valorEntrada - (q100 * (int)nt100);

        vlInt = temp / nt50;
        q50 = (int) vlInt;
        temp = temp - (q50 * (int)nt50);

        vlInt = temp / nt20;
        q20 = (int) vlInt;
        temp = temp - (q20 * (int)nt20);

        vlInt = temp / nt10;
        q10 = (int) vlInt;
        temp = temp - (q10 * (int)nt10);

        vlInt = temp / nt2;
        q2 = (int) vlInt;
        temp = temp - (q2 * (int)nt2);

        q1 = (int)temp;

        //System.out.print(valorEntrada + "\n" + q100 + " nota(s) de R$ " + nt100 + "\n" + q50 + " nota(s) de R$ " + nt50 + "\n" + q20 + " nota(s) de R$ " + nt20 + "\n" + q10 + " nota(s) de R$ " + nt10 + "\n" + q2 + " nota(s) de R$ " + nt2 + "\n" + q1 + " nota(s) de R$ " + nt1 + "\n");
        System.out.print(valorEntrada + "\n" + q100 + " nota(s) de R$ 100,00\n" + q50 + " nota(s) de R$ 50,00\n" + q20 + " nota(s) de R$ 20,00\n" + q10 + " nota(s) de R$ 10,00\n" + q2 + " nota(s) de R$ 2,00\n" + q1 + " nota(s) de R$ 1,00\n");
        
        entrada.close();
    }
}