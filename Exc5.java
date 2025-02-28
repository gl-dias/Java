import java.util.*;

public class Exc5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int t;
        System.out.println("Informe os segundos");
        t = teclado.nextInt();
        int horas = t / 3600;
        int minutos = (t % 3600) / 60;
        int segundos = t % 60;

        System.out.println("Horas = " + horas + "; Minutos = " + minutos + "; Segundos = " + segundos);
    }
}