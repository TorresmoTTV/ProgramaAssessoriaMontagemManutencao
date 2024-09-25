package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import model.Administrador;

public class AdministradorDAO {

    public void cadastrarAdministrador(Administrador aVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into usuario (nome, cpf, endereco, email, telefone, usuario, senha) "
                    + "(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getNome());
            pst.setInt(2, aVO.getCPF());
            pst.setString(3, aVO.getEndreco());
            pst.setString(4, aVO.getEmail());
            pst.setInt(5, aVO.getTelefone());
            pst.setString(6, aVO.getUsuario());
            pst.setString(7, aVO.getSenha());
            pst.execute();
            System.out.println("Administrador cadastrado com sucesso!!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Administrador.\n" + e.getMessage());
        }
    }

    public void atualizarAdministrador(Administrador aVO) {
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
            pst.setString(1, aVO.getNome());
            pst.setString(2, aVO.getEmail());
            pst.setString(3, aVO.getEndreco());
            pst.setInt(4, aVO.getCPF());
            pst.setInt(5, aVO.getTelefone());
            pst.setString(6, aVO.getUsuario());
            pst.setString(7, aVO.getSenha());
            pst.setInt(8, aVO.getIdusuario());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar Administrador.\n" + e.getMessage());
        }
    }

    public boolean deletarAdministrador(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from usuario where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o Administrador.\n" + e.getMessage());
        }
        return true;
    }

    public Administrador getAdministradorById(int id) {
        Administrador c = new Administrador();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from usuario " + "where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                c.setIdusuario(rs.getInt("IDUsuario"));
                c.setNome(rs.getString("Nome"));
                c.setCPF(rs.getInt("CPF"));
                c.setEmail(rs.getString("Email"));
                c.setEndreco(rs.getString("Endereco"));
                c.setTelefone(rs.getInt("Telefone"));
                c.setUsuario(rs.getString("Usuario"));
                c.setSenha(rs.getString("Senha"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar Administrador.\n" + e.getMessage());
        }
        return c;
    }
}
