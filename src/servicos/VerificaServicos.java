package servicos;

import java.sql.SQLException;

import dao.VerificaDAO;

public class VerificaServicos {

    private VerificaDAO verificaDAO;


    public VerificaServicos() {
        this.verificaDAO = new VerificaDAO();
    }

    public void adicionarRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        
        if (verificaDAO.existeRelacao(idOrdemServico, idRelatorio)) {
            throw new IllegalArgumentException("A relação entre a Ordem de Serviço e o Relatório já existe.");
        }
        verificaDAO.adicionarRelacao(idOrdemServico, idRelatorio);
    }

    public void deletarRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        if (!verificaDAO.existeRelacao(idOrdemServico, idRelatorio)) {
            throw new IllegalArgumentException("A relação entre a Ordem de Serviço e o Relatório não existe.");
        }
        verificaDAO.deletarRelacao(idOrdemServico, idRelatorio);
    }

    public boolean existeRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        return verificaDAO.existeRelacao(idOrdemServico, idRelatorio);
    }
}
