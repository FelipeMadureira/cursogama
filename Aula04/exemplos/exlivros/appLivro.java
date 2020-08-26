package exemplos.exlivros;

public class appLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Programando em Java", "Deitel", 500, 2010);
        Livro livro2 = new Livro("Java Extremo", "Deitel Jr", 429, 2017);

        /*livro1.titulo = "Programando em Java";
        livro1.autor = "Deitel";
        livro1.paginas = 500;
        livro1.anoPublicacao = 2010;*/

        livro1.exibirDados();
        System.out.println("Páginas:" + livro1.numeroPaginas());

        livro2.exibirDados();
        System.out.println("Páginas:" + livro2.numeroPaginas());
    }
}