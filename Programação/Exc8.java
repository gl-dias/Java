import java.util.*;

public class Exc8 {
    public static void main(String[] args) {
        Scanner energia = new Scanner(System.in);
        System.out.println("Informe o gasto da casa");
        int kwatts = energia.nextInt();
        System.out.println("Informe o valor do kw");
        float valorKwatts = energia.nextFloat();
        float valorPago;

        valorPago = kwatts*valorKwatts;

        if (valorPago < 150) {
            valorPago = (float) (valorPago*0.9); 
        }else {
            System.out.println(valorPago);
        }

        System.out.println(valorPago);
    }

}