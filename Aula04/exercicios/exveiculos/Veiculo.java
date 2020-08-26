package exercicios.exveiculos;

public class Veiculo {
    String modelo, marca;
    double consumo;

    //construtor
    Veiculo(String modelo, String marca, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }

    //metodos
    void dadosVeiculo(){
        System.out.println("O veiculo é da marca " + marca + " modelo " + modelo);
    }

    double consumo(){
        return consumo;
    }
}