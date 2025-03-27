import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner teclado = new Scanner(System.in);
//        int inicio = teclado.nextInt();
//        int fim = teclado.nextInt();
//
//        Sequencia sequencia = new Sequencia(inicio, fim);
//        sequencia.mostrarSequencia(2);
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int ano = sc.nextInt();

        Data data = new Data(ano, mes, dia);
        data.ehValida();
        data.mostrar();

    }
}