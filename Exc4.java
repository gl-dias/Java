import	java.util.*;

public class Exc4 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe o raio:");
        int raio = numeros.nextInt();
        float perimetro, area;
        float pi;

        pi = (float) 3.14;

        perimetro = 2 * pi * raio;
        area = pi * (raio * raio);


        System.out.println("O perimetro é: " + perimetro);
        System.out.println("A area é: " + area);

        
    }
}