import java.util.*;

public class Exc11 {
    public static void main(String[] args) {
        Scanner caracteres = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        Float a = caracteres.nextFloat();
        System.out.println("Informe o segundo número");
        float b = caracteres.nextFloat();
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