package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Usuario;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario uVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "INSERT INTO Usuario (Nome, Email, Endereco, CPF, Telefone, Usuario, Senha, fk_PerfildeAcesso_IDPerfildeAcesso) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uVO.getNome());
            pst.setString(2, uVO.getEmail());
            pst.setString(3, uVO.getEndereco());
            pst.setString(4, uVO.getCpf());
            pst.setString(5, uVO.getTelefone());
            pst.setString(6, uVO.getUsuario());
            pst.setString(7, uVO.getSenha());
            pst.setInt(8, uVO.getPerfilDeAcessoId());

            pst.execute();
            System.out.println("Usuario cadastrado com sucesso!!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Usuario.\n" + e.getMessage());
        }
    }

    public ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> usuarioS = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Usuario";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Usuario us = new Usuario();
                us.setIdUsuario(rs.getInt("IDUsuario"));
                us.setNome(rs.getString("Nome"));
                us.setEmail(rs.getString("Email"));
                us.setEndereco(rs.getString("Endereco"));
                us.setCpf(rs.getString("CPF"));
                us.setTelefone(rs.getString("Telefone"));
                us.setUsuario(rs.getString("Usuario"));
                us.setSenha(rs.getString("Senha"));
                us.setPerfilDeAcessoId(rs.getInt("fk_PerfildeAcesso_IDPerfildeAcesso"));
                usuarioS.add(us);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Usuario.\n"
                    + e.getMessage());
        }
        return usuarioS;
    }

    public void atualizarUsuario(Usuario uVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "UPDATE Usuario SET Nome = ?, Email = ?, Endereco = ?, CPF = ?, Telefone = ?, Usuario = ?, Senha = ?, fk_PerfildeAcesso_IDPerfildeAcesso = ? WHERE IDUsuario = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uVO.getNome());
            pst.setString(2, uVO.getEmail());
            pst.setString(3, uVO.getEndereco());
            pst.setString(4, uVO.getCpf());
            pst.setString(5, uVO.getTelefone());
            pst.setString(6, uVO.getUsuario());
            pst.setString(7, uVO.getSenha());
            pst.setInt(8, uVO.getPerfilDeAcessoId());
            pst.setInt(9, uVO.getIdUsuario());

            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar Usuario.\n"
                    + e.getMessage());
        }
    }

    public boolean deletarUsuario(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from usuario where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o usuario.\n" + e.getMessage());
        }
        return true;
    }

    public Usuario getUsuarioById(int id) {
        Usuario us = new Usuario();

        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Usuario WHERE IDUsuario = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                us = new Usuario();
                us.setIdUsuario(rs.getInt("IDUsuario"));
                us.setNome(rs.getString("Nome"));
                us.setEmail(rs.getString("Email"));
                us.setEndereco(rs.getString("Endereco"));
                us.setCpf(rs.getString("CPF"));
                us.setTelefone(rs.getString("Telefone"));
                us.setUsuario(rs.getString("Usuario"));
                us.setSenha(rs.getString("Senha"));
                us.setPerfilDeAcessoId(rs.getInt("fk_PerfildeAcesso_IDPerfildeAcesso"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o Usuario.\n"
                    + e.getMessage());
        }
        return us;
    }

}
