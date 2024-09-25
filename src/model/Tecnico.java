package model;

public class Tecnico extends Usuario {

    @Override
    public void assistirUnboxing() {
        // TODO Auto-generated method stub
        super.assistirUnboxing();
    }

    @Override
    public int getCPF() {
        // TODO Auto-generated method stub
        return super.getCPF();
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return super.getEmail();
    }

    @Override
    public String getEndreco() {
        // TODO Auto-generated method stub
        return super.getEndreco();
    }

    @Override
    public int getIdusuario() {
        // TODO Auto-generated method stub
        return super.getIdusuario();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public String getSenha() {
        // TODO Auto-generated method stub
        return super.getSenha();
    }

    @Override
    public int getTelefone() {
        // TODO Auto-generated method stub
        return super.getTelefone();
    }

    @Override
    public String getUsuario() {
        // TODO Auto-generated method stub
        return super.getUsuario();
    }

    @Override
    public void setCPF(int CPF) {
        // TODO Auto-generated method stub
        super.setCPF(CPF);
    }

    @Override
    public void setEmail(String email) {
        // TODO Auto-generated method stub
        super.setEmail(email);
    }

    @Override
    public void setEndreco(String endreco) {
        // TODO Auto-generated method stub
        super.setEndreco(endreco);
    }

    @Override
    public void setIdusuario(int idusuario) {
        // TODO Auto-generated method stub
        super.setIdusuario(idusuario);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public void setSenha(String senha) {
        // TODO Auto-generated method stub
        super.setSenha(senha);
    }

    @Override
    public void setTelefone(int telefone) {
        // TODO Auto-generated method stub
        super.setTelefone(telefone);
    }

    @Override
    public void setUsuario(String usuario) {
        // TODO Auto-generated method stub
        super.setUsuario(usuario);
    }

    @Override
    public void solicitarServico() {
        // TODO Auto-generated method stub
        super.solicitarServico();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public void verificarStatus() {
        // TODO Auto-generated method stub
        super.verificarStatus();
    }

    public void acompanharOrdemDeServico(int ordemID) {
        System.out.println("Técnico " + getNome() + " está acompanhando a ordem de serviço: " + ordemID);
    }

    public void atualizarStatusOrdem(int ordemID, String novoStatus) {
        System.out.println("Técnico " + getNome() + " atualizou o status da ordem " + ordemID + " para: " + novoStatus);
    }

    public void acompanharProjeto(int idProjeto) {
        System.out.println("Técnico " + getNome() + " está acompanhando o projeto: " + idProjeto);
    }
}
