package model;

import java.util.Date;

public class Relatorio {

    private int idRelatorio;
    private String tipo;
    private Date dataGeracao;
    private String conteudo;
    private int fkUsuarioIdUsuario;

    public Relatorio(int idRelatorio, String tipo, Date dataGeracao, String conteudo, int fkUsuarioIdUsuario) {
        this.idRelatorio = idRelatorio;
        this.tipo = tipo;
        this.dataGeracao = dataGeracao;
        this.conteudo = conteudo;
        this.fkUsuarioIdUsuario = fkUsuarioIdUsuario;
    }

    public Relatorio() {
    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(Date dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getFkUsuarioIdUsuario() {
        return fkUsuarioIdUsuario;
    }

    public void setFkUsuarioIdUsuario(int fkUsuarioIdUsuario) {
        this.fkUsuarioIdUsuario = fkUsuarioIdUsuario;
    }

    @Override
    public String toString() {
        return "Relatorio [idRelatorio=" + idRelatorio + ", tipo=" + tipo +
                ", dataGeracao=" + dataGeracao + ", conteudo=" + conteudo +
                ", fkUsuarioIdUsuario=" + fkUsuarioIdUsuario + "]";
    }
}
