import java.util.*;

public class Exc11 {
    public static void main(String[] args) {
        Scanner caracteres = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        int a = caracteres.nextInt();
        System.out.println("Informe o segundo número");
        int b = caracteres.nextInt();
        System.out.println("Informe a operação");
        String operacao = caracteres.next();

        switch (operacao) {
            case "/": System.out.println(a/b);
                break;
            case "*": System.out.println(a*b);
                break;
            case "-": System.out.println(a-b);
                break;
            case "+": System.out.println(a+b);
                break;

            default: System.out.println("Escreva um operador válido");
                break;
        }

    }
}