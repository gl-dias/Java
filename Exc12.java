import java.util.*;

public class Exc12 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        int a = numeros.nextInt();
        System.out.println("Informe o segundo número");
        int b = numeros.nextInt();
        int soma = 0;
        int pares = 0;
        
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    soma += i;
                    pares++;
                    System.out.println(i);
                }
            }
        } else {
            for (int i = b; i <= a; i++) {
                if (i % 2 == 0) {
                    soma += i;
                    pares++;
                    System.out.println(i);
                }
                }
        }
        System.out.println("Soma dos números no intervalo: " + soma);
        System.out.println("Média dos números no intervalo: " + (soma / pares));
    }
}
