package model;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String endereco;
    private String cpf;
    private String telefone;
    private String usuario;
    private String senha;
    private int perfilDeAcessoId;

    public Usuario() {}

    public Usuario(int idUsuario, String nome, String email, String endereco, String cpf, String telefone, String usuario, String senha, int perfilDeAcessoId) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        this.perfilDeAcessoId = perfilDeAcessoId;
    }

    // Getters e Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public int getPerfilDeAcessoId() {
        return perfilDeAcessoId;
    }

    public void setPerfilDeAcessoId(int perfilDeAcessoId) {
        this.perfilDeAcessoId = perfilDeAcessoId;
    }

    // Método para exibir informações do usuário (opcional)
    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", usuario='" + usuario + '\'' +
                ", perfilDeAcessoId=" + perfilDeAcessoId +
                '}';
    }
}