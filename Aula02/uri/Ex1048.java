package uri;
import java.util.Scanner;

        /*
        Calculo de imposto
        0 - 2000.00 - Isento
        2000.01 - 3000.00 - 8%
        3000.01 - 4500.00 - 18%
        Acima de 4500.00 - 28%
       */

public class Ex1048 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salario, imposto, faixa1, faixa2, faixa3;
                
        salario = entrada.nextDouble();

        if (salario <= 2000) {
            System.out.print("Isento\n");
        } else {
            if (salario <= 3000) {
                faixa1 = salario - 2000;
                imposto = faixa1 * 0.08;
            } else {
                faixa1 = 1000;
                
                if (salario <= 4500) {
                    faixa2 = salario - 3000;
                    imposto = (faixa1 * 0.08) + (faixa2 * 0.18);
                } else {
                    faixa2 = 1500;
                    faixa3 = salario - 4500;
                    imposto = (faixa1 * 0.08) + (faixa2 * 0.18) + (faixa3 * 0.28);
                }
            }
            
            System.out.printf("R$ %.2f\n" , imposto);

        }

        entrada.close();
    }
}