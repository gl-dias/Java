import java.util.*;
/*Ler notas de alunos até que o usuário digite -1. Ao final imprimir a
quantidade de alunos, a média da turma, a maior nota e a menor
nota */
public class Exc14 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Informe as notas do alunos");
        float soma = 0;
        float media = 0;
        int qtdA = 0;
        float maior = 0;
        float menor = 10;

        while (media == 0) {
            float temp = numeros.nextFloat();
            if (temp == -1) {
                break;
            }
            if (temp > maior) {
                maior = temp;
            }
            if (temp < menor) {
                menor = temp;
            }
            soma += temp;
            qtdA = qtdA + 1;
        }
        
        media = soma / qtdA;
        System.out.println(media);
        System.out.println(maior);
        System.out.println(menor);
    }    
}
