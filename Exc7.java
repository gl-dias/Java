import java.util.*;

public class Exc7 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe um número");
        int n = numeros.nextInt();
        int resultado;

        resultado = n%2;

        if (resultado == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

    }
}
