package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quant, par;
        Double num, soma, percImpar, media, resto;
        
        System.out.print("Digite a quantidade de números que deseja utilizar: ");
        quant = entrada.nextInt();

        soma = 0.0;
        par = 0;
        for (int i = 1; i <= quant; i++) {
            System.out.printf("Digite um número (%d / %d): " , i , quant);
            num = entrada.nextDouble();

            if (num >= 0){
            resto = num % 2;
                if (resto == 0){
                    soma = soma + num;
                    par++;
                }
            } else {
                System.out.println("O número precisa ser positivo! Preencha novamente!");
                i = i - 1;
            }

        }
        media = soma / par;
        percImpar = ((quant - par) / (double)quant) * 100 ;

        System.out.printf("\nA média dos números pares é: %.2f" , media);
        System.out.printf("\nA porcentagem de números impares é: %.2f %%" , percImpar);

        entrada.close();
    }
}