package servicos;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.UsuarioDAO;
import model.Usuario;

public class UsuarioServicos {

    UsuarioDAO uDao = DAOFactory.getUsuarioDAO();

    public void cadastrarUsuario(Usuario uVO) {
        uDao.cadastrarUsuario(uVO);
    }

    public ArrayList<Usuario> listaVitimas() {
        return uDao.getUsuarios();
    }

    public void atualizarUsuario(Usuario uVO) {
        uDao.atualizarUsuario(uVO);
    }

    public boolean deletarUsuario(int id) {
        return uDao.deletarUsuario(id);
    }

    public Usuario getUsuarioById(int id) {
        return uDao.getUsuarioById(id);
    }
}