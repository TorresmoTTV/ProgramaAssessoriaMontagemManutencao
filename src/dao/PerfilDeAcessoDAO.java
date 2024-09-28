package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import model.PerfilDeAcesso;

public class PerfilDeAcessoDAO {

    public void cadastrarPerfilDeAcesso(PerfilDeAcesso pVO) throws SQLException {
        String sql = "INSERT INTO PerfildeAcesso (Nome, Descricao, Tipo) VALUES (?, ?, ?)";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getDescricao());
            pst.setString(3, pVO.getTipo());
            pst.execute();
        }
    }

    public List<PerfilDeAcesso> getPerfisDeAcesso() throws SQLException {
        String sql = "SELECT * FROM PerfildeAcesso";
        List<PerfilDeAcesso> perfis = new ArrayList<>();
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                PerfilDeAcesso perfil = new PerfilDeAcesso();
                perfil.setIdPerfilDeAcesso(rs.getInt("IDPerfildeAcesso"));
                perfil.setNome(rs.getString("Nome"));
                perfil.setDescricao(rs.getString("Descricao"));
                perfil.setTipo(rs.getString("Tipo"));
                perfis.add(perfil);
            }
        }
        return perfis;
    }

    public void atualizarPerfilDeAcesso(PerfilDeAcesso pVO) throws SQLException {
        String sql = "UPDATE PerfildeAcesso SET Nome = ?, Descricao = ?, Tipo = ? WHERE IDPerfildeAcesso = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getDescricao());
            pst.setString(3, pVO.getTipo());
            pst.setInt(4, pVO.getIdPerfilDeAcesso());
            pst.executeUpdate();
        }
    }

    public void deletarPerfilDeAcesso(int id) throws SQLException {
        String sql = "DELETE FROM PerfildeAcesso WHERE IDPerfildeAcesso = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }
}
