package servicos;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.ProjetoDAO;
import model.Projeto;

public class ProjetoServicos {

    private ProjetoDAO pDAO = DAOFactory.getProjetoDAO();

    public void cadastrarProjeto(Projeto projeto) {
        pDAO.cadastrarProjeto(projeto);
    }

    public void atualizarProjeto(Projeto projeto) {
        pDAO.atualizarProjeto(projeto);
    }

    public void deletarProjeto(int idProjeto) {
        pDAO.deletarProjeto(idProjeto);
    }

    public Projeto getProjetoById(int idProjeto) {
        return pDAO.getProjetoById(idProjeto);
    }

    public ArrayList<Projeto> getProjetos() {
        return pDAO.getProjetos();
    }
}
