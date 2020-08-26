package exercicios.exRelogio;

import java.util.Scanner;

public class appRelogio {
    public static void main(String[] args) {
        String opcao = "z";
        Scanner teclado = new Scanner(System.in);
        Relogio relogio = new Relogio(19, 59, 56);

        relogio.exibirHora();
        while (opcao.charAt(0) != 'x'){
            System.out.println("Opções do relógio:\na - avançar  / r - retroceder  / e - exibir / x - encerrar");
            opcao = teclado.nextLine();

            if (opcao.charAt(0) == 'a'){
                relogio.avancaHora();
                relogio.exibirHora();
            }

            if (opcao.charAt(0) == 'r'){
                relogio.retrocedeHora();
                relogio.exibirHora();
            }

            if (opcao.charAt(0) == 'e'){
                relogio.exibirHora();
            }
        }

        teclado.close();
    }
}