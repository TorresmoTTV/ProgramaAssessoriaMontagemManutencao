package model;

public class Verifica {

    private int fkOrdemDeServicoIdOrdem;
    private int fkRelatorioIdRelatorio;

    // Construtor
    public Verifica(int fkOrdemDeServicoIdOrdem, int fkRelatorioIdRelatorio) {
        this.fkOrdemDeServicoIdOrdem = fkOrdemDeServicoIdOrdem;
        this.fkRelatorioIdRelatorio = fkRelatorioIdRelatorio;
    }

    // Construtor padrão
    public Verifica() {
    }

    // Getters e Setters
    public int getFkOrdemDeServicoIdOrdem() {
        return fkOrdemDeServicoIdOrdem;
    }

    public void setFkOrdemDeServicoIdOrdem(int fkOrdemDeServicoIdOrdem) {
        this.fkOrdemDeServicoIdOrdem = fkOrdemDeServicoIdOrdem;
    }

    public int getFkRelatorioIdRelatorio() {
        return fkRelatorioIdRelatorio;
    }

    public void setFkRelatorioIdRelatorio(int fkRelatorioIdRelatorio) {
        this.fkRelatorioIdRelatorio = fkRelatorioIdRelatorio;
    }

    @Override
    public String toString() {
        return "Verifica [fkOrdemDeServicoIdOrdem=" + fkOrdemDeServicoIdOrdem +
                ", fkRelatorioIdRelatorio=" + fkRelatorioIdRelatorio + "]";
    }
}
