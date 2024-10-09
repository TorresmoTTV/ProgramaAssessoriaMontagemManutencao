package servicos;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.PerfilDeAcessoDAO;
import model.PerfilDeAcesso;


public class PerfilDeAcessoServicos {

    private PerfilDeAcessoDAO pDAO = DAOFactory.getPerfilDeAcessoDAO();

    public void cadastrarPerfilDeAcesso(PerfilDeAcesso perfil) {
        pDAO.cadastrarPerfilDeAcesso(perfil);
    }

    public void atualizarPerfilDeAcesso(PerfilDeAcesso perfil) {
        pDAO.atualizarPerfilDeAcesso(perfil);
    }

    public void deletarPerfilDeAcesso(int id) {
        pDAO.deletarPerfilDeAcesso(id);
    }

    public ArrayList<PerfilDeAcesso> listarPerfisDeAcesso() {
        return pDAO.getPerfisDeAcesso();
    }
}
