package exercicios;

import java.util.Scanner;

public class Exercicio02a {
    public static void main(String[] args) {
        int n1, n2, n3, menor;
        
        n1 = entrada();
        n2 = entrada();
        n3 = entrada();

        menor = encontraMenor(n1, n2, n3);

        System.out.println("O menor número digitado é " + menor);
    }

    public static int entrada(){
        Scanner entrada = new Scanner(System.in);
        int n1 = 10;
        
        System.out.print("Digite um número: ");
        n1 = entrada.nextInt(); 
        
        entrada.close();
        return n1;
    }

    public static int encontraMenor(int n1, int n2, int n3){
        if(n1 <= n2 && n1 <= 3){
            return n1;
        } else {
            if(n2 <= n3){
                return n2;
            } else {
                return n3;
            }
        }
        
    }
}