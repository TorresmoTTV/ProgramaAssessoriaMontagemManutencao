package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import model.Usuario;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario uVO) throws SQLException {
        String sql = "INSERT INTO Usuario (Nome, Email, Endereco, CPF, Telefone, Usuario, Senha, fk_PerfildeAcesso_IDPerfildeAcesso) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, uVO.getNome());
            pst.setString(2, uVO.getEmail());
            pst.setString(3, uVO.getEndereco());
            pst.setString(4, uVO.getCpf());
            pst.setString(5, uVO.getTelefone());
            pst.setString(6, uVO.getUsuario());
            pst.setString(7, uVO.getSenha());
            pst.setInt(8, uVO.getPerfilDeAcessoId());

            pst.execute();
        }
    }

    public List<Usuario> getUsuarios() throws SQLException {
        String sql = "SELECT * FROM Usuario";
        List<Usuario> usuarioS = new ArrayList<>();

        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("IDUsuario"));
                usuario.setNome(rs.getString("Nome"));
                usuario.setEmail(rs.getString("Email"));
                usuario.setEndereco(rs.getString("Endereco"));
                usuario.setCpf(rs.getString("CPF"));
                usuario.setTelefone(rs.getString("Telefone"));
                usuario.setUsuario(rs.getString("Usuario"));
                usuario.setSenha(rs.getString("Senha"));
                usuario.setPerfilDeAcessoId(rs.getInt("fk_PerfildeAcesso_IDPerfildeAcesso"));

                usuarioS.add(usuario);
            }
        }
        return usuarioS;
    }

    public void atualizarUsuario(Usuario uVO) throws SQLException {
        String sql = "UPDATE Usuario SET Nome = ?, Email = ?, Endereco = ?, CPF = ?, Telefone = ?, Usuario = ?, Senha = ?, fk_PerfildeAcesso_IDPerfildeAcesso = ? WHERE IDUsuario = ?";
        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
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

    public Usuario getUsuarioById(int id) throws SQLException {
        String sql = "SELECT * FROM Usuario WHERE IDUsuario = ?";
        Usuario usuario = null;

        try (Connection con = Conexao.getConexao();
                PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setIdUsuario(rs.getInt("IDUsuario"));
                usuario.setNome(rs.getString("Nome"));
                usuario.setEmail(rs.getString("Email"));
                usuario.setEndereco(rs.getString("Endereco"));
                usuario.setCpf(rs.getString("CPF"));
                usuario.setTelefone(rs.getString("Telefone"));
                usuario.setUsuario(rs.getString("Usuario"));
                usuario.setSenha(rs.getString("Senha"));
                usuario.setPerfilDeAcessoId(rs.getInt("fk_PerfildeAcesso_IDPerfildeAcesso"));
            }
        }
        return usuario;
    }

}
