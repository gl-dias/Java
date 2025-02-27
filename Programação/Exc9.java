import java.util.*;

public class Exc9 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Informe um número");
        float x = num.nextFloat();
        float arredondando, decimal;

        decimal = x - ((int)x);
        if (decimal >= 0.5) {
            arredondando = x + 1 - decimal;
        } else{
            arredondando = x - decimal;
        }

        System.out.println(arredondando);
    }
}