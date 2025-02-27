import java.util.*;

public class Exc13 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe o número de alunos");
        int n = numeros.nextInt();
        System.out.println("Informe as notas do alunos");
        float soma = 0;
        float media = 0;
        float nota;



        for (int i = 0; i < n; i++){
            nota = numeros.nextFloat();
            soma += nota;
        }

        media = soma / n;
        System.out.println(media);

    }
        
    
}
