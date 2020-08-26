package exercicios;

import java.util.Scanner;

/*Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. 
A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 
(A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal. 
*/

public class Ex1005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double nota1, nota2, media;

        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f" , media);
        entrada.close();    
    }
}