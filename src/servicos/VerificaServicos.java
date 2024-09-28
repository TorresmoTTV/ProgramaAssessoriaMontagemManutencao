package servicos;

import java.sql.SQLException;

import dao.VerificaDAO;

public class VerificaServicos {

    private VerificaDAO verificaDAO;

    // Construtor inicializando o DAO
    public VerificaServicos() {
        this.verificaDAO = new VerificaDAO();
    }

    // Método para adicionar uma nova relação entre Ordem de Serviço e Relatório
    public void adicionarRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        // Verifica se a relação já existe antes de adicionar
        if (verificaDAO.existeRelacao(idOrdemServico, idRelatorio)) {
            throw new IllegalArgumentException("A relação entre a Ordem de Serviço e o Relatório já existe.");
        }
        verificaDAO.adicionarRelacao(idOrdemServico, idRelatorio);
    }

    // Método para deletar uma relação existente entre Ordem de Serviço e Relatório
    public void deletarRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        if (!verificaDAO.existeRelacao(idOrdemServico, idRelatorio)) {
            throw new IllegalArgumentException("A relação entre a Ordem de Serviço e o Relatório não existe.");
        }
        verificaDAO.deletarRelacao(idOrdemServico, idRelatorio);
    }

    // Método para verificar se uma relação existe
    public boolean existeRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        return verificaDAO.existeRelacao(idOrdemServico, idRelatorio);
    }
}
