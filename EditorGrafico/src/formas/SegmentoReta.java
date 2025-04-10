package formas;

public class SegmentoReta {

    private Ponto ponto1;
    private Ponto ponto2;

    public SegmentoReta(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public SegmentoReta(float x1, float y1, float x2, float y2) {

    }

    public float tamano() {
        int a = 0;
        int b = 0;
        if (ponto1.getX() > ponto2.getX()) {
            a = (ponto1.getX() - ponto2.getX());
        } else {
            a = (ponto2.getX() - ponto1.getX());
        }
        if (ponto1.getY() > ponto2.getY()) {
            b = (ponto1.getY() - ponto2.getY());
        } else {
            b = (ponto2.getY() - ponto1.getY());
        }
        float h = (a * a) + (b * b);
        h = (float) Math.sqrt(h);
        System.out.println(h);
        return h;
    }
}
