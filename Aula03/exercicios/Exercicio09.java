package exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 1, soma = 0;
                
        while (num != 0) {
            System.out.print("Digite o próximo número (zero finaliza): ");
            num = entrada.nextInt();

            if (num >= 0){
                soma = soma + num;
            }
        }

        System.out.print("\nA soma dos valores é: " + soma);

        entrada.close();
    }
}