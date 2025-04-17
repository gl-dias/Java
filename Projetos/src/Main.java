import Dados.Membro;
import Dados.Projeto;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Membro m1 = new Membro("Pedro", new Date(25, Calendar.NOVEMBER, 30), 300);
        Membro m2 = new Membro("Pedrinho", new Date(26, Calendar.NOVEMBER, 31), 200);
        Membro m3 = new Membro("Arthur", new Date(24, Calendar.NOVEMBER, 23), 100);
        Projeto p1 = new Projeto("Projeto 1", 3);

        p1.adicionarMembro(m1);
        p1.adicionarMembro(m2);
        p1.adicionarMembro(m3);
        p1.imprimirProjeto();
        p1.removerMembro("Arthur", new Date(24, Calendar.NOVEMBER, 23));
        p1.imprimirProjeto();
        }
    }
