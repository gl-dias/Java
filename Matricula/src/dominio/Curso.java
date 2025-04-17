package dominio;

public class Curso {
    private String nome;
    private Aluno[] alunos;
    private int qntAlunosInscritos;

    public Curso(String nome, int nrVagas) {
        this.nome = nome;
        this.alunos = new Aluno[nrVagas];
    }

    public boolean matricularAluno(Aluno a) {
        for (int i = 0; i < this.qntAlunosInscritos; i++) {
            if (this.alunos[i].getMatricula() == (a.getMatricula())) {
                return false;
            }
        }
        this.alunos[this.qntAlunosInscritos] = a;
        qntAlunosInscritos++;
        return true;
    }

    public boolean cancelarMatricula(int matricula) {
        for (int i = 0; i < this.qntAlunosInscritos; i++) {
            if (this.alunos[i].getMatricula() == matricula) {
                this.alunos[i].setCurso(null);
                this.alunos[i] = this.alunos[qntAlunosInscritos - 1];
                this.alunos[qntAlunosInscritos - 1] = null;
                qntAlunosInscritos--;
                return true;
            }
        }
        return false;
    }

    public void imprimir(){
        System.out.println("Curso: " + this.nome);
        for (int i = 0; i < this.qntAlunosInscritos; i++) {
            alunos[i].imprimir();
        }
    }
}
