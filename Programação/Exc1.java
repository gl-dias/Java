import	java.util.*;

public class Exc1 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Escolha o primeiro número");
        int a = numeros.nextInt();
        System.out.println("Escolha o segundo número");
        int b = numeros.nextInt();

        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a+b);
        
    }
}
