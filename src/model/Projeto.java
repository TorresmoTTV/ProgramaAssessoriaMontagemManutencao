package model;

import java.util.Date;

public class Projeto {

    private int idProjeto;
    private String nome;
    private String condicao;
    private Date dataInicio;
    private Date dataFim;
    private String linkUnboxing;
    private int fkOrdemDeServicoIdOrdem;

    // Construtor
    public Projeto(int idProjeto, String nome, String condicao, Date dataInicio, Date dataFim, String linkUnboxing,
            int fkOrdemDeServicoIdOrdem) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.condicao = condicao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.linkUnboxing = linkUnboxing;
        this.fkOrdemDeServicoIdOrdem = fkOrdemDeServicoIdOrdem;
    }

    // Construtor padrão
    public Projeto() {
    }

    // Getters e Setters
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
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
