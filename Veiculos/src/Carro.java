public class Carro {

    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public float velocidadeMaxima() {
        if (motor.getCilindrada() <= 1.0f) {
            return 140;
        } else if (motor.getCilindrada() <= 1.6f) {
            return 180;
        } else if (motor.getCilindrada() <= 2.0f) {
            return 220;
        } else {
            return 260;
        }
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor.getCilindrada());
        System.out.println("Velocidade: " + velocidadeMaxima());
    }
}
