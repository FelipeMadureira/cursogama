package uri;
import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        /*
        Media de 3 notas, sendo n1 peso 2, n2 peso 3 e n3 peso 5
        */
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, media;

        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) /10;

        System.out.printf("MEDIA = %.1f\n" , media );
        
        entrada.close();
    }
}