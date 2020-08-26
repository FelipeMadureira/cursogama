package exercicios.exLivroEletronico;

public class LivroEletronico {
    private String titulo, autor;
    private int totPag, pagAtual;

    // construtor
    LivroEletronico(String titulo, String autor, int totPag, int pagAtual){
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = pagAtual;
    }

    //metodos
    public void avancaPag(){
        if (pagAtual < totPag){
            pagAtual++;
        }
    }

    public void retrocedePag(){
        if (pagAtual > 0){
            pagAtual--;
        }
    }

    public void irPag(int pag){
        if (pag <= totPag && pag >= 0){
            pagAtual = pag;
        }
    }

    void exibirPag(){
        System.out.println("Pagina " + pagAtual);
    }

    void mostraCapa(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de Páginas: " + totPag + "\n");
    }
}