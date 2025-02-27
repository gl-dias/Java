import java.util.*;

public class Exc6 {
    public static void main(String[] args) {
        Scanner carro = new Scanner(System.in);
        System.out.println("Informe a distância");
        int distancia = carro.nextInt();
        System.out.println("Informe o tempo");
        int tempoGasto = carro.nextInt();
        System.out.println("Informe o gasto de combustivel");
        int quantidadeGasolina = carro.nextInt();
        int consumoCombustivel;
        int velocidadeMedia;

        velocidadeMedia = distancia/tempoGasto;
        consumoCombustivel = distancia/quantidadeGasolina;

        System.out.println(velocidadeMedia + "Km/h");
        System.out.println(consumoCombustivel + "Km/L");

    }
}
