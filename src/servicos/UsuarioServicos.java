package servicos;

import dao.DAOFactory;
import java.util.ArrayList;

import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioServicos {

    private UsuarioDAO uDAO = DAOFactory.getUsuarioDAO();

    public void cadastrarUsuario(Usuario usuario) {
        uDAO.cadastrarUsuario(usuario);
    }

    public void atualizarUsuario(Usuario usuario) {
        uDAO.atualizarUsuario(usuario);
    }

    public void deletarUsuario(int idUsuario) {
        uDAO.deletarUsuario(idUsuario);
    }

    public Usuario getUsuarioById(int idUsuario) {
        return uDAO.getUsuarioById(idUsuario);
    }

    public ArrayList<Usuario> getUsuarios() {
        return uDAO.getUsuarios();
    }
}
