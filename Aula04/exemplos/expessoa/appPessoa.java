package exemplos.expessoa;

public class appPessoa {
    public static void main(String[] args) {
        //declara uma variavel do tipo pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Felipe";
        pessoa2.nome = "Madureira";

        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}