import java.util.*;

public class Exc5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int t;
        float restoSeg,restoMin, restoHora;

        System.out.println("Informe os segundos");
        t = teclado.nextInt();
        restoSeg = t%60;
        restoMin = (t%3600) / 60;
        restoHora = (t/3600);

        System.out.print("Horas = " + restoHora);
        System.out.print("; Minutos = " + restoMin);
        System.out.print("; Segundos = " + restoSeg);
    }
}