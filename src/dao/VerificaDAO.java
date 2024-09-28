package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;

public class VerificaDAO {

    // Método para verificar se existe uma relação entre Ordem de Serviço e
    // Relatório
    public boolean existeRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        String sql = "SELECT COUNT(*) FROM Verifica WHERE fk_OrdemdeServico_IDOrdem = ? AND fk_Relatorio_IDRelatorio = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, idOrdemServico);
            pst.setInt(2, idRelatorio);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0; // Retorna true se existir uma relação
            }
        }
        return false; // Se não existir
    }

    // Método para criar uma nova relação entre Ordem de Serviço e Relatório
    public void adicionarRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        String sql = "INSERT INTO Verifica (fk_OrdemdeServico_IDOrdem, fk_Relatorio_IDRelatorio) VALUES (?, ?)";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, idOrdemServico);
            pst.setInt(2, idRelatorio);
            pst.execute();
        }
    }

    // Método para deletar uma relação entre Ordem de Serviço e Relatório
    public boolean deletarRelacao(int idOrdemServico, int idRelatorio) throws SQLException {
        String sql = "DELETE FROM Verifica WHERE fk_OrdemdeServico_IDOrdem = ? AND fk_Relatorio_IDRelatorio = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, idOrdemServico);
            pst.setInt(2, idRelatorio);
            return pst.executeUpdate() > 0; // Retorna true se a relação foi deletada
        }
    }
}
