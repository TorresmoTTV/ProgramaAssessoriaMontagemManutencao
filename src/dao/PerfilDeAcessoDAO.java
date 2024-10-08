package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.PerfilDeAcesso;

public class PerfilDeAcessoDAO {

    public void cadastrarPerfilDeAcesso(PerfilDeAcesso pVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "INSERT INTO PerfildeAcesso (Nome, Descricao, Tipo) VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getDescricao());
            pst.setString(3, pVO.getTipo());
            pst.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Perfil de Acesso.\n" + e.getMessage());
        }
    }

    public ArrayList<PerfilDeAcesso> getPerfisDeAcesso() {
        ArrayList<PerfilDeAcesso> perfis = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM PerfildeAcesso";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                PerfilDeAcesso perfil = new PerfilDeAcesso();
                perfil.setIdPerfilDeAcesso(rs.getInt("IDPerfildeAcesso"));
                perfil.setNome(rs.getString("Nome"));
                perfil.setDescricao(rs.getString("Descricao"));
                perfil.setTipo(rs.getString("Tipo"));
                perfis.add(perfil);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Perfil de Acesso.\n" + e.getMessage());
        }
        return perfis;
    }

    public void atualizarPerfilDeAcesso(PerfilDeAcesso pVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "UPDATE PerfildeAcesso SET Nome = ?, Descricao = ?, Tipo = ? WHERE IDPerfildeAcesso = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getNome());
            pst.setString(2, pVO.getDescricao());
            pst.setString(3, pVO.getTipo());
            pst.setInt(4, pVO.getIdPerfilDeAcesso());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atua.izar Perfil de Acesso.\n" + e.getMessage());
        }
    }

    public boolean deletarPerfilDeAcesso(int id) {
        String sql = "DELETE FROM PerfildeAcesso WHERE IDPerfildeAcesso = ?";
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o Perfil de Acesso.\n" + e.getMessage());
        }
        return true;
    }
}
