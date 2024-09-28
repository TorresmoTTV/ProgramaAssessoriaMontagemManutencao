package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import model.Projeto;

public class ProjetoDAO {

    public void cadastrarProjeto(Projeto pVO) throws SQLException {
        String sql = "INSERT INTO Projeto (Nome, Condicao, DataInicio, DataFim, LinkUnboxing, fk_OrdemdeServico_IDOrdem) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getCondicao());
            pst.setDate(3, pVO.getDataInicio());
            pst.setDate(4, pVO.getDataFim());
            pst.setString(5, pVO.getLinkUnboxing());
            pst.setInt(6, pVO.getFkOrdemDeServicoIdOrdem());
            pst.execute();
        }
    }

    public List<Projeto> getProjetos() throws SQLException {
        String sql = "SELECT * FROM Projeto";
        List<Projeto> projetos = new ArrayList<>();
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Projeto pro = new Projeto();
                pro.setIdProjeto(rs.getInt("IDProjeto"));
                pro.setNome(rs.getString("Nome"));
                pro.setCondicao(rs.getString("Condicao"));
                pro.setDataInicio(rs.getDate("DataInicio"));
                pro.setDataFim(rs.getDate("DataFim"));
                pro.setLinkUnboxing(rs.getString("LinkUnboxing"));
                pro.setFkOrdemDeServicoIdOrdem(rs.getInt("fk_OrdemdeServico_IDOrdem"));
                projetos.add(pro);
            }
        }
        return projetos;
    }

    public Projeto getProjetoById(int idProjeto) throws SQLException {
        String sql = "SELECT * FROM Projeto WHERE IDProjeto = ?";
        Projeto projeto = null;

        try (Connection con = Conexao.getConexao();
            PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, idProjeto);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                projeto = new Projeto();
                projeto.setIdProjeto(rs.getInt("IDProjeto"));
                projeto.setNome(rs.getString("Nome"));
                projeto.setCondicao(rs.getString("Condicao"));
                projeto.setDataInicio(rs.getDate("DataInicio").toLocalDate()); // Converter Date para LocalDate
                projeto.setDataFim(rs.getDate("DataFim") != null ? rs.getDate("DataFim").toLocalDate() : null); // Verifica se DataFim é null
                projeto.setLinkUnboxing(rs.getString("LinkUnboxing"));
                projeto.setFkOrdemDeServicoIdOrdem(rs.getInt("fk_OrdemdeServico_IDOrdem"));
            }
        }
        return projeto;
    }

    public void atualizarProjeto(Projeto pVO) throws SQLException {
        String sql = "UPDATE Projeto SET Nome = ?, Condicao = ?, DataInicio = ?, DataFim = ?, LinkUnboxing = ?, fk_OrdemdeServico_IDOrdem = ? WHERE IDProjeto = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getCondicao());
            pst.setDate(3, pVO.getDataInicio());
            pst.setDate(4, pVO.getDataFim());
            pst.setString(5, pVO.getLinkUnboxing());
            pst.setInt(6, pVO.getFkOrdemDeServicoIdOrdem());
            pst.setInt(7, pVO.getIdProjeto());
            pst.executeUpdate();
        }
    }

    public void deletarProjeto(int id) throws SQLException {
        String sql = "DELETE FROM Projeto WHERE IDProjeto = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            pst.executeUpdate();
        }
    }
}
