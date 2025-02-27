import java.util.*;
/*Ler notas de alunos até que o usuário digite -1. Ao final imprimir a
quantidade de alunos, a média da turma, a maior nota e a menor
nota */
public class Exc14 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe as notas do alunos");
        float soma = 0;
        int qtdA = 0;

        while (true) {
            float temp = numeros.nextFloat();
            if (temp == -1) {
                break;
            }
            soma += temp;
            qtdA = qtdA + 1;
        }

        float media = soma / qtdA;
        System.out.println(media);

    }    
}
