import dominio.Aluno;
import dominio.Curso;

public class Main {
    public static void main(String[] args) {
            Curso curso1 = new Curso("Engenharia da computação", 5);
            Aluno a1 = new Aluno(1, "Ricardo");
            Aluno a2 = new Aluno(2, "João");
            Aluno a3 = new Aluno(3, "Pedro");
            Aluno a4 = new Aluno(4, "Maria");

            curso1.matricularAluno(a1);
            curso1.imprimir();
            curso1.matricularAluno(a2);
            curso1.imprimir();
    }
}