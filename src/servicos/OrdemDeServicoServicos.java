package servicos;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.OrdemDeServicoDAO;
import model.OrdemDeServico;

public class OrdemDeServicoServicos {

    private OrdemDeServicoDAO oDAO = DAOFactory.getOrdemDeServicoDAO();

    public void cadastrarOrdemDeServico(OrdemDeServico ordem) {
        oDAO.cadastrarOrdemDeServico(ordem);
    }

    public void atualizarOrdemDeServico(OrdemDeServico ordem) {
        oDAO.atualizarOrdemDeServico(ordem);
    }

    public void deletarOrdemDeServico(int idOrdem) {
        oDAO.deletarOrdemDeServico(idOrdem);
    }

    public OrdemDeServico getOrdemDeServicoById(int idOrdem) {
        return oDAO.getOrdemDeServicoById(idOrdem);
    }

    public ArrayList<OrdemDeServico> getOrdensDeServico() {
        return oDAO.getOrdensDeServico();
    }
}
