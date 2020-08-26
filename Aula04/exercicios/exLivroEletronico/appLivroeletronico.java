package exercicios.exLivroEletronico;

import java.util.Scanner;

public class appLivroeletronico {
    public static void main(String[] args) {
        String opcao = "i";
        Scanner teclado = new Scanner(System.in);

        LivroEletronico livro1 = new LivroEletronico("Curso Java", "Manoel", 123, 0);
        
        System.out.print("Bem vindo ao Livro\n");
        livro1.mostraCapa();

        System.out.println("Você está na capa");

        while (opcao.charAt(0) != 'x'){
            System.out.println("a - avançar página / r - retornar página / e - exibir pagina / m - mostrar capa / número da página para ir até a página / x - encerrar");
            opcao = teclado.nextLine();

            if (opcao.charAt(0) == 'a'){
                livro1.avancaPag();
                livro1.exibirPag();
            }

            if (opcao.charAt(0) == 'r'){
                livro1.retrocedePag();
                livro1.exibirPag();
            }

            if (opcao.charAt(0) == 'e'){
                livro1.exibirPag();
            }

            if (opcao.charAt(0) == 'm'){
                livro1.mostraCapa();
            }
        }
        
        teclado.close();
    }
}