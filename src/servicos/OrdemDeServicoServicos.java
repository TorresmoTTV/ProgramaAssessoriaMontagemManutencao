package servicos;

import java.sql.SQLException;
import java.util.List;

import dao.OrdemDeServicoDAO;
import model.OrdemDeServico;

public class OrdemDeServicoServicos {

    private OrdemDeServicoDAO ordemDeServicoDAO;

    public OrdemDeServicoServicos() {
        this.ordemDeServicoDAO = new OrdemDeServicoDAO();
    }

    public void cadastrarOrdemDeServico(OrdemDeServico ordem) throws SQLException {
        ordemDeServicoDAO.cadastrarOrdemDeServico(ordem);
    }

    public void atualizarOrdemDeServico(OrdemDeServico ordem) throws SQLException {
        if (ordem.getIdOrdem() <= 0) {
            throw new IllegalArgumentException("ID de ordem de serviço inválido.");
        }
        ordemDeServicoDAO.atualizarOrdemDeServico(ordem);
    }

    public void deletarOrdemDeServico(int idOrdem) throws SQLException {
        if (idOrdem <= 0) {
            throw new IllegalArgumentException("ID de ordem de serviço inválido.");
        }
        ordemDeServicoDAO.deletarOrdemDeServico(idOrdem);
    }

    public OrdemDeServico getOrdemDeServicoById(int idOrdem) throws SQLException {
        if (idOrdem <= 0) {
            throw new IllegalArgumentException("ID de ordem de serviço inválido.");
        }
        return ordemDeServicoDAO.getOrdemDeServicoById(idOrdem);
    }

    public List<OrdemDeServico> getOrdensDeServico() throws SQLException {
        return ordemDeServicoDAO.getOrdensDeServico();
    }
}
