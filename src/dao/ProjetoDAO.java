package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Projeto;

public class ProjetoDAO {

    public void cadastrarProjeto(Projeto pVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "INSERT INTO Projeto (Nome, Condicao, DataInicio, DataFim, LinkUnboxing, fk_OrdemdeServico_IDOrdem) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getCondicao());
            pst.setDate(3, Date.valueOf(pVO.getDataInicio()));
            pst.setDate(4, Date.valueOf(pVO.getDataFim()));
            pst.setString(5, pVO.getLinkUnboxing());
            pst.setInt(6, pVO.getFkOrdemDeServicoIdOrdem());
            pst.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Projeto.\n" + e.getMessage());
        }
    }

    public ArrayList<Projeto> getProjetos() {
        ArrayList<Projeto> projetos = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Projeto";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Projeto pro = new Projeto();
                pro.setIdProjeto(rs.getInt("IDProjeto"));
                pro.setNome(rs.getString("Nome"));
                pro.setCondicao(rs.getString("Condicao"));
                pro.setDataInicio(rs.getDate("DataInicio").toLocalDate());
                pro.setDataFim(rs.getDate("DataFim").toLocalDate());
                pro.setLinkUnboxing(rs.getString("LinkUnboxing"));
                pro.setFkOrdemDeServicoIdOrdem(rs.getInt("fk_OrdemdeServico_IDOrdem"));
                projetos.add(pro);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Projetos.\n" + e.getMessage());
        }
        return projetos;
    }

    public Projeto getProjetoById(int idProjeto) {
        Projeto projeto = new Projeto();
        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Projeto WHERE IDProjeto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idProjeto);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                projeto = new Projeto();
                projeto.setIdProjeto(rs.getInt("IDProjeto"));
                projeto.setNome(rs.getString("Nome"));
                projeto.setCondicao(rs.getString("Condicao"));
                projeto.setDataInicio(rs.getDate("DataInicio").toLocalDate()); // Converter Date para LocalDate
                projeto.setDataFim(rs.getDate("DataFim") != null ? rs.getDate("DataFim").toLocalDate() : null); // Verifica
                // se
                // DataFim
                // é
                // null
                projeto.setLinkUnboxing(rs.getString("LinkUnboxing"));
                projeto.setFkOrdemDeServicoIdOrdem(rs.getInt("fk_OrdemdeServico_IDOrdem"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao encontrar Projeto.\n" + e.getMessage());
        }
        return projeto;
    }

    public void atualizarProjeto(Projeto pVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "UPDATE Projeto SET Nome = ?, Condicao = ?, DataInicio = ?, DataFim = ?, LinkUnboxing = ?, fk_OrdemdeServico_IDOrdem = ? WHERE IDProjeto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getCondicao());
            pst.setDate(3, Date.valueOf(pVO.getDataInicio()));
            pst.setDate(4, Date.valueOf(pVO.getDataFim()));
            pst.setString(5, pVO.getLinkUnboxing());
            pst.setInt(6, pVO.getFkOrdemDeServicoIdOrdem());
            pst.setInt(7, pVO.getIdProjeto());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar o Projeto.\n" + e.getMessage());
        }
    }

    public void deletarProjeto(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "DELETE FROM Projeto WHERE IDProjeto = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar Projeto.\n" + e.getMessage());
        }
    }
}
