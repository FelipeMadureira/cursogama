package exercicios.exveiculos;

public class appVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo0 = new Veiculo("Gol", "Volkwagen", 9.95);
        Veiculo veiculo1 = new Veiculo("208", "Peugeot", 9.75);

        veiculo0.dadosVeiculo();
        System.out.println("O consumo do veículo é " + veiculo1.consumo() + "\n");

        veiculo1.dadosVeiculo();
        System.out.println("O consumo do veículo Km/l é " + veiculo1.consumo());
    }
}