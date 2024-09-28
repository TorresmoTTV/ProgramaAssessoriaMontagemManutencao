package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import model.OrdemDeServico;

public class OrdemDeServicoDAO {

    public void cadastrarOrdemDeServico(OrdemDeServico osVO) throws SQLException {
        String sql = "INSERT INTO OrdemdeServico (DataCriacao, Condicao, Descricao, fk_Usuario_IDUsuario) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setDate(1, osVO.getDataCriacao());
            pst.setString(2, osVO.getCondicao());
            pst.setString(3, osVO.getDescricao());
            pst.setInt(4, osVO.getFkUsuarioIdUsuario());
            pst.execute();
        }
    }

    public List<OrdemDeServico> getOrdensDeServico() throws SQLException {
        String sql = "SELECT * FROM OrdemdeServico";
        List<OrdemDeServico> ordens = new ArrayList<>();
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                OrdemDeServico os = new OrdemDeServico();
                os.setIdOrdem(rs.getInt("IDOrdem"));
                os.setDataCriacao(rs.getDate("DataCriacao"));
                os.setCondicao(rs.getString("Condicao"));
                os.setDescricao(rs.getString("Descricao"));
                os.setFkUsuarioIdUsuario(rs.getInt("fk_Usuario_IDUsuario"));
                ordens.add(os);
            }
        }
        return ordens;
    }

    public void atualizarOrdemDeServico(OrdemDeServico osVO) throws SQLException {
        String sql = "UPDATE OrdemdeServico SET DataCriacao = ?, Condicao = ?, Descricao = ?, fk_Usuario_IDUsuario = ? WHERE IDOrdem = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setDate(1, osVO.getDataCriacao());
            pst.setString(2, osVO.getCondicao());
            pst.setString(3, osVO.getDescricao());
            pst.setInt(4, osVO.getFkUsuarioIdUsuario());
            pst.setInt(5, osVO.getIdOrdem());
            pst.executeUpdate();
        }
    }

    public void deletarOrdemDeServico(int id) throws SQLException {
        String sql = "DELETE FROM OrdemdeServico WHERE IDOrdem = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }

    public OrdemDeServico getOrdemDeServicoById(int idOrdem) throws SQLException {
        String sql = "SELECT * FROM OrdemdeServico WHERE IDOrdem = ?";
        OrdemDeServico ordem = null;

        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, idOrdem);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                ordem = new OrdemDeServico();
                ordem.setIdOrdem(rs.getInt("IDOrdem"));
                ordem.setDataCriacao(rs.getDate("DataCriacao").toLocalDate()); // Converter Date para LocalDate
                ordem.setCondicao(rs.getString("Condicao"));
                ordem.setDescricao(rs.getString("Descricao"));
                ordem.setFkUsuarioIdUsuario(rs.getInt("fk_Usuario_IDUsuario"));
            }
        }
        return ordem;
    }

}
