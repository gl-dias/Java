package Dados;

import java.util.Date;

public class Projeto {
    private String nome;
    private float custo;
    private Membro[] membros;
    private int qntMembros;

    public Projeto(String nome, int qntMaxMembros) {
        this.nome = nome;
        this.membros = new Membro[qntMaxMembros];
    }

    public boolean adicionarMembro(Membro m) {
        for (int i = 0; i < qntMembros; i++) {
            if (membros[i].getNome().equals(m.getNome()) && membros[i].getDataNascimento().equals(m.getDataNascimento())) {
                return false;
            }
            if (m.getProjeto() != null) {
                return false;
            }
        }
        m.setProjeto(this);
        this.membros[qntMembros] = m;
        custo += m.getSalario();
        qntMembros++;
        return true;
    }

    public boolean removerMembro(String nome, Date dataNascimento) {
        for (int i = 0; i < qntMembros; i++) {
            if (membros[i].getNome().equals(nome) && membros[i].getDataNascimento().equals(dataNascimento)) {
                custo -= membros[i].getSalario();
                membros[i].setProjeto(null);
                this.membros[i] = this.membros[qntMembros - 1];
                this.membros[qntMembros - 1] = null;
                qntMembros--;
                return true;
            }
        }
        return false;
    }

    public void imprimirProjeto() {
        System.out.println("Nome: " + nome);
        System.out.println("Custo: " + custo);
        System.out.println("=========================");
        for (int i = 0; i < qntMembros; i++) {
            System.out.println("Membro: " + membros[i].getNome());
            System.out.println("Data: " + membros[i].getDataNascimento());
            System.out.println("Salario: " + membros[i].getSalario());
            System.out.println("=========================");
        }
    }

}
