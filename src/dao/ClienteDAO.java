package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conexao;
import model.Cliente;

public class ClienteDAO {

    public void cadastrarCliente(Cliente cVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into usuario (nome, cpf, endereco, email, telefone, usuario, senha) "
                    + "(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setInt(2, cVO.getCPF());
            pst.setString(3, cVO.getEndreco());
            pst.setString(4, cVO.getEmail());
            pst.setInt(5, cVO.getTelefone());
            pst.setString(6, cVO.getUsuario());
            pst.setString(7, cVO.getSenha());
            pst.execute();
            System.out.println("Cliente cadastrado com sucesso!!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Cliente.\n" + e.getMessage());
        }
    }

    public void atualizarCliente(Cliente cVO) {
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
            pst.setString(1, cVO.getNome());
            pst.setString(2, cVO.getEmail());
            pst.setString(3, cVO.getEndreco());
            pst.setInt(4, cVO.getCPF());
            pst.setInt(5, cVO.getTelefone());
            pst.setString(6, cVO.getUsuario());
            pst.setString(7, cVO.getSenha());
            pst.setInt(8, cVO.getIdusuario());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar Cliente.\n" + e.getMessage());
        }
    }

    public boolean deletarCliente(int id) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from usuario where id = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            return pst.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o cliente.\n" + e.getMessage());
        }
        return true;
    }

    public Cliente getClienteById(int id) {
        Cliente c = new Cliente();
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
            System.out.println("Erro ao buscar Cliente.\n" + e.getMessage());
        }
        return c;
    }
}
