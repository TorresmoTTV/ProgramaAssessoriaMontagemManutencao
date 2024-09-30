package servicos;

import java.sql.SQLException;
import java.util.List;

import dao.ProjetoDAO;
import model.Projeto;

public class ProjetoServicos {

    private ProjetoDAO projetoDAO;

    public ProjetoServicos() {
        this.projetoDAO = new ProjetoDAO();
    }

    public void cadastrarProjeto(Projeto projeto) throws SQLException {
        projetoDAO.cadastrarProjeto(projeto);
    }

    public void atualizarProjeto(Projeto projeto) throws SQLException {
        if (projeto.getIdProjeto() <= 0) {
            throw new IllegalArgumentException("ID de projeto inválido.");
        }
        projetoDAO.atualizarProjeto(projeto);
    }

    public void deletarProjeto(int idProjeto) throws SQLException {
        if (idProjeto <= 0) {
            throw new IllegalArgumentException("ID de projeto inválido.");
        }
        projetoDAO.deletarProjeto(idProjeto);
    }

    public Projeto getProjetoById(int idProjeto) throws SQLException {
        if (idProjeto <= 0) {
            throw new IllegalArgumentException("ID de projeto inválido.");
        }
        return projetoDAO.getProjetoById(idProjeto);
    }

    public List<Projeto> getProjetos() throws SQLException {
        return projetoDAO.getProjetos();
    }
}
