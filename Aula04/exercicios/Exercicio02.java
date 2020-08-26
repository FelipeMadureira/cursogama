package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, menor;
        
        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();        
        System.out.print("Digite um número: ");
        n2 = entrada.nextInt();        
        System.out.print("Digite um número: ");
        n3 = entrada.nextInt();

        menor = encontraMenor(n1, n2, n3);

        System.out.println("O menor número digitado é " + menor);
        
        entrada.close();
    }

    public static int encontraMenor(int n1, int n2, int n3){
        if(n1 < n2 && n1 < 3){
            return n1;
        } else {
            if(n2 < n3){
                return n2;
            } else {
                return n3;
            }
        }
        
    }
}