import java.util.*;

public class Exc15 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe os caracteres");
        char caracteres = ' ';
        int vogais = 0;
        int digitos = 0;
        int outros = 0;

        while (caracteres != '.') {
            caracteres = numeros.next().charAt(0);
            if (caracteres == '.') {
                break;
            }else if (caracteres == '0' || caracteres == '1' || caracteres == '2' || caracteres == '3' || caracteres == '4' || caracteres == '5' || caracteres == '6' || caracteres == '7' || caracteres == '8' || caracteres == '9') {
                digitos++;
            }else if (caracteres == 'a' || caracteres == 'e' || caracteres == 'i' || caracteres == 'o' || caracteres == 'u' || caracteres == 'A' || caracteres == 'E' || caracteres == 'I' || caracteres == 'O' || caracteres == 'U') {
                vogais++;  
            }else {
               outros++;
            }
        }
        System.out.println("Quantidade de vogais: " + vogais);
        System.out.println("Quantidade de digitos: " + digitos);
        System.out.println("Quantidade de outros caracteres: " + outros);
    }
}
