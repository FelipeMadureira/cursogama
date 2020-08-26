package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num, soma;
        String texto;
        char continua = 's';

        soma = 0;
        while ( continua == 's' || continua == 'S') {
            System.out.print("Digite o próximo número: ");
            texto = entrada.nextLine();
            num = Integer.parseInt(texto);
            soma += num; //soma = soma + num;
            
            System.out.print("Deseja continuar? (s/n): ");
            //pega primeiro caracter da String digitada
            continua = entrada.nextLine().charAt(0);
        }

        System.out.print("A soma calculada foi " + soma);
        entrada.close();
    }
}