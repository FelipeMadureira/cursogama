package exemplos;

// Exemplo02 - retorno do método

public class Exemplo02 {
    public static void main(String[] args) {
        int resultado;
        
        resultado = soma (10,5);

        System.out.println(resultado);
    }

    public static int soma(int a, int b){
        int resp;  // variavel LOCAL ao método soma
        
        resp = a + b;

        return resp;
    }

}