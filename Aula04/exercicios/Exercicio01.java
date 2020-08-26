package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String tipo;

        System.out.print("Digite um número: ");
        num = entrada.nextInt();
     
        tipo = tipoNum(num); // Verificar se é par ou impar
        System.out.println("O número digitado é " + tipo);

        if(isPar(num)){
            System.out.println("(boolean) O número digitado é Par");
        } else {
            System.out.println("(boolean) O número digitado é Impar");
        }

        entrada.close();
    }

    public static String tipoNum(int a) {
        int resto;
        String tipo;

        resto = a % 2;

        if (resto == 0){
            tipo = "Par";
        } else {
            tipo = "Impar";
        }

        return tipo;
    }

    public static boolean isPar(int num){
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
        // return (num % 2 == 0); fução acima resumida
    }
}