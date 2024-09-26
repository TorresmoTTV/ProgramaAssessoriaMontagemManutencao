package model;

import java.util.ArrayList;
import java.util.List;

public class PerfilDeAcesso {
    private int idPerf;
    private String nomeP;
    private String descricao;
    private List<String> perm;

    public PerfilDeAcesso() {
        this.perm = new ArrayList<>();
    }

    public PerfilDeAcesso(int idPerf, String nomeP, String descricao) {
        this.idPerf = idPerf;
        this.nomeP = nomeP;
        this.descricao = descricao;
        this.perm = new ArrayList<>();
    }

    public int getIdPerfil() {
        return idPerf;
    }

    public void setIdPerfil(int idPerf) {
        this.idPerf = idPerf;
    }

    public String getnomePerfil() {
        return nomeP;
    }

    public void setnomePerfil(String nomeP) {
        this.nomeP = nomeP;
    }

    public String getDescricaoPerfil() {
        return descricao;
    }

    public void setDescricaoPerfil(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPerm() {
        return perm;
    }

    public void setPerm(List<String> perm) {
        this.perm = perm;
    }

    public void adicionarPerm(String permissao) {
        if (!perm.contains(permissao)) {
            perm.add(permissao);
        }
    }

    public void removerPermissao(String permissao) {
        perm.remove(permissao);
    }

    public boolean temPermissao(String permissao) {
        return perm.contains(permissao);
    }

    @Override
    public String toString() {
        return "PerfilDeAcesso{" +
                "idPerf=" + idPerf +
                ", nomeP='" + nomeP + '\'' +
                ", descricao='" + descricao + '\'' +
                ", perm=" + perm +
                '}';
    }
}
