package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palavra = "Felipe Madureira";
        int quantVogal;

        quantVogal = encontraVogal(palavra);

        System.out.println("Existe(m) " + quantVogal + " vogal(is) na palavra " + palavra);

        entrada.close();
    }

    public static int encontraVogal(String palavra){
        int contVogal = 0;

        for (int i = 0; i < palavra.length(); i++)  {
            if(palavra.toLowerCase().charAt(i) == 'a' || 
               palavra.toLowerCase().charAt(i) == 'e' || 
               palavra.toLowerCase().charAt(i) == 'i' || 
               palavra.toLowerCase().charAt(i) == 'o' || 
               palavra.toLowerCase().charAt(i) == 'u') 
            {
                contVogal++;
            }    
        }

        return contVogal;
    }
}