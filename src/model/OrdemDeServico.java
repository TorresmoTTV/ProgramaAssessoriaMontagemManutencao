package model;

import java.time.LocalDate;

public class OrdemDeServico {

    private int idOrdem;
    private LocalDate dataCriacao;
    private String condicao;
    private String descricao;
    private int fkUsuarioIdUsuario;

    public OrdemDeServico(int idOrdem, LocalDate dataCriacao, String condicao, String descricao, int fkUsuarioIdUsuario) {
        this.idOrdem = idOrdem;
        this.dataCriacao = dataCriacao;
        this.condicao = condicao;
        this.descricao = descricao;
        this.fkUsuarioIdUsuario = fkUsuarioIdUsuario;
    }

    public OrdemDeServico() {
    }

    public int getIdOrdem() {
        return idOrdem;
    }

    public void setIdOrdem(int idOrdem) {
        this.idOrdem = idOrdem;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFkUsuarioIdUsuario() {
        return fkUsuarioIdUsuario;
    }

    public void setFkUsuarioIdUsuario(int fkUsuarioIdUsuario) {
        this.fkUsuarioIdUsuario = fkUsuarioIdUsuario;
    }

    @Override
    public String toString() {
        return "OrdemDeServico [idOrdem=" + idOrdem + ", dataCriacao=" + dataCriacao + ", condicao=" + condicao +
                ", descricao=" + descricao + ", fkUsuarioIdUsuario=" + fkUsuarioIdUsuario + "]";
    }
}
