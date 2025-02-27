import java.util.*;

public class Exc12 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        int a = numeros.nextInt();
        System.out.println("Informe o segundo número");
        int b = numeros.nextInt();
        int soma;
        
        if (a < b) {   
            for (int i = a; i < b; i++) {
                soma = i++;
                System.out.println(soma);
            }
        } else {
            for (int i = a; i > b; i--) {
                soma = i--;
                System.out.println(soma);
            }
        }
    }
}
