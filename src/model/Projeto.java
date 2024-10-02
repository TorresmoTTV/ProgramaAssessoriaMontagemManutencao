package model;

import java.time.LocalDate;

public class Projeto {

    private int idProjeto;
    private String nome;
    private String condicao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String linkUnboxing;
    private int fkOrdemDeServicoIdOrdem;

    public Projeto(int idProjeto, String nome, String condicao, LocalDate dataInicio, LocalDate dataFim, String linkUnboxing,
            int fkOrdemDeServicoIdOrdem) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.condicao = condicao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.linkUnboxing = linkUnboxing;
        this.fkOrdemDeServicoIdOrdem = fkOrdemDeServicoIdOrdem;
    }

    public Projeto() {
    }

    public int getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(int idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getLinkUnboxing() {
        return linkUnboxing;
    }

    public void setLinkUnboxing(String linkUnboxing) {
        this.linkUnboxing = linkUnboxing;
    }

    public int getFkOrdemDeServicoIdOrdem() {
        return fkOrdemDeServicoIdOrdem;
    }

    public void setFkOrdemDeServicoIdOrdem(int fkOrdemDeServicoIdOrdem) {
        this.fkOrdemDeServicoIdOrdem = fkOrdemDeServicoIdOrdem;
    }

    @Override
    public String toString() {
        return "Projeto [idProjeto=" + idProjeto + ", nome=" + nome + ", condicao=" + condicao +
                ", dataInicio=" + dataInicio + ", dataFim=" + dataFim +
                ", linkUnboxing=" + linkUnboxing + ", fkOrdemDeServicoIdOrdem=" + fkOrdemDeServicoIdOrdem + "]";
    }
}
