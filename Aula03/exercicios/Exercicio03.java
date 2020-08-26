package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, resultado;
        char continua = 's';

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        resultado = 1;
        System.out.print(resultado);

        while ( continua == 's' ) {
            resultado = resultado * 2;
            
            if ( resultado <= num){
                System.out.print("," + resultado);
            } else {
                continua = 'n';
            }                    
        }

        entrada.close();
    }
}