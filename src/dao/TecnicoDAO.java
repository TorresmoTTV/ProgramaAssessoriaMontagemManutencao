package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import model.Tecnico;

public class TecnicoDAO {

    public void cadastrarTecnico(Tecnico tVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into usuario (nome, cpf, endereco, email, telefone, usuario, senha) "
                    + "(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tVO.getNome());
            pst.setInt(2, tVO.getCPF());
            pst.setString(3, tVO.getEndreco());
            pst.setString(4, tVO.getEmail());
            pst.setInt(5, tVO.getTelefone());
            pst.setString(6, tVO.getUsuario());
            pst.setString(7, tVO.getSenha());
            pst.execute();
            System.out.println("Tecnico cadastrado com sucesso!!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Tecnico.\n" + e.getMessage());
        }
    }

    public void atualizarTecnico(Tecnico tVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update usuario set nome = ?,"
                    + "Email = ?,"
                    + "Endereco = ?,"
                    + "CPF = ?,"
                    + "Telefone = ?"
                    + "Usuario = ?"
                    + "Senha = ?"
                    + " where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tVO.getNome());
            pst.setString(2, tVO.getEmail());
            pst.setString(3, tVO.getEndreco());
            pst.setInt(4, tVO.getCPF());
            pst.setInt(5, tVO.getTelefone());
            pst.setString(6, tVO.getUsuario());
            pst.setString(7, tVO.getSenha());
            pst.setInt(8, tVO.getIdusuario());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar Tecnico.\n" + e.getMessage());
        }
    }

    public boolean deletarTecnico(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from usuario where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o tecnico.\n" + e.getMessage());
        }
        return true;

    }

    public Tecnico getTecnicoById(int id) {
        Tecnico t = new Tecnico();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from usuario " + "where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                t.setIdusuario(rs.getInt("IDUsuario"));
                t.setNome(rs.getString("Nome"));
                t.setCPF(rs.getInt("CPF"));
                t.setEmail(rs.getString("Email"));
                t.setEndreco(rs.getString("Endereco"));
                t.setTelefone(rs.getInt("Telefone"));
                t.setUsuario(rs.getString("Usuario"));
                t.setSenha(rs.getString("Senha"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Tecnico.\n" + e.getMessage());
        }
        return t;
    }

}
