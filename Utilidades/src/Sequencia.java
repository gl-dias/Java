public class Sequencia {
    private int inicio;
    private int fim;

    public Sequencia(int inicio, int fim) {
        if (inicio > fim) {
            this.inicio = fim;
            this.fim = inicio;
        } else {
            this.inicio = inicio;
            this.fim = fim;
        }
    }

    public void mostrarSequencia() {
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }
    }

    public void mostrarSequencia(int p) {
        for (int i = inicio; i <= fim; i+=p) {
            System.out.print(i + " ");
        }
    }




}
