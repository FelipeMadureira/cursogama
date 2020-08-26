package exemplos.exlivros;

public class Livro {
    //atributos
    String titulo, autor;
    int paginas, anoPublicacao;

    //construtor
    Livro(String novoTitulo, String novoAutor, int pg, int novoAnoPublicacao){
        //this se refere ao proprio objeto
        this.titulo = novoTitulo;
        this.autor = novoAutor;
        this.paginas = pg;
        this.anoPublicacao = novoAnoPublicacao;
    }

    //metodos
    void exibirDados(){
        System.out.println(titulo + ": " + autor + " - " + anoPublicacao);
    }

    int numeroPaginas(){
        return paginas;
    }


}