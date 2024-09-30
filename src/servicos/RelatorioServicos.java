package servicos;

import java.sql.SQLException;
import java.util.List;

import dao.RelatorioDAO;
import model.Relatorio;

public class RelatorioServicos {

    private RelatorioDAO relatorioDAO;

    public RelatorioServicos() {
        this.relatorioDAO = new RelatorioDAO();
    }

    public void cadastrarRelatorio(Relatorio relatorio) throws SQLException {
        relatorioDAO.cadastrarRelatorio(relatorio);
    }

    public void atualizarRelatorio(Relatorio relatorio) throws SQLException {
        if (relatorio.getIdRelatorio() <= 0) {
            throw new IllegalArgumentException("ID de relatório inválido.");
        }
        relatorioDAO.atualizarRelatorio(relatorio);
    }

    public void deletarRelatorio(int idRelatorio) throws SQLException {
        if (idRelatorio <= 0) {
            throw new IllegalArgumentException("ID de relatório inválido.");
        }
        relatorioDAO.deletarRelatorio(idRelatorio);
    }

    public Relatorio getRelatorioById(int idRelatorio) throws SQLException {
        if (idRelatorio <= 0) {
            throw new IllegalArgumentException("ID de relatório inválido.");
        }
        return relatorioDAO.getRelatorioById(idRelatorio);
    }

    public List<Relatorio> getRelatorios() throws SQLException {
        return relatorioDAO.getRelatorios();
    }
}
