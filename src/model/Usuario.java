package model;

public class Usuario {

    private int idusuario;
    private int CPF;
    private int telefone;
    private String nome;
    private String email;
    private String endreco;
    private String usuario;
    private String senha;

    public Usuario() {
    }

    public Usuario(int idusuario, int CPF, int telefone, String nome, String email, String endreco, String usuario,
            String senha) {
        this.idusuario = idusuario;
        this.CPF = CPF;
        this.telefone = telefone;
        this.nome = nome;
        this.email = email;
        this.endreco = endreco;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndreco() {
        return endreco;
    }

    public void setEndreco(String endreco) {
        this.endreco = endreco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "User{" + "idusuario=" + idusuario + ", CPF=" + CPF + ", telefone=" + telefone + ", nome=" + nome
                + ", email=" + email + ", endreco=" + endreco + ", usuario=" + usuario + ", senha=" + senha + '}';
    }

    public void solicitarServico() {
        System.out.println("Serviço solicitado.");
    }

    public void verificarStatus() {
        System.out.println("Verificando o status do pedido...");
    }

    public void assistirUnboxing() {
        System.out.println("Assistindo o vídeo de unboxing da peça.");
    }

}
