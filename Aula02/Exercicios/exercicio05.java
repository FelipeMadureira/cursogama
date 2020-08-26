package Exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;
        
        System.out.print("Digite a senha: ");
        senha = entrada.nextLine();
        boolean  resultado;

        resultado = senha.equals("R10p5");
        
        if (resultado == true) {
            System.out.print("Acesso concedido!");
        } else {
            System.out.print("Acesso negado!");
        }

        entrada.close();
    }
}