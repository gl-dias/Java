import	java.util.*;

public class Exc3 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe o salário");
        float salario = numeros.nextInt();
        System.out.println("Informe o percentual de aumento");
        float aumento = numeros.nextFloat();

        salario = salario * (1+aumento/100);
        System.out.println(salario);

        
    }
}