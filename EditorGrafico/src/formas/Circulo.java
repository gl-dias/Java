package formas;

public class Circulo {
    private int x, y;
    private float raio;

    public Circulo(int x, int y, float raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo outroCirculo) {
        this.x = outroCirculo.x;
        this.y = outroCirculo.y;
        this.raio = outroCirculo.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return raio;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desenhar() {
        System.out.printf("Circulo(%d, %d, %f)\n",
                x, y, raio);
    }

    public void redimensionar(float sx) {
        if (sx > 0) {
            raio = (int) ((sx / 100 + 1) * raio);
        }
    }

    public void dividir(float x) {
        if (x > 0) {
            raio = (int) (raio / x);
        }
    }
}
