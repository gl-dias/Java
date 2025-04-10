package formas;

public class Retangulo {
    private Ponto ponto;
    private int largura;
    private int altura;

    public Retangulo(int x, int y, int largura, int altura) {
        this.ponto = new Ponto(x, y);
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(int x, int y, int lado) {
        this.ponto = new Ponto(x, y);
        this.largura = lado;
        this.altura = lado;
    }

    public void mover(int x, int y) {
        ponto.mover(x, y);
    }

    public void desenhar() {
        System.out.printf("Retangulo(%d, %d, %d, %d)\n",
                ponto.getX(), ponto.getY(), largura, altura);
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



