import java.util.*;

public class Exc10 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Informe um número");
        int numero = num.nextInt();
        System.out.println("Informe o inicio do intervalo");
        int antecessor = num.nextInt();
        System.out.println("Informe o fim do intervalo");
        int sucessor = num.nextInt();
        
        
        if (numero > antecessor && numero < sucessor) {
            System.out.println("O número está no intervalo");
        } else if (numero > sucessor) {
            System.out.println("O número está depois do intervalo");
        } else {
            System.out.println("O número está antes do intervalo");
        }
        
    }
}