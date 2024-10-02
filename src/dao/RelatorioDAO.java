package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import model.Relatorio;

public class RelatorioDAO {

    public void cadastrarRelatorio(Relatorio rVO) throws SQLException {
        String sql = "INSERT INTO Relatorio (Tipo, DataGeracao, Conteudo, fk_Usuario_IDUsuario) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, rVO.getTipo());
            pst.setDate(2, Date.valueOf(rVO.getDataGeracao()));
            pst.setString(3, rVO.getConteudo());
            pst.setInt(4, rVO.getFkUsuarioIdUsuario());
            pst.execute();
        }
    }

    public List<Relatorio> getRelatorios() throws SQLException {
        String sql = "SELECT * FROM Relatorio";
        List<Relatorio> relatorios = new ArrayList<>();
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Relatorio re = new Relatorio();
                re.setIdRelatorio(rs.getInt("IDRelatorio"));
                re.setTipo(rs.getString("Tipo"));
                re.setDataGeracao(rs.getDate("DataGeracao").toLocalDate());
                re.setConteudo(rs.getString("Conteudo"));
                re.setFkUsuarioIdUsuario(rs.getInt("fk_Usuario_IDUsuario"));
                relatorios.add(re);
            }
        }
        return relatorios;
    }

    public Relatorio getRelatorioById(int idRelatorio) throws SQLException {
        String sql = "SELECT * FROM Relatorio WHERE IDRelatorio = ?";
        Relatorio relatorio = null;

        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, idRelatorio);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                relatorio = new Relatorio();
                relatorio.setIdRelatorio(rs.getInt("IDRelatorio"));
                relatorio.setTipo(rs.getString("Tipo"));
                relatorio.setDataGeracao(rs.getDate("DataGeracao").toLocalDate());
                relatorio.setConteudo(rs.getString("Conteudo"));
                relatorio.setFkUsuarioIdUsuario(rs.getInt("fk_Usuario_IDUsuario"));
            }
        }
        return relatorio;
    }

    public void atualizarRelatorio(Relatorio rVO) throws SQLException {
        String sql = "UPDATE Relatorio SET Tipo = ?, DataGeracao = ?, Conteudo = ?, fk_Usuario_IDUsuario = ? WHERE IDRelatorio = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, rVO.getTipo());
            pst.setDate(2, Date.valueOf(rVO.getDataGeracao()));
            pst.setString(3, rVO.getConteudo());
            pst.setInt(4, rVO.getFkUsuarioIdUsuario());
            pst.setInt(5, rVO.getIdRelatorio());
            pst.executeUpdate();
        }
    }

    public void deletarRelatorio(int id) throws SQLException {
        String sql = "DELETE FROM Relatorio WHERE IDRelatorio = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }
}
