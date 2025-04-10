public class Main {
    public static void main(String[] args) {

        Motor m1 = new Motor(1.6f);
        Carro c1 = new Carro("polo", m1);

        c1.exibirDados();
    }
}