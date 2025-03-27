public class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean ehValida() {
        if (mes >= 1 || mes <= 12 || dia >= 1 || dia <= 31) {
            return false;
        }

        if (mes == 2) {
            if (ehBissexto()) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        }
        return true;
    }

    public boolean ehBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public void mostrar() {
        System.out.println(ano + "/" + mes + "/" + dia);
    }
}
