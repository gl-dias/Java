package formas;

public class Retangulo {
    private int x;
    private int y;
    private int largura;
    private int altura;

    public Retangulo(int x, int y, int largura, int altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(int x, int y, int lado) {
        this.x = x;
        this.y = y;
        this.largura = lado;
        this.altura = lado;
    }

    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void desenhar() {
        System.out.printf("Retangulo(%d, %d, %d, %d)\n",
                x, y, largura, altura);
    }
    public void redimensionar(float sx, float sy) {
        if (sx > 0 && sy > 0) {
            largura = (int) ((sx / 100 + 1) * largura);
            altura = (int) ((sy / 100 + 1) * altura);
        }
    }
    public void dividir(float x, float y) {
            if (x > 0 && y > 0) {
                largura = (int) (largura/x);
                altura = (int) (altura/y);
            }
        }
    }



