package Dados;

import java.util.Date;

public class Membro {
    private String nome;
    private Date dataNascimento;
    private float salario;
    private Projeto projeto;

    public Membro(String nome, Date dataNascimento, float salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public float getSalario() {
        return salario;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }


}
