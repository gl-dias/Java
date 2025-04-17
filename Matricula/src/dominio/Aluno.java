package dominio;

public class Aluno {
    private int matricula;
    private String nome;
    private Curso curso;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void imprimir() {
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
    }
}
