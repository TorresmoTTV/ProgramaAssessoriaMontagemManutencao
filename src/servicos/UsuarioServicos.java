package servicos;

import java.sql.SQLException;
import java.util.List;

import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioServicos {

    private UsuarioDAO usuarioDAO;

    // Construtor inicializando o DAO
    public UsuarioServicos() {
        this.usuarioDAO = new UsuarioDAO();
    }

    // Método para criar um novo usuário
    public void cadastrarUsuario(Usuario usuario) throws SQLException {
        // Aqui você pode adicionar validações antes de inserir no banco
        if (usuario.getNome() == null || usuario.getNome().isEmpty()) {
            throw new IllegalArgumentException("O nome do usuário não pode estar vazio.");
        }
        if (usuario.getCpf().length() != 11) {
            throw new IllegalArgumentException("O CPF deve conter 11 dígitos.");
        }
        
        usuarioDAO.cadastrarUsuario(usuario);
    }

    // Método para atualizar um usuário existente
    public void atualizarUsuario(Usuario usuario) throws SQLException {
        if (usuario.getIdUsuario() <= 0) {
            throw new IllegalArgumentException("ID de usuário inválido.");
        }
        usuarioDAO.atualizarUsuario(usuario);
    }

    // Método para deletar um usuário pelo ID
    public void deletarUsuario(int idUsuario) throws SQLException {
        if (idUsuario <= 0) {
            throw new IllegalArgumentException("ID de usuário inválido.");
        }
        usuarioDAO.deletarUsuario(idUsuario);
    }

    // Método para buscar um usuário por ID
    public Usuario getUsuarioById(int idUsuario) throws SQLException {
        if (idUsuario <= 0) {
            throw new IllegalArgumentException("ID de usuário inválido.");
        }
        return usuarioDAO.getUsuarioById(idUsuario);
    }

    // Método para listar todos os usuários
    public List<Usuario> getUsuarios() throws SQLException {
        return usuarioDAO.getUsuarios();
    }
}
