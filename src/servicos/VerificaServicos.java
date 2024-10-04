package servicos;

import dao.DAOFactory;
import dao.VerificaDAO;
import java.sql.SQLException;

public class VerificaServicos {

    private VerificaDAO vDAO = DAOFactory.getVerificaDAO();

    public void adicionarRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        vDAO.adicionarRelacao(idOrdemServico, idRelatorio);
    }

    public void deletarRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        vDAO.deletarRelacao(idOrdemServico, idRelatorio);
    }

    public boolean existeRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        return vDAO.existeRelacao(idOrdemServico, idRelatorio);
    }
}
