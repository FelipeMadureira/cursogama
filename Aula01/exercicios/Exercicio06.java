package exercicios;

import java.util.Scanner;

// Calcular a área de um triangulo 

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura, base, area;
        
        // Entrar com altura e base
        System.out.println("Cálculo da área de um triângulo");
        System.out.print("Preencha a altura: ");
        altura = entrada.nextDouble();
        System.out.print("Preencha a base: ");
        base = entrada.nextDouble();

        // area = (altura * base) / 2
        area = (altura * base) / 2;

        // mostrar valor da area
        System.out.println("Um triângulo com altura " + altura + " e base " + base + " tem uma área de " + area);

        entrada.close();
    }
}