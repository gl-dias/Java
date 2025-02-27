import	java.util.*;

public class Exc2 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Escolha o primeiro número");
        float a = numeros.nextFloat();
        System.out.println("Escolha o segundo número");
        float b = numeros.nextFloat();

        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a+b);
        
    }
}