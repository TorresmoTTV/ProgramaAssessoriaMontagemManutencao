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
            // IDUsuario / Nome / Email / Endereco / CPF / Telefone / Usuario / Senha / Tipo
            // / fk_Projeto_ProjetoID
            String sql = "insert into usuario values"
                    + "(null, ?, ?, ?, ?, ?, ?, ?, null, null)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uVO.getNome());
            pst.setString(2, uVO.getEmail());
            pst.setString(3, uVO.getEndreco());
            pst.setInt(4, uVO.getCPF());
            pst.setInt(5, uVO.getTelefone());
            pst.setString(6, uVO.getUsuario());
            pst.setString(7, uVO.getSenha());
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Usuario.\n" + e.getMessage());
        }
    }

    public ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from usuario";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdusuario(rs.getInt("idusuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setEndreco(rs.getString("endereco"));
                usuario.setCPF(rs.getInt("CPF"));
                usuario.setTelefone(rs.getInt("telefone"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipo(rs.getInt("tipo"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar o Usuario.\n"
                    + e.getMessage());
        }
        return usuarios;
    }

    public void atualizarUsuario(Usuario uVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update usuario set nome = ?,"
                    + "email = ?"
                    + "endereco = ?"
                    + "CPF = ?"
                    + "telefone = ?"
                    + "usuario = ?"
                    + "senha = ?"
                    + " where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, uVO.getNome());
            pst.setString(2, uVO.getEmail());
            pst.setString(3, uVO.getEndreco());
            pst.setInt(4, uVO.getCPF());
            pst.setInt(5, uVO.getTelefone());
            pst.setString(6, uVO.getUsuario());
            pst.setString(7, uVO.getSenha());
        } catch (SQLException e) {
            System.out.println("Erro ao editar Usuario.\n" + e.getMessage());
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
        Usuario u = new Usuario();
        try {
            // IDUsuario / Nome / Email / Endereco / CPF / Telefone / Usuario / Senha / Tipo
            // / fk_Projeto_ProjetoID
            Connection con = Conexao.getConexao();
            String sql = "select * from usuario " + "where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                u.setIdusuario(rs.getInt("id"));
                u.setNome(rs.getString("Nome"));
                u.setEmail(rs.getString("Email"));
                u.setEndreco(rs.getString("Endereco"));
                u.setCPF(rs.getInt("CPF"));
                u.setTelefone(rs.getInt("Telefone"));
                u.setUsuario(rs.getString("Usuario"));
                u.setSenha(rs.getString("Senha"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar usuario.\n" + e.getMessage());
        }
        return u;
    }

}
