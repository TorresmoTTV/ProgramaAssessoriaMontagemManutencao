package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Relatorio;

public class RelatorioDAO {

    public void cadastrarRelatorio(Relatorio rVO) {
        String sql = "INSERT INTO Relatorio (Tipo, DataGeracao, Conteudo, fk_Usuario_IDUsuario) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, rVO.getTipo());
            pst.setDate(2, Date.valueOf(rVO.getDataGeracao()));
            pst.setString(3, rVO.getConteudo());
            pst.setInt(4, rVO.getFkUsuarioIdUsuario());
            pst.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao criar Relatorio.\n" + e.getMessage());
        }
    }

    public ArrayList<Relatorio> getRelatorios() throws SQLException {

        ArrayList<Relatorio> relatorios = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Relatorio";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Relatorio re = new Relatorio();
                re.setIdRelatorio(rs.getInt("IDRelatorio"));
                re.setTipo(rs.getString("Tipo"));
                re.setDataGeracao(rs.getDate("DataGeracao").toLocalDate());
                re.setConteudo(rs.getString("Conteudo"));
                re.setFkUsuarioIdUsuario(rs.getInt("fk_Usuario_IDUsuario"));
                relatorios.add(re);
            }
        }   catch (SQLException e) {
            System.out.println("Erro ao listar Relatorios.\n"
                    + e.getMessage());
        return relatorios;
    }

    public void getRelatorioById(int idRelatorio) {
        Relatorio relatorio = new Relatorio();
        try (){
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Relatorio WHERE IDRelatorio = ?";
            PreparedStatement pst = con.prepareStatement(sql);
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
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o Relatorio.\n"
                    + e.getMessage());
        }
        return relatorio;
    }

    public boolean deletarRelatorio(int idRelatorio) {
        try () {
            Connection con = Conexao.getConexao();
            String sql = "DELETE FROM Relatorio WHERE IDRelatorio = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o Relatorio.\n" + e.getMessage());
        }
        return true;
    }
}
}
