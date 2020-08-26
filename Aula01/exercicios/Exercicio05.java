package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double km, milha, jarda, pe, polegada;

        // entrada de valor em km
        System.out.print("Preencha a quantidade de Km: ");
        km = entrada.nextDouble();

        /* Calculos
           1 pé = 12 polegadas
           1 jarda = 3 pés
           1 milha = 1760 jardas
           1 km = 0,62137 milhas
        */
        milha = km * 0.62137;
        jarda = milha * 1760;
        pe = jarda * 3;
        polegada = pe * 12;

        // exibir valores calculados
        System.out.println("\nPara " + km + " km, temos:");
        System.out.println(milha + " milha(s)");
        System.out.println(jarda + " jarda(s)");
        System.out.println(pe + " pé(s)");
        System.out.println(polegada + " polegada(s)");

        entrada.close();
    }
}