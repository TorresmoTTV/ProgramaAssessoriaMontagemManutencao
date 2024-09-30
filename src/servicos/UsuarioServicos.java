package servicos;

import java.sql.SQLException;
import java.util.List;

import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioServicos {

    private UsuarioDAO usuarioDAO;

    public UsuarioServicos() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public void cadastrarUsuario(Usuario usuario) throws SQLException {

        if (usuario.getNome() == null || usuario.getNome().isEmpty()) {
            throw new IllegalArgumentException("O nome do usuário não pode estar vazio.");
        }
        if (usuario.getCpf().length() != 14) {
            throw new IllegalArgumentException("O CPF deve conter 14 dígitos.");
        }
        if (usuario.getTelefone().length() != 14) {
            throw new IllegalArgumentException("O telefone deve conter 14 dígitos.");
        }
        usuarioDAO.cadastrarUsuario(usuario);
    }

    public void atualizarUsuario(Usuario usuario) throws SQLException {
        if (usuario.getIdUsuario() <= 0) {
            throw new IllegalArgumentException("ID de usuário inválido.");
        }
        usuarioDAO.atualizarUsuario(usuario);
    }

    public void deletarUsuario(int idUsuario) throws SQLException {
        if (idUsuario <= 0) {
            throw new IllegalArgumentException("ID de usuário inválido.");
        }
        usuarioDAO.deletarUsuario(idUsuario);
    }

    public Usuario getUsuarioById(int idUsuario) throws SQLException {
        if (idUsuario <= 0) {
            throw new IllegalArgumentException("ID de usuário inválido.");
        }
        return usuarioDAO.getUsuarioById(idUsuario);
    }

    public List<Usuario> getUsuarios() throws SQLException {
        return usuarioDAO.getUsuarios();
    }
}
