package model;

public class PerfilDeAcesso {

    private int idPerfilDeAcesso;
    private String nome;
    private String descricao;
    private String tipo;


    public PerfilDeAcesso(int idPerfilDeAcesso, String nome, String descricao, String tipo) {
        this.idPerfilDeAcesso = idPerfilDeAcesso;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public PerfilDeAcesso() {
    }

    public int getIdPerfilDeAcesso() {
        return idPerfilDeAcesso;
    }

    public void setIdPerfilDeAcesso(int idPerfilDeAcesso) {
        this.idPerfilDeAcesso = idPerfilDeAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "PerfilDeAcesso [idPerfilDeAcesso=" + idPerfilDeAcesso + ", nome=" + nome + ", descricao=" + descricao
                + ", tipo=" + tipo + "]";
    }
}
